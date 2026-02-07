import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ13: Grid = Map(
)

val sentencesQ13 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ13 = runWorld(worldQ13, sentencesQ13)
