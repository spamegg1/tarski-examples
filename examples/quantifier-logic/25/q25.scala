import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ25: Grid = Map(
)

val sentencesQ25 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ25 = runWorld(worldQ25, sentencesQ25)
