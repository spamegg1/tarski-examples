import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ22: Grid = Map(
)

val sentencesQ22 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ22 = runWorld(worldQ22, sentencesQ22)
