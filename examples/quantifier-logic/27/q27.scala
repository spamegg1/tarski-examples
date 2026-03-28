import tarski.main.*, Sizes.*, Shape.*, Tone.*

val WhiteheadSentences = Seq(
  fof"∃x ∃y x != y",                                      // at least 2
  fof"∀x ∀y ∀z (x = y ∨ y = z ∨ x = z)",                  // at most 2
  fof"(∃x ∃y x != y) ∧ ∀x ∀y ∀z (x = y ∨ y = z ∨ x = z)", // exactly 2
  fof"∃x ∃y (x != y ∧ ∀z (y = z ∨ x = z))",               // exactly 2
  fof"∃x ∃y ∃z (x != y ∧ y != z)",                        // at least 3?
  fof"∃x ∃y ∃z (x != y ∧ y != z ∧ x != z)",               // at least 3
  fof"∀x (Big(x) ↔ x = a)",                               // unique big
  fof"∃y ∀x (Big(x) ↔ x = y)",                            // unique big
  fof"∃y ∀x (Cir(x) ↔ x = y)",                            // unique circle
  fof"∃y ∀x ((Cir(x) ∧ Red(x)) ↔ x = y)",                 // unique red cir
  fof"∃x ∃y (x != y ∧ Cir(x) ∧ Cir(y))",                  // at least 2 cir
  fof"∃x (Cir(x) ∧ ∀y (Cir(y) → x = y))",                 // unique circle
  fof"∃x ∃y (x != y ∧ ∀z (Tri(z) ↔ (z = x ∨ z = y)))"     // exactly 2 tri
)

val worldQ27: Grid = Map(
  // add your blocks here!
)

@main
def runQ27 = runWorld(worldQ27, WhiteheadSentences)

// Play the game for various worlds and sentences.
// Change your world above to experiment with different sentences and commitments.
@main
def playQ27 = playGame(worldQ27, fof"∀x (Big(x) ↔ x = a)") // add sentence here
