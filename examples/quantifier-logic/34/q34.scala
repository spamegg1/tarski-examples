import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ34: Grid = Map(
)

val sentencesQ34 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ34 = runWorld(worldQ34, sentencesQ34)
