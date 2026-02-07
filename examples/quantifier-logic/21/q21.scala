import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ21: Grid = Map(
)

val sentencesQ21 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ21 = runWorld(worldQ21, sentencesQ21)
