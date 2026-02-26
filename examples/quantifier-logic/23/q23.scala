import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ23a: Grid = Map(
  // add blocks here!
)

val worldQ23b: Grid = Map(
  // add blocks here!
)

val sentencesQ23 =
  BuridanSentences :+ fof"∃x ∃y (x != y ∧ Tri(x) ∧ Tri(y) ∧ Mid(x) ∧ Mid(y))"

// First ten sentences should be true, last sentence should be false here:
@main
def runQ23a = runWorld(worldQ23a, sentencesQ23)

// All 11 sentences should be true here:
@main
def runQ23b = runWorld(worldQ23b, sentencesQ23)
