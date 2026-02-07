import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ45: Grid = Map(
)

val sentencesQ45 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ45 = runWorld(worldQ45, sentencesQ45)
