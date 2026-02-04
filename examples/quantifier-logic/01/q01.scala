import tarski.main.*, Sizes.*, Shape.*, Tone.*

val PeirceWorld: Grid = Map(
  (0, 4) -> Block(Big, Sqr, Blu),
  (1, 0) -> Block(Mid, Sqr, Red),
  (2, 2) -> Block(Sml, Sqr, Lim),
  (2, 7) -> Block(Sml, Tri, Blu),
  (3, 2) -> Block(Mid, Sqr, Red),
  (3, 6) -> Block(Sml, Tri, Lim),
  (4, 0) -> Block(Sml, Sqr, Blu),
  (5, 0) -> Block(Mid, Sqr, Red),
  (5, 3) -> Block(Sml, Tri, Lim),
  (5, 4) -> Block(Sml, Tri, Blu),
  (5, 7) -> Block(Sml, Tri, Red),
  (7, 4) -> Block(Big, Sqr, Lim)
)

val PeirceSentences1 = Seq(
  fof"∀x Sqr(x)",
  fof"∀x ¬Cir(x)",
  fof"∀x ¬Sml(x)",
  fof"¬(∀x Sml(x))",
  fof"∃x Tri(x)",
  fof"∃x Cir(x)",
  fof"∃x ¬Big(x)",
  fof"¬(∃y Big(y))",
  fof"∃x Blu(x)",
  fof"∃x ¬Lim(x)",
  fof"∃x Abv(x,x)",
  fof"∀x (Sqr(x) ∨ Tri(x))",
  fof"∀x (Sqr(x) ∧ Tri(x))",
  fof"∀x (Big(x) → Sqr(x))",
  fof"∀x (Mid(x) → Sqr(x))",
  fof"∀x (Sml(x) → Tri(x))",
  fof"∃x Tri(x) → ∃x Big(x)",
  fof"∃x (Tri(x) → Red(x))",
  fof"∃x Blu(x) → ∃x Tri(x)",
  fof"∀x (Mid(x) → Red(x))"
)

val PeirceSentences2 = Seq(
  fof"∃x (Tri(x) ∧ Big(x))",
  fof"¬ ∃x (Cir(x) ∧ Sml(x))",
  fof"∃y (Sqr(y) ∧ Sml(y))",
  fof"∃w (Sqr(w) ∧ Blu(w))",
  fof"∃x (Mid(x) ∧ Tri(x))",
  fof"∃x (Mid(x) ∧ Red(x))",
  fof"∀x ((Sml(x) ∧ Big(x)) → Cir(x))",
  fof"∀x ((Big(x) ∧ Blu(x)) → Sqr(x))",
  fof"∃x Tri(x) ∧ ∃y Tri(y) ∧ ∃z Tri(z) ∧ ∃u Tri(u)",
  fof"∀x (Sqr(x) ↔ ¬Tri(x))",
  fof"∀x (Sqr(x) ↔ Big(x))",
  fof"∀x (Red(x) ↔ Sqr(x))",
  fof"∀x Sqr(x) ↔ ∀x Big(x)",
  fof"∀x Sqr(x) ↔ ∀y Sqr(y)",
  fof"∀x Red(x) ↔ ∀x Sqr(x)",
  fof"¬(∀x Sqr(x)) ↔ ∀x (¬Sqr(x))",
  fof"¬(∃y Tri(y)) ↔ ∃y (¬Tri(y))",
  fof"¬(∀x Sqr(x)) ↔ ∃x (¬Sqr(x))",
  fof"¬(∃y Cir(y)) ↔ ∀v (¬Cir(v))",
  fof"¬(∃x Cir(x)) ↔ ∃x (¬Cir(x))"
)

@main
def runq01a = runWorld(PeirceWorld, PeirceSentences1)

@main
def runq01b = runWorld(PeirceWorld, PeirceSentences2)

// Play the game if you are confused about any formula:
@main
def playq01 = playGame(PeirceWorld, ???) // add formula
