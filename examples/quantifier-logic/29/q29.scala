import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ29: Grid = Map(
)

val sentencesQ29 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ29 = runWorld(worldQ29, sentencesQ29)
