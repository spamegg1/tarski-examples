import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ18: Grid = Map(
  (1, 1) -> Block(Sml, Sqr, Blu, "d"),
  (1, 4) -> Block(Sml, Cir, Lim),
  (2, 3) -> Block(Sml, Cir, Lim),
  (2, 5) -> Block(Big, Tri, Blu, "b"),
  (3, 2) -> Block(Sml, Sqr, Blu),
  (3, 3) -> Block(Mid, Tri, Red, "a"),
  (4, 3) -> Block(Big, Cir, Lim),
  (4, 4) -> Block(Sml, Sqr, Lim, "c"),
  (4, 6) -> Block(Big, Sqr, Red, "e")
)

@main
def runQ18 = runWorld(worldQ18, RamseySentences)
