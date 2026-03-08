import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ27: Grid = Map(
  // add your blocks here!
)

val WhiteheadSentences = Seq(
  fof"∃x ∃y ¬Loc(x, y)",                                              // at least 2
  fof"∀x ∀y ∀z (Loc(x, y) ∨ Loc(y, z) ∨ Loc(x, z))",                  // at most 2
  fof"(∃x ∃y ¬Loc(x,y)) ∧ ∀x ∀y ∀z (Loc(x,y) ∨ Loc(y,z) ∨ Loc(x,z))", // exactly 2
  fof"∃x ∃y (¬Loc(x, y) ∧ ∀z (Loc(y, z) ∨ Loc(x, z)))",               // exactly 2
  fof"∃x ∃y ∃z (¬Loc(x, y) ∧ ¬Loc(y, z))",                            // at least 3?
  fof"∃x ∃y ∃z (¬Loc(x, y) ∧ ¬Loc(y, z) ∧ ¬Loc(x, z))",               // at least 3
  fof"∀x (Big(x) ↔ Loc(x, a))",                                       // unique big
  fof"∃y ∀x (Big(x) ↔ Loc(x, y))",                                    // unique big
  fof"∃y ∀x (Cir(x) ↔ Loc(x, y))",                                    // unique circle
  fof"∃y ∀x ((Cir(x) ∧ Red(x)) ↔ Loc(x, y))",                         // unique red cir
  fof"∃x ∃y (¬Loc(x, y) ∧ Cir(x) ∧ Cir(y))",                          // at least 2 cir
  fof"∃x (Cir(x) ∧ ∀y (Cir(y) → Loc(x, y)))",                         // unique circle
  fof"∃x ∃y (¬Loc(x,y) ∧ ∀z (Tri(z) ↔ (Loc(z,x) ∨ Loc(z,y))))"        // exactly 2 tri
)

@main
def runQ27 = runWorld(worldQ27, WhiteheadSentences)

// Play the game for sentence 7 in WhiteheadSentences.
// World with 3 small objects, committed to True:
val worldQ27a: Grid = Map(
  (2, 2) -> Block(Sml, Sqr, Red, "a"),
  (3, 3) -> Block(Sml, Tri, Blu),
  (4, 4) -> Block(Sml, Cir, Red)
)
@main
def playQ27a = playGame(worldQ27a, fof"∀x (Big(x) ↔ Loc(x, a))")

// Now make `a` Big, committed to False:
val worldQ27b: Grid = Map(
  (2, 2) -> Block(Big, Sqr, Red, "a"),
  (3, 3) -> Block(Sml, Tri, Blu),
  (4, 4) -> Block(Sml, Cir, Red)
)
@main
def playQ27b = playGame(worldQ27b, fof"∀x (Big(x) ↔ Loc(x, a))")
