import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ19: Grid = Map(
)

val sentencesQ19 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ19 = runWorld(worldQ19, sentencesQ19)
