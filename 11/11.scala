import tarski.main.*, Sizes.*, Shape.*, Tone.*

val MontagueWorld: Grid = Map(
  (3, 0) -> Block(Mid, Sqr, Lim, "a"),
  (3, 2) -> Block(Big, Sqr, Red, "d"),
  (3, 5) -> Block(Sml, Cir, Blu, "b"),
  (6, 2) -> Block(Sml, Tri, Red, "c")
)

val sentences11 = Seq(
  // add your sentences here! ¬∨∧→↔∀∃
)

@main
def run11 = runWorld(MontagueWorld, sentences11)

// If you struggle with conditionals, play the game committed to true.
@main
def play11 = playGame(MontagueWorld, ???) // add formula here
