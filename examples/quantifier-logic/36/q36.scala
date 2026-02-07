import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ36: Grid = Map(
)

val sentencesQ36 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ36 = runWorld(worldQ36, sentencesQ36)
