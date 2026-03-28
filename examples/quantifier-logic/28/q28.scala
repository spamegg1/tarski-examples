import tarski.main.*

val worldQ28: Grid = Map()

val RussellSentences = Seq(
  fof"∃x (Sqr(x) ∧ ∀y (Sqr(y) → x = y))",
  fof"∃x (Sqr(x) ∧ ∀y (Sqr(y) → x = y) ∧ Red(x))",
  fof"∃x (Tri(x) ∧ ∀y (Tri(y) → x = y) ∧ Big(x))",
  fof"∃x (Tri(x) ∧ ∀y (Tri(y) → x = y) ∧ Eq(x, a))",
  fof"∃x ((Cir(x) ∧ Red(x)) ∧ ∀y ((Cir(y) ∧ Red(y)) → x = y) ∧ Eq(x, b))",
  fof"∃x ((Cir(x) ∧ Mid(x)) ∧ ∀y ((Cir(y) ∧ Mid(y)) → x = y) ∧ Eq(x, c))",
  fof"Abv(b, a) ∧ Bel(c, a)",
  fof"Lft(b, c)"
)

@main
def runQ28 = runWorld(worldQ28, RussellSentences)
