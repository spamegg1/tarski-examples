import tarski.main.*, Sizes.*, Shape.*, Tone.*

val SkolemWorld: Grid = Map(
  (0, 1) -> Block(Big, Sqr, Blu),
  (0, 6) -> Block(Big, Tri, Red),
  (3, 1) -> Block(Mid, Sqr, Blu),
  (3, 6) -> Block(Mid, Tri, Red),
  (6, 1) -> Block(Sml, Sqr, Blu),
  (6, 6) -> Block(Sml, Tri, Red)
)

val sentencesQ35 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ35a = runWorld(PeanoWorld, sentencesQ35)

@main
def runQ35b = runWorld(BolzanoWorld, sentencesQ35)

@main
def runQ35c = runWorld(SkolemWorld, sentencesQ35)

@main
def runQ35d = runWorld(MontagueWorld, sentencesQ35)
