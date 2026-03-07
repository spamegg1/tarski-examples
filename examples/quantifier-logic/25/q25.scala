import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ25: Grid = Map(
  // add your blocks here!
)

val OckhamSentences = Seq(
  fof"∃x (Tri(x) ∧ Big(x))",
  fof"∃x ∃y (More(x, y) ∧ ¬Big(x))",
  fof"∀x ∀y ((Cir(x) ∧ Cir(y)) → x = y)",
  fof"¬ ∀y (Sqr(y) → Sml(y))",
  fof"∀x (Big(x) ↔ Tri(x))",
  fof"∀x ∀y (More(x, y) → Abv(x, y))",
  fof"∃x ∃y (Sqr(x) ∧ Tri(y) ∧ Left(x, y) ∧ Less(x, y))",
  fof"∃x ∃y (Sml(x) ∧ Big(y) ∧ ∀z (Btw(z, x, y) ↔ Sqr(z)))",
  fof"∀x (Sml(x) ↔ ∀y (y != x → Left(x, y)))",
  fof"∃x ∃y ∃z (¬Tone(x, y) ∧ ¬Tone(y, z) ∧ ¬Tone(x, z))" // ¬∧∨→↔∀∃
)

@main
def runQ25 = runWorld(worldQ25, OckhamSentences)
