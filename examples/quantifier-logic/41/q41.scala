import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ41: Grid = Map(
)

val sentencesQ41 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ41 = runWorld(worldQ41, sentencesQ41)
