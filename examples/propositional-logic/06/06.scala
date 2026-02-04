import tarski.main.*, Sizes.*, Shape.*, Tone.*

val BooleWorld: Grid = Map(
  (7, 0) -> Block(Mid, Tri, Blu, "c"),
  (5, 2) -> Block(Sml, Cir, Lim, "e"),
  (4, 3) -> Block(Sml, Cir, Red, "d"),
  (2, 5) -> Block(Big, Tri, Blu, "a"),
  (2, 7) -> Block(Big, Tri, Lim, "b"),
  (0, 6) -> Block(Big, Cir, Red, "f")
)

val sentences06 = Seq(
  // add your sentences here! ¬∨∧
)

@main
def run06 = runWorld(BooleWorld, sentences06)
