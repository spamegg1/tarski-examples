import tarski.main.*, Sizes.*, Shape.*, Tone.*

val ReichenbachWorld2: Grid = Map(
  (0, 4) -> Block(Big, Cir, Lim),
  (4, 0) -> Block(Sml, Sqr, Blu),
  (4, 1) -> Block(Sml, Sqr, Red),
  (4, 2) -> Block(Sml, Cir, Lim),
  (7, 2) -> Block(Sml, Tri, Blu),
  (7, 4) -> Block(Mid, Cir, Red),
  (7, 6) -> Block(Sml, Tri, Lim)
)
