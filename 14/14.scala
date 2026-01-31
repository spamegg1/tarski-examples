import tarski.main.*, Sizes.*, Shape.*, Tone.*

val BolzanoWorld: Grid = Map(
  (0, 0) -> Block(Big, Cir, Blu, "d"),
  (0, 3) -> Block(Big, Sqr, Blu, "b"),
  (0, 7) -> Block(Sml, Cir, Red),
  (3, 0) -> Block(Mid, Tri, Red),
  (3, 4) -> Block(Mid, Tri, Lim, "e"),
  (5, 2) -> Block(Sml, Sqr, Blu, "c"),
  (7, 0) -> Block(Mid, Tri, Red, "a"),
  (7, 4) -> Block(Mid, Tri, Red)
)

val LeibnizWorld: Grid = Map(
  (1, 0) -> Block(Big, Sqr, Blu),
  (1, 3) -> Block(Big, Tri, Red),
  (1, 6) -> Block(Big, Sqr, Blu),
  (4, 0) -> Block(Mid, Tri, Red, "d"),
  (4, 3) -> Block(Mid, Tri, Red, "e"),
  (4, 6) -> Block(Mid, Tri, Red),
  (7, 0) -> Block(Sml, Sqr, Blu, "a"),
  (7, 3) -> Block(Sml, Tri, Red, "b"),
  (7, 6) -> Block(Sml, Sqr, Blu, "c")
)

val VennWorld: Grid = Map(
  (1, 2) -> Block(Big, Tri, Red, "a"),
  (1, 4) -> Block(Sml, Cir, Lim, "b"),
  (1, 6) -> Block(Big, Sqr, Blu, "f"),
  (2, 0) -> Block(Sml, Tri, Blu, "e"),
  (5, 0) -> Block(Mid, Cir, Lim, "d"),
  (6, 1) -> Block(Sml, Cir, Red, "c")
)

@main
def run14a = runWorld(BolzanoWorld, sentences12)

@main
def run14b = runWorld(WittgensteinWorld, sentences12)

@main
def run14c = runWorld(LeibnizWorld, sentences12)

@main
def run14d = runWorld(VennWorld, sentences12)
