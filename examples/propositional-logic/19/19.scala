import tarski.main.*, Sizes.*, Shape.*, Tone.*

val world19a: Grid = Map(
  // add your blocks here!
)

val world19b: Grid = Map(
  // add your blocks here!
)

val DeMorganSentences = Seq(
  fof"¬(Cir(a) ∨ Tri(a))",
  fof"¬Cir(a) ∧ ¬Tri(a)",
  fof"¬(Sml(b) ∧ Sqr(b))",
  fof"¬Sml(b) ∨ ¬Sqr(b)",
  fof"¬Bel(c,b) ∧ ¬Abv(c,b)",
  fof"¬(Bel(c,b) ∨ Abv(c,b))",
  fof"¬Lft(b,c) ∨ ¬Lft(c,a)",
  fof"¬(Lft(b,c) ∧ Lft(c,a))"
)

@main
def run19a = runWorld(world19a, DeMorganSentences)

@main
def run19b = runWorld(world19b, DeMorganSentences)
