import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ09: Grid = Map(
)

val sentencesQ09 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ09 = runWorld(worldQ09, sentencesQ09)
