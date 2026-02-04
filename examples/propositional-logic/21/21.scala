import tarski.main.*, Sizes.*, Shape.*, Tone.*

val grid21: Grid = Map(
  // add your blocks here!
)

val TuringSentences = Seq(
  fof"¬(Sqr(a) ∧ More(a, b))",
  // add negation normal form here!
  fof"¬(Sqr(a) ∨ ¬More(b, a))",
  // add negation normal form here!
  fof"¬(¬Sqr(a) ∨ ¬More(a, b) ∨ a != b)",
  // The NNF of this one will have no negation signs in it!
  fof"¬(Tri(b) ∨ (Big(c) ∧ ¬Less(d, e)))",
  // add negation normal form here!
  fof"Cir(f) ∨ ¬(Tri(b) ∨ ¬Tri(f) ∨ ¬Cir(f))"
  // add negation normal form here!
)

@main
def run21 = runWorld(grid21, TuringSentences)
