import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ04: Grid = Map(
)

val SchönfinkelSentences = Seq(
  fof"" // ¬∧∨→↔∀∃
)

@main
def run = runWorld(worldQ04, SchönfinkelSentences)
