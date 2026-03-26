import tarski.main.*, Sizes.*, Shape.*, Tone.*

// change this, if needed, so BuridanSentences are true but the new sentence is false:
val worldQ23a: Grid = Map(
  (2, 2) -> Block(Big, Cir, Blu, "c"),
  (2, 4) -> Block(Big, Tri, Red, "a"),
  (3, 4) -> Block(Mid, Cir, Blu, "b"),
  (4, 4) -> Block(Mid, Tri, Lim)
)

// change this, if needed, so BuridanSentences are true and the new sentence is true:
val worldQ23b: Grid = Map(
  (2, 2) -> Block(Big, Cir, Blu, "c"),
  (2, 4) -> Block(Big, Tri, Red, "a"),
  (3, 4) -> Block(Mid, Cir, Blu, "b"),
  (4, 4) -> Block(Mid, Tri, Lim)
)

val sentenceQ23  = fof"∃x ∃y (¬Eq(x, y) ∧ Tri(x) ∧ Tri(y) ∧ Mid(x) ∧ Mid(y))"
val sentencesQ23 = BuridanSentences :+ sentenceQ23

// First ten sentences should be true, last sentence should be false here:
@main
def runQ23a = runWorld(worldQ23a, sentencesQ23)

// All 11 sentences should be true here:
@main
def runQ23b = runWorld(worldQ23b, sentencesQ23)
