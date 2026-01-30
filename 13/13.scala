import tarski.main.*, Sizes.*, Shape.*, Tone.*

val grid13: Grid = Map(
  // add your world here!
  // (x, y) -> Block(size, shape, tone, label)
)

@main
def run13 = runWorld(grid13, sentences12)

// In case you need to play the game to figure out a formula
@main
def play13 = playGame(grid13, ???) // add formula here
