import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ04: Grid = Map(
  (3, 4) -> Block(Mid, Tri, Blu, "a")
)

val SchönfinkelSentences = Seq(
  // you can copy these: ¬∧∨→↔∀∃
  fof"¬Adj(y, y)",        // You can fix this by adding a single quantifier + variable.
  fof"(Tri(w) → Big(w))", // Same here.
  fof"Tri(a) → Big(w)",   // You can't add parens, so put a quantifier in the right place.
  fof"Tri(w) → Big(w)",   // You can't add parens. How many quantifiers needed?
  fof"Big(x) → ¬More(y, x)",
  fof"∀x y ((Sqr(x) ∧ Sqr(y)) → ¬More(x, y))",
  // Only add quantifiers and/or variables. No changing the "a".
  // The resulting sentence is weird, but we'll explain later.
  fof"∀ Sqr(a)",
  // The quantifier here does nothing. Does not bind "y" (wrong variable)
  // and does not bind "x" (out of scope).
  fof"∀x Tri(y) → Sml(x)",
  fof"((Tri(x) ∧ Tri(y)) → Btw(z,x,y))",
  fof"(Tri(x) ∧ Big(x)) → Left(x,y)"
)

@main
def run = runWorld(worldQ04, SchönfinkelSentences)
