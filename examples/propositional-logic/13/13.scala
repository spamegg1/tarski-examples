import tarski.main.*, Sizes.*, Shape.*, Tone.*

val world13: Grid = Map(
  // add your world here! syntax is like:
  // (1, 2) -> Block(Sml, Tri, Red)
)

@main
def run13 = runWorld(world13, sentences12)

// In case you need to play the game to figure out a formula
@main
def play13 = playGame(world13, ???) // add formula here
