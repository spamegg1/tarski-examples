import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ11: Grid = Map(
)

val sentencesQ11 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ11 = runWorld(worldQ11, sentencesQ11)
