import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ17: Grid = Map(
  // copied from the solution of the previous example, edit if needed
  // you can use these, or your own solution from Example Q16
  (1, 1) -> Block(Big, Sqr, Blu, "d"),
  (2, 2) -> Block(Sml, Cir, Lim),
  (2, 7) -> Block(Big, Tri, Blu, "b"),
  (3, 1) -> Block(Mid, Tri, Red, "a"),
  (4, 5) -> Block(Big, Sqr, Red, "e"),
  (6, 1) -> Block(Sml, Sqr, Lim, "c"),
  (6, 6) -> Block(Sml, Cir, Blu)
)

val RamseySentences2 = Seq(
  fof"∀x ¬Abv(x, d)",
  fof"∀x ((Sqr(x) ∧ Big(x)) → Loc(x, e))",
  fof"∀x ¬Left(x, d)",
  fof"∀x (¬Loc(x, e) ∧ ¬Loc(x, d) → (Bel(x, e) ∨ Rgt(e, x)))",
  fof"∀x ((Tri(x) ∧ Big(x)) ↔ Loc(x, b))",
  fof"∀x ((Left(x, a) ∧ ¬Sqr(x)) → (Tri(x) ∧ Sml(x)))",
  fof"∀x ∀y ((Mid(x) ∧ Mid(y)) → Loc(x, y))",
  fof"∀x ∀y ((Tri(x) ∧ Tri(y) ∧ ¬Loc(x, y)) → (Loc(x, a) ∨ Loc(y, a)))",
  fof"∀x (Btw(x, c, d) → (Tri(x) ∧ Mid(x)))"
)

val RamseySentences = RamseySentences1 ++ RamseySentences2

@main
def runQ17 = runWorld(worldQ17, RamseySentences)
