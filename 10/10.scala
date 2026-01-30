import tarski.main.*, Sizes.*, Shape.*, Tone.*

val SherlockWorld: Grid = Map(
  (0, 0) -> Block(Sml, Cir, Lim),
  (0, 3) -> Block(Mid, Cir, Blu),
  (3, 5) -> Block(Sml, Sqr, Blu),
  (4, 3) -> Block(Sml, Sqr, Red),
  (7, 1) -> Block(Sml, Tri, Red),
  (7, 3) -> Block(Big, Tri, Lim)
)

val SherlockSentences = Seq(
  fof"Tri(b) ↔ Tri(c)",
  fof"Cir(b) ↔ Cir(c)",
  fof"Sqr(b) ↔ Sqr(c)",
  fof"Tri(a) ∧ ¬Tri(b)",
  fof"¬Tone(a, b) ∧ ¬Tone(c, b)",
  fof"Bel(a, b) → (Bel(b, c) ∨ Bel(c, b))",
  fof"Left(a, c) → ¬Left(a, b)",
  fof"Abv(b, a) ↔ Abv(c, b)",
  fof"More(a, b) ↔ Size(b, c)",
  fof"Col(a, b) → ¬Row(b, c)"
)

@main
def run10 = runWorld(SherlockWorld, SherlockSentences)
