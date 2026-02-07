import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ30: Grid = Map(
)

val sentencesQ30 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ30 = runWorld(worldQ30, sentencesQ30)
