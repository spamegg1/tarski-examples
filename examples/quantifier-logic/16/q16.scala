import tarski.main.*, Sizes.*, Shape.*, Tone.*

val RamseySentences1 = Seq(
  // You only need 1 block to make this one true.
  fof"∃x ∃y (Tri(x) ∧ Tri(y) ∧ Row(x, y))",
  // How many blocks do you need to make this true?
  fof"∃x ∃y (Tri(x) ∧ Tri(y) ∧ More(x, y) ∧ Abv(x, y))",
  fof"Sqr(c) ∧ Sqr(d) ∧ Bel(c, d)",
  fof"Sqr(c) → Tri(a)", // name one of your earlier blocks "a".
  fof"Sqr(d) ∧ Sqr(e) ∧ ¬More(d, e)",
  fof"Red(e) ∧ Tone(d, b) ∧ ¬Tone(c, a)", // name one of your earlier blocks "b".
  fof"∃x (Sqr(x) ∧ ¬Loc(x, d) ∧ ¬Loc(x, e))",
  // Re-position things to make this true without adding new blocks.
  fof"∃x (Tri(x) ∧ Btw(x, c, d))",
  fof"∃x ∃y (Btw(a, x, y) ∧ More(a, x) ∧ Less(a, y))",
  fof"∃x (Sqr(x) ∧ (Big(x) ∨ (¬Loc(x, c) ∧ ¬Loc(x, d))))",
  fof"∃x ∃y ∃z (Sqr(x) ∧ Cir(y) ∧ Cir(z) ∧ Btw(y, x, z) ∧ Left(x, z))"
)

val worldQ16: Grid = Map(
  // add blocks here after figuring them out in the application.
)

@main
def runQ16 = runWorld(worldQ16, RamseySentences1)
