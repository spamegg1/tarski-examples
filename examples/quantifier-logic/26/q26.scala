import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ26: Grid = Map(
  // add your blocks here!
)

val ArnaultSentences = Seq(
  fof"∃x ∃y ∃z (Sqr(x) ∧ Cir(y) ∧ Tri(z) ∧ Blu(x) ∧ Lim(y) ∧ Red(z))",
  fof"¬ ∃x Big(x)",
  fof"∀x (Tri(x) → ∃y (Sqr(y) ∧ Abv(x, y)))",
  fof"∀x ∀y ∀z (Btw(x, y, z) → Mor(x, y))",
  fof"∃x ∃y (¬Loc(x, y) ∧ ∀w ((w = x ∨ w = y) → ∀z ¬Abv(z, w)))",
  fof"∀x (Sqr(x) ↔ ∃y (Tri(y) ∧ Abv(y, x)))",
  fof"∀x ∀y (Mor(x, y) → ∃z Btw(x, y, z))",
  fof"¬ ∀x ∀y (Left(x, y) ∨ Rgt(x, y))",
  fof"∃x ∃y ¬(Bel(x, y) ∨ Abv(x, y))"
)

@main
def runQ26 = runWorld(worldQ26, ArnaultSentences)
