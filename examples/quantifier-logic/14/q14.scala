import tarski.main.*, Sizes.*, Shape.*, Tone.*

val PeanoWorld: Grid = Map(
  (0, 6) -> Block(Mid, Sqr, Blu),
  (2, 0) -> Block(Big, Sqr, Blu),
  (2, 2) -> Block(Sml, Cir, Lim),
  (2, 4) -> Block(Big, Tri, Red),
  (4, 1) -> Block(Sml, Cir, Lim),
  (4, 3) -> Block(Sml, Cir, Lim),
  (5, 2) -> Block(Sml, Cir, Lim),
  (5, 4) -> Block(Sml, Cir, Lim),
  (6, 0) -> Block(Sml, Cir, Lim),
  (6, 3) -> Block(Sml, Tri, Red),
  (6, 5) -> Block(Sml, Cir, Lim)
)

val DodgsonSentences = Seq(
  fof"∀x(Tri(x) → Big(x))",
  fof"∀x(Tri(x) → Mid(x))",
  fof"∀x(Tri(x) → Sml(x))",
  fof"∀x(Tri(x) → (Sml(x) ∧ Big(x)))",
  fof"∀x(Tri(x) → Sqr(x))",
  fof"∀x(Cir(x) → Sml(x))"
  // add a sixth sentence here!
)

@main
def runQ14a = runWorld(PeanoWorld, DodgsonSentences)

// Play the game committed to false
@main
def playQ14a = playGame(PeanoWorld, DodgsonSentences.head)

@main
def runQ14b = runWorld(PeirceWorld, DodgsonSentences)

// Play the game committed to false
@main
def playQ14b = playGame(PeirceWorld, DodgsonSentences.head)
