import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ42: Grid = Map(
)

val sentencesQ42 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ42 = runWorld(worldQ42, sentencesQ42)
