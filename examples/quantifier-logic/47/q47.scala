import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ47: Grid = Map(
)

val sentencesQ47 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ47 = runWorld(worldQ47, sentencesQ47)
