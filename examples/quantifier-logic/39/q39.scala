import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ39: Grid = Map(
)

val sentencesQ39 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ39 = runWorld(worldQ39, sentencesQ39)
