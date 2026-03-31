import tarski.main.*, Sizes.*, Shape.*, Tone.*

val CarrollWorld: Grid = Map(
  (0, 1) -> Block(Big, Cir, Lim),
  (0, 3) -> Block(Big, Cir, Lim),
  (2, 3) -> Block(Mid, Sqr, Blu),
  (5, 6) -> Block(Sml, Cir, Lim),
  (6, 5) -> Block(Mid, Sqr, Blu),
  (7, 4) -> Block(Sml, Cir, Lim)
)

val HerculesSentences = Seq(
  fof"∀x ((x = a ∨ x = d) → ∃y ∃z Btw(x, y, z))", // this lets you determine `d`
  fof"Eq(e, c) ↔ Eq(a, d)",
  fof"∀x (¬ ∃y Les(y, x) → (x = c ∨ x = d ∨ x = e))", // understand the first 2 for this.
  fof"Cir(b) ∧ ∃v (Cir(v) ∧ Lft(b, v))",
  fof"∃v (Cir(f) ∧ Cir(v) ∧ Abv(f, v))",
  fof"∃x (Abv(x, e) ∧ ∃y (Abv(y, x) ∧ ∃z Abv(z, y)))",
  fof"∀y (y = b → (¬ ∃x Btw(x, y, f) ∧ (Eq(y, f) ∨ Eq(y, c))))",
  fof"∃x (Cir(x) ∧ Abv(x, a) ∧ ∀y (Cir(y) ∧ Abv(y, a) → Eq(x, y)))",
  fof"∃x Btw(x, e, c)"
)

@main
def runQ34 = runWorld(CarrollWorld, HerculesSentences)
