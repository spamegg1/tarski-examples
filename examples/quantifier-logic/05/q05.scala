import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ05: Grid = Map(
)

val sentencesQ05 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ05 = runWorld(worldQ05, sentencesQ05)
