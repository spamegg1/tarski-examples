import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ14: Grid = Map(
)

val sentencesQ14 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ14 = runWorld(worldQ14, sentencesQ14)
