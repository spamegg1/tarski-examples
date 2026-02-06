import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ07: Grid = Map(
)

val sentencesQ07 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ07 = runWorld(worldQ07, sentencesQ07)
