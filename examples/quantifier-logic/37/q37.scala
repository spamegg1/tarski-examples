import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ37: Grid = Map(
)

val sentencesQ37 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ37 = runWorld(worldQ37, sentencesQ37)
