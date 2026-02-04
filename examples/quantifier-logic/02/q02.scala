import tarski.main.*, Sizes.*, Shape.*, Tone.*

val AristotleSentences = Seq(
  fof"∃x (Tri(x) ∧ Big(x))",
  fof"∃x (Tri(x) ∧ Mid(x))",
  fof"∃x (Sqr(x) ∧ ¬Sml(x))",
  fof"∃y (Cir(y) ∧ ¬Big(y))",
  fof"∀x (Sqr(x) → Mid(x))",
  fof"∀x (Cir(x) → Sml(x))",
  fof"∀x (Tri(x) → ¬Sml(x))",
  fof"∀y (Sqr(y) → ¬Tri(y))",
  fof"∀x (Blu(x) → Sqr(x))",
  fof"∀z (Tri(z) → Red(z))",
  fof"∀w (Lim(w) → Cir(w))"
)

val worldQ02: Grid = Map(
  // after modifying the world and making all sentences true,
  // take a screenshot of your world, then type the blocks here!
)

@main
def runQ02 = runWorld(worldQ02, AristotleSentences)
