import tarski.main.*

val DeckardSentences = Seq(
  fof"∃x ∃y (¬Shp(x, y) ∧ Btw(a, x, y))",
  fof"∃x ∃z (Btw(x, b, z) ∧ Shp(x, b)) ∧ Col(b, c) ∧ Cir(c)",
  fof"¬ ∃x (Rgt(x, f) ∨ Bel(x, f))",
  fof"∀x ((Shp(x, b) ∧ x != b ∧ ¬Adj(x, b)) → x = e)",
  fof"∀x ∀y ((Adj(x, f) ∧ Adj(y, a) ∧ Adj(y, f) ∧ Bel(x, y)) → y = d)"
)

@main
def runQ48 = runWorld(RebusWorld, DeckardSentences)
