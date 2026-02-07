import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ15: Grid = Map(
)

val sentencesQ15 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ15 = runWorld(worldQ15, sentencesQ15)
