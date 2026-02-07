import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ43: Grid = Map(
)

val sentencesQ43 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ43 = runWorld(worldQ43, sentencesQ43)
