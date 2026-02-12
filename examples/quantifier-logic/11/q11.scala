import tarski.main.*, Sizes.*, Shape.*, Tone.*

val AllanSentences = Seq(
  fof"∃x (Cir(x) ∧ Big(x))",
  fof"∃x (Cir(x) → Big(x))",
  fof"∀x (Tri(x) ∧ Sml(x))",
  fof"∀x (Tri(x) → Sml(x))"
)

// construct a world where 2,4 are true and 1,3 are false, and run `runQ11` below
val worldQ11: Grid = Map(
  // add your blocks here!
)

@main
def runQ11 = runWorld(worldQ11, AllanSentences)
