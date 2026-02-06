import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ10: Grid = Map(
)

val sentencesQ10 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ10 = runWorld(worldQ10, sentencesQ10)
