import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ23: Grid = Map(
)

val sentencesQ23 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ23 = runWorld(worldQ23, sentencesQ23)
