import tarski.main.*, Sizes.*, Shape.*, Tone.*

val ReichenbachWorld1: Grid = Map(
  (0, 0) -> Block(Sml, Tri, Red),
  (1, 0) -> Block(Sml, Tri, Blu),
  (4, 3) -> Block(Big, Cir, Lim),
  (4, 5) -> Block(Sml, Cir, Blu),
  (7, 1) -> Block(Sml, Sqr, Lim),
  (7, 3) -> Block(Mid, Cir, Red),
  (7, 6) -> Block(Sml, Sqr, Blu)
)

val sentencesQ09 = Seq(
  // add sentences here! ¬∧∨→↔∀∃
)

@main
def runQ09 = runWorld(ReichenbachWorld1, sentencesQ09)
