import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ40: Grid = Map(
)

val sentencesQ40 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ40 = runWorld(worldQ40, sentencesQ40)
