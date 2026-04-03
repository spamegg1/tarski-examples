import tarski.main.*, Sizes.*, Shape.*, Tone.*

val GödelWorld: Grid = Map(
  (0, 0) -> Block(Sml, Cir, Lim),
  (0, 3) -> Block(Mid, Cir, Blu),
  (3, 5) -> Block(Sml, Sqr, Red, "c"),
  (4, 3) -> Block(Sml, Sqr, Lim, "b"),
  (7, 1) -> Block(Sml, Tri, Blu),
  (7, 3) -> Block(Sml, Tri, Red, "a")
)

val sentencesQ39 = Seq(
  // add your sentences here! ~&|-><->~? or ¬∧∨→↔∀∃
)

@main
def runQ39 = runWorld(GödelWorld, sentencesQ39)
