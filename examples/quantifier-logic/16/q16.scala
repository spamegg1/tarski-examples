import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ16: Grid = Map(
)

val sentencesQ16 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ16 = runWorld(worldQ16, sentencesQ16)
