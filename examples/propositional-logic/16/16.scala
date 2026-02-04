import tarski.main.*, Sizes.*, Shape.*, Tone.*

val grid16: Grid = Map(
  // add your blocks here!
)

val sentences16 = Seq(
  fof"¬Sml(a) ∨ Sml(b)",  // should be true
  fof"¬(Sml(a) ∨ Sml(b))" // should be false
)

@main
def run16 = runWorld(grid16, sentences16)
