import tarski.main.*, Sizes.*, Shape.*, Tone.*

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

val worldQ27: Grid = Map(
  // add your blocks here!
)

@main
def runQ27 = runWorld(worldQ27, WhiteheadSentences)

// Play the game for various worlds and sentences.
// Change your world above to experiment with different sentences and commitments.
@main
def playQ27 = playGame(worldQ27, fof"∀x (Big(x) ↔ Loc(x, a))") // add sentence here
