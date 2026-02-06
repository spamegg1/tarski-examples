import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ08: Grid = Map(
)

val sentencesQ08 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ08 = runWorld(worldQ08, sentencesQ08)
