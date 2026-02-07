import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ32: Grid = Map(
)

val sentencesQ32 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ32 = runWorld(worldQ32, sentencesQ32)
