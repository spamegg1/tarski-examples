import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ21: Grid = Map(
  // add your blocks here once you're done!
)

val BuridanSentences = Seq(
  fof"a != b ∧ b != c ∧ a != c",
  fof"More(a, b) ∧ ¬More(a, c)",
  fof"¬ ∃x Sml(x)",
  fof"∀x (¬Sml(x) → ¬Sqr(x))",
  fof"Tri(a) ∧ Cir(b) ∧ Cir(c) ∧ Red(a) ∧ Ton(b, c)",
  fof"∃x (Cir(x) ∧ ∃y ∃z (Tri(y) ∧ Tri(z) ∧ Btw(x, y, z)))",
  fof"∀x (Mid(x) → ∃y Bel(x, y))",
  fof"∀x (∃y Bel(x, y) → Mid(x))",
  fof"∀x (Left(x, c) → (Cir(x) ∨ Big(x)))",
  fof"∀x (∃y Abv(x, y) → (x = a ∨ x = b ∨ x = c))"
)

@main
def runQ21 = runWorld(worldQ21, BuridanSentences)
