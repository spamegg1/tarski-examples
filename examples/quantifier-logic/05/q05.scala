import tarski.main.*, Sizes.*, Shape.*, Tone.*

val MaigretWorld: Grid = Map(
  (0, 0) -> Block(Big, Cir, Blu),
  (0, 3) -> Block(Big, Sqr, Red),
  (0, 7) -> Block(Sml, Cir, Lim),
  (3, 0) -> Block(Mid, Tri, Red),
  (3, 4) -> Block(Mid, Tri, Lim),
  (5, 2) -> Block(Sml, Sqr, Blu),
  (7, 0) -> Block(Mid, Tri, Red),
  (7, 4) -> Block(Mid, Tri, Red)
)

val MaigretSentences = Seq(
  fof"Btw(c,a,d) ∧ ¬Tri(c)",
  fof"∃x Abv(x, a) ∧ ∃x Bel(x, c)",
  fof"Bel(a,c) ∧ ¬ ∃x(Abv(x,a) ∧ Bel(x,c))",
  fof"∃x Left(x, d) ↔ Big(b)",
  fof"∃x ∃y (¬Tri(x) ∧ ¬Tri(y) ∧ Btw(b,x,y))",
  fof"Bel(d,b) ∧ Left(d,f)",
  fof"Cir(e) ∧ Lim(f) ∧ Tone(b,a)",
  fof"¬ ∃x Left(x,e) ∨ Big(e)"
)

@main
def runQ05 = runWorld(MaigretWorld, MaigretSentences)
