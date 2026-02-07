import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ24: Grid = Map(
)

val sentencesQ24 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ24 = runWorld(worldQ24, sentencesQ24)
