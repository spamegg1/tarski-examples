import tarski.main.*, Sizes.*, Shape.*, Tone.*

val FinslerWorld: Grid = Map(
  (0, 0) -> Block(Big, Sqr, Blu),
  (1, 3) -> Block(Big, Tri, Red),
  (1, 5) -> Block(Big, Tri, Lim),
  (3, 0) -> Block(Mid, Sqr, Lim),
  (3, 2) -> Block(Mid, Tri, Blu),
  (3, 4) -> Block(Sml, Cir, Red),
  (3, 6) -> Block(Mid, Tri, Blu),
  (5, 2) -> Block(Sml, Tri, Lim),
  (5, 6) -> Block(Sml, Tri, Red),
  (6, 0) -> Block(Sml, Sqr, Red),
  (6, 3) -> Block(Sml, Tri, Blu),
  (6, 5) -> Block(Sml, Tri, Lim)
)

val KönigWorld: Grid = Map(
  (1, 0) -> Block(Big, Tri, Red),
  (1, 2) -> Block(Sml, Sqr, Blu),
  (1, 3) -> Block(Sml, Sqr, Blu),
  (1, 4) -> Block(Sml, Sqr, Blu),
  (1, 5) -> Block(Sml, Sqr, Blu),
  (1, 7) -> Block(Big, Cir, Lim),
  (5, 0) -> Block(Mid, Tri, Red),
  (5, 2) -> Block(Sml, Sqr, Blu),
  (5, 3) -> Block(Sml, Sqr, Blu),
  (5, 4) -> Block(Sml, Sqr, Blu),
  (5, 5) -> Block(Sml, Sqr, Blu),
  (5, 7) -> Block(Mid, Cir, Lim)
)

val sentencesQ46 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ46a = runWorld(FinslerWorld, sentencesQ46)

@main
def runQ46b = runWorld(KönigWorld, sentencesQ46)
