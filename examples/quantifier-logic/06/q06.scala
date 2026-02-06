import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ06: Grid = Map(
)

val sentencesQ06 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ06 = runWorld(worldQ06, sentencesQ06)
