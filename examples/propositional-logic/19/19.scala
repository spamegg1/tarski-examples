import tarski.main.*, Sizes.*, Shape.*, Tone.*

val grid19a: Grid = Map(
  // add your blocks here!
)

val grid19b: Grid = Map(
  // add your blocks here!
)

val DeMorganSentences = Seq(
  fof"¬(Cir(a) ∨ Tri(a))",
  fof"¬Cir(a) ∧ ¬Tri(a)",
  fof"¬(Sml(b) ∧ Sqr(b))",
  fof"¬Sml(b) ∨ ¬Sqr(b)",
  fof"¬Bel(c,b) ∧ ¬Abv(c,b)",
  fof"¬(Bel(c,b) ∨ Abv(c,b))",
  fof"¬Left(b,c) ∨ ¬Left(c,a)",
  fof"¬(Left(b,c) ∧ Left(c,a))"
)

@main
def run19a = runWorld(grid19a, DeMorganSentences)

@main
def run19b = runWorld(grid19b, DeMorganSentences)
