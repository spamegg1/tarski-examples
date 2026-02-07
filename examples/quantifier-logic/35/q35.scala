import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ35: Grid = Map(
)

val sentencesQ35 = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def runQ35 = runWorld(worldQ35, sentencesQ35)
