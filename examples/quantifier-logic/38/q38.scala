import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ38: Grid = Map(
)

val sentencesQ38 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ38 = runWorld(worldQ38, sentencesQ38)
