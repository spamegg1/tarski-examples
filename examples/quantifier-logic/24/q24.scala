import tarski.main.*, Sizes.*, Shape.*, Tone.*

val HilbertSentences = Seq(
  fof"∃x ∀y Les(x, y)", // Could this ever be true?
  fof"∀x (Cir(x) → ∃y Les(x, y))",
  fof"∃x (Cir(x) ∧ ∀y Les(x, y))",
  fof"∃y ∀x (Cir(x) → Les(x, y))", // Try to say in English. Hard to say unambiguously.
  fof"∃y ∀x (Cir(x) → Les(y, x))",
  fof"∃y ∀x (Cir(x) → ¬Les(x, y))",
  fof"∀x ((Sqr(x) ∧ Mid(x)) → ¬ ∃y Abv(y, x))", // Understand the difference
  fof"∀x ((Sqr(x) ∧ Mid(x)) → ∃y ¬Abv(y, x))",  // between these two.
  fof"∀x ((Sqr(x) ∧ Big(x)) → ¬ ∃y Abv(y, x))",
  fof"∀x ((Sqr(x) ∧ Big(x)) → ∃y ¬Abv(y, x))",
  fof"∃x (Tri(x) ∧ ∀y (Sqr(y) → Abv(y, x)))",
  fof"∃x (Tri(x) ∧ ∀y (Abv(y, x) → Sqr(y)))",
  fof"∃x (Sqr(x) ∧ ∀y (Cir(y) → Les(y, x)))",
  fof"∃x (Sqr(x) ∧ ∀y (Les(y, x) → Cir(y)))",
  fof"∀x ((Tri(x) ∧ ∃y Bel(x, y)) → Sml(x))",
  fof"∀x (¬ ∃y Abv(y, x) → Sqr(x))",
  fof"∀x (¬ ∃y Bel(y, x) → Tri(x))",
  fof"∀x (Tri(x) → ∃y ∃z Btw(x, y, z))", // How do these two differ?
  fof"∃y ∀x (Tri(x) → ∃z Btw(x, y, z))", // They say very different things.
  fof"∃z ∀x (Tri(x) → ∃y Btw(x, y, z))", // How can this be true,
  fof"∃y ∃z ∀x (Tri(x) → Btw(x, y, z))", // and this one false?
  fof"∃y ∀x (Sml(x) → Row(x, y))",
  fof"∀x (Sml(x) → ∃y (¬Loc(x, y) ∧ Row(x, y)))",
  fof"∀x (Sml(x) → ∃y (¬Loc(x, y) ∧ Col(x, y)))"
)

@main
def runQ24 = runWorld(PeanoWorld, HilbertSentences)
