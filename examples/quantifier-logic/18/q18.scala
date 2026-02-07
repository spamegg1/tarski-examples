import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ18: Grid = Map(
)

val sentencesQ18 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ18 = runWorld(worldQ18, sentencesQ18)
