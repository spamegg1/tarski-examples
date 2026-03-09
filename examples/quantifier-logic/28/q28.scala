import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ28: Grid = Map()

val RussellSentences = Seq(
  fof"∃x (Sqr(x) ∧ ∀y (Sqr(y) → Loc(x, y)))",
  fof"∃x (Sqr(x) ∧ ∀y (Sqr(y) → Loc(x, y)) ∧ Red(x))",
  fof"∃x (Tri(x) ∧ ∀y (Tri(y) → Loc(x, y)) ∧ Big(x))",
  fof"∃x (Tri(x) ∧ ∀y (Tri(y) → Loc(x, y)) ∧ x = a)",
  fof"∃x ((Cir(x) ∧ Red(x)) ∧ ∀y ((Cir(y) ∧ Red(y)) → Loc(x, y)) ∧ x = b)",
  fof"∃x ((Cir(x) ∧ Mid(x)) ∧ ∀y ((Cir(y) ∧ Mid(y)) → Loc(x, y)) ∧ x = c)",
  fof"Abv(b, a) ∧ Bel(c, a)",
  fof"Left(b, c)"
)

@main
def runQ28 = runWorld(worldQ28, RussellSentences)
