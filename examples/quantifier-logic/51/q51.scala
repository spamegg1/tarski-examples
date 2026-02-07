import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ51: Grid = Map(
)

val sentencesQ51 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ51 = runWorld(worldQ51, sentencesQ51)
