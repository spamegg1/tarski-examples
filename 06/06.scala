import tarski.main.*, Sizes.*, Shape.*, Tone.*

val BooleWorld: Grid = Map(
  (7, 0) -> Block(Mid, Tri, Blue, "c"),
  (5, 2) -> Block(Small, Cir, Green, "e"),
  (4, 3) -> Block(Small, Cir, Gray, "d"),
  (2, 5) -> Block(Large, Tri, Blue, "a"),
  (2, 7) -> Block(Large, Tri, Green, "b"),
  (0, 6) -> Block(Large, Cir, Gray, "f")
)

val sentences06 = Seq(
  // add your sentences here! ¬∨∧
)

@main
def run06 = runWorld(BooleWorld, sentences06)
