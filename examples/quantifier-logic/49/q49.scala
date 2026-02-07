import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ49: Grid = Map(
)

val sentencesQ49 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ49 = runWorld(worldQ49, sentencesQ49)
