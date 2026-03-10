import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ25: Grid = Map(
  // add your blocks here!
)

val OckhamSentences = Seq(
  fof"∃x (Tri(x) ∧ Big(x))",
  fof"∃x ∃y (Mor(x, y) ∧ ¬Big(x))",
  fof"∀x ∀y ((Cir(x) ∧ Cir(y)) → x = y)",
  fof"¬ ∀y (Sqr(y) → Sml(y))",
  fof"∀x (Big(x) ↔ Tri(x))",
  fof"∀x ∀y (Mor(x, y) → Abv(x, y))",
  fof"∃x ∃y (Sqr(x) ∧ Tri(y) ∧ Lft(x, y) ∧ Les(x, y))",
  fof"∃x ∃y (Sml(x) ∧ Big(y) ∧ ∀z (Btw(z, x, y) ↔ Sqr(z)))",
  fof"∀x (Sml(x) ↔ ∀y (y != x → Lft(x, y)))",
  fof"∃x ∃y ∃z (¬Ton(x, y) ∧ ¬Ton(y, z) ∧ ¬Ton(x, z))"
)

@main
def runQ25 = runWorld(worldQ25, OckhamSentences)
