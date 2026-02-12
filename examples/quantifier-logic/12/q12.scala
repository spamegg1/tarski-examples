import tarski.main.*, Sizes.*, Shape.*, Tone.*

val ClaireWorld: Grid = Map(
  (0, 1) -> Block(Sml, Sqr, Blu),
  (1, 6) -> Block(Big, Cir, Lim, "b"),
  (2, 3) -> Block(Sml, Sqr, Blu),
  (3, 0) -> Block(Mid, Tri, Red, "a"),
  (5, 5) -> Block(Sml, Sqr, Blu),
  (6, 5) -> Block(Sml, Sqr, Blu, "c")
)

val sentencesQ12 = Seq(
  // add your translations here! ¬∧∨→↔∀∃
)

@main
def runQ12a = runWorld(ClaireWorld, sentencesQ12)

@main
def runQ12b = runWorld(WittgensteinWorld, sentencesQ12)

@main
def runQ12c = runWorld(VennWorld, sentencesQ12)
