import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ03: Grid = Map(
)

val sentencesQ03 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ03 = runWorld(worldQ03, sentencesQ03)
