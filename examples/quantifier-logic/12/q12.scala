import tarski.main.*, Sizes.*, Shape.*, Tone.*

val VonNeumannWorld: Grid = Map(
  (0, 1) -> Block(Sml, Sqr, Blu),
  (1, 6) -> Block(Big, Cir, Lim, "b"),
  (2, 3) -> Block(Sml, Sqr, Blu),
  (3, 0) -> Block(Mid, Tri, Red, "a"),
  (5, 5) -> Block(Sml, Sqr, Blu),
  (6, 5) -> Block(Sml, Sqr, Blu, "c")
)

val sentencesQ12 = Seq(
  fof"∀x (Sqr(x) → Sml(x) ∧ Blu(x))",       // All squares are small and blue.
  fof"∀x (Sqr(x) ∧ Sml(x) → Rgt(x, a))",    // Each small square is to the right of a.
  fof"∀x (Blu(x) ∨ Lim(x) → Lft(a, x))",    // a is to the left of every blue block and every red block.
  fof"∀x (Mid(x) ∧ Tri(x) → Bel(x, b))",    // Every medium triangle is below b.
  fof"∀x (Sqr(x) → Bel(x, b) ∨ Abv(x, a))", // Each square is either below `b` or above a.
  fof"∀x (Sqr(x) → Rgt(x, a) ∧ Lft(x, b))", // Every square is to the right of a and to the left of b.
  fof"∀x (Btw(x, a, b) → Sqr(x))",          // Everything between a and `b` is a square.
  fof"∀x (Les(x, a) → Blu(x))",             // Everything smaller than a is blue.
  fof"∀x (Cir(x) → ¬Sml(x))",               // No circle is small.
  fof"¬ ∀x(Cir(x) → Sml(x))",               // All circles are not small.
  fof"¬ ∀x Adj(a, x)",                      // a does not adjoin everything.
  fof"∀x ¬Adj(a, x)",                       // a does not adjoin anything.
  fof"∀x (Sqr(x) → ¬Rgt(a, x))",            // a is not to the right of any square.
  fof"∀x (Sqr(x) → ¬(Col(x, a) ∨ Col(x, b)))", // If something is a square, then it is not in the same column as either a or b.
  fof"∀x (Sqr(x) ↔ ¬(Col(x, a) ∨ Col(x, b)))" // Something is a square iff it is not in the same column as either a or b.
)

val sentencesQ12a = Seq(
  // add your translations here! ¬∧∨→↔∀∃
)

@main
def runQ12a = runWorld(VonNeumannWorld, sentencesQ12)

@main
def runQ12b = runWorld(WittgensteinWorld, sentencesQ12)

@main
def runQ12c = runWorld(VennWorld, sentencesQ12)
