import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ44: Grid = Map(
)

val sentencesQ44 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ44 = runWorld(worldQ44, sentencesQ44)
