import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ20: Grid = Map(
)

val sentencesQ20 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ20 = runWorld(worldQ20, sentencesQ20)
