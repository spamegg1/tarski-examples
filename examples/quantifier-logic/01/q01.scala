import tarski.main.*, Sizes.*, Shape.*, Tone.*

val world: Grid = Map(
)

val sentences = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runq01 = runWorld(world, sentences)
