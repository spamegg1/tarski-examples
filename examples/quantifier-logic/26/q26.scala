import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ26: Grid = Map(
)

val sentencesQ26 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ26 = runWorld(worldQ26, sentencesQ26)
