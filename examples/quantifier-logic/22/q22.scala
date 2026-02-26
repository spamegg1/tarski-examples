import tarski.main.*, Sizes.*, Shape.*, Tone.*

// Solution from the previous example:
val worldQ22: Grid = Map(
  (2, 2) -> Block(Big, Cir, Blu, "c"),
  (2, 4) -> Block(Big, Tri, Red, "a"),
  (3, 4) -> Block(Mid, Cir, Blu, "b"),
  (4, 4) -> Block(Mid, Tri, Lim)
)

val twoSentencesQ22 = Seq(
  // add two sentences here!
  // fof"" // ¬∧∨→↔∀∃
)

val sentencesQ22 = BuridanSentences ++ twoSentencesQ22

@main
def runQ22 = runWorld(worldQ22, sentencesQ22)
