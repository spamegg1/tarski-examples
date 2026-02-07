import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ33: Grid = Map(
)

val sentencesQ33 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ33 = runWorld(worldQ33, sentencesQ33)
