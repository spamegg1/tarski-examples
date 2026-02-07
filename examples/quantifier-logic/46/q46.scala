import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ46: Grid = Map(
)

val sentencesQ46 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ46 = runWorld(worldQ46, sentencesQ46)
