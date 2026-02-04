import tarski.main.*, Sizes.*, Shape.*, Tone.*

val grid17: Grid = Map(
  // add your blocks here!
)

val sentences17 = Seq(
  fof"(Sqr(a) ∧ Sqr(b)) ∨ Sqr(c)", // should be true
  fof"Sqr(a) ∧ (Sqr(b) ∨ Sqr(c))"  // should be false
)

@main
def run17 = runWorld(grid17, sentences17)
