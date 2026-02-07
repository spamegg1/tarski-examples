import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ48: Grid = Map(
)

val sentencesQ48 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ48 = runWorld(worldQ48, sentencesQ48)
