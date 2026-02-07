import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ27: Grid = Map(
)

val sentencesQ27 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ27 = runWorld(worldQ27, sentencesQ27)
