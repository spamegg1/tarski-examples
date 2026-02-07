import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ28: Grid = Map(
)

val sentencesQ28 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ28 = runWorld(worldQ28, sentencesQ28)
