import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ31: Grid = Map(
)

val sentencesQ31 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ31 = runWorld(worldQ31, sentencesQ31)
