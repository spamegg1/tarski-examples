import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ50: Grid = Map(
)

val sentencesQ50 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ50 = runWorld(worldQ50, sentencesQ50)
