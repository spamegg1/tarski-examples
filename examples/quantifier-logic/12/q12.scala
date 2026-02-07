import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ12: Grid = Map(
)

val sentencesQ12 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ12 = runWorld(worldQ12, sentencesQ12)
