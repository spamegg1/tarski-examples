import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ17: Grid = Map(
)

val sentencesQ17 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ17 = runWorld(worldQ17, sentencesQ17)
