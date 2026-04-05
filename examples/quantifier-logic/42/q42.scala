import tarski.main.*, Sizes.*, Shape.*, Tone.*

val LöwenheimSentences = Seq(
  fof"∃x ∃y (x != y ∧ Col(x, y))", // some of the parties are not lonely
  fof"∃x ∃y (x != y ∧ ¬Col(x, y))",
  fof"∃x ¬ ∃y (x != y ∧ Col(x, y))",
  fof"¬ ∃x ∃y (x != y ∧ Col(x, y))",
  fof"∀x ∀y (x != y → Col(x, y))", // there is only 1 party
  fof"∀x ∀y (x != y → ¬Col(x, y))",
  fof"∀x ¬ ∀y (x != y → Col(x, y))",
  fof"¬ ∀x ∀y (x != y → Col(x, y))"
)

// This world is empty, just for experimenting
val worldQ42: Grid = Map()

// in this world, sentences 3 and 7 should be both true
val worldQ42a: Grid = Map(
)

// in this world, 3 should be true and 7 should be false
val worldQ42b: Grid = Map(
)

// in this world, 3 should be false and 7 should be true
val worldQ42c: Grid = Map(
)

// in this world, sentences 3 and 7 should be both false
val worldQ42d: Grid = Map(
)

@main
def runQ42 = runWorld(worldQ42, LöwenheimSentences) // experiment

@main
def runQ42a = runWorld(worldQ42a, LöwenheimSentences) // 3,7 true

@main
def runQ42b = runWorld(worldQ42b, LöwenheimSentences) // 3 true, 7 false

@main
def runQ42c = runWorld(worldQ42c, LöwenheimSentences) // 3 false, 7 true

@main
def runQ42d = runWorld(worldQ42d, LöwenheimSentences) // 3, 7 false
