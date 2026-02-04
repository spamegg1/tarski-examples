import tarski.main.*, Sizes.*, Shape.*, Tone.*

val RebusSentences = Seq(
  fof"Sqr(a) ∧ Sqr(b) ∧ Sqr(c)",
  fof"Cir(e) ∧ Cir(f)",
  fof"Left(a,b) → (Left(e,f) ∨ Left(f,e))",
  fof"Btw(a, b, c)",
  fof"¬Adj(e, f)",
  fof"Col(b,e) ∨ Col(c,e)",
  fof"Btw(f,e,d) ∧ Tone(e,d)"
)

val RebusWorld: Grid = Map(
  (0, 1) -> Block(Mid, Cir, Blu),
  (1, 2) -> Block(Mid, Cir, Red),
  (4, 1) -> Block(Sml, Sqr, Lim),
  (4, 2) -> Block(Sml, Sqr, Blu),
  (4, 4) -> Block(Sml, Sqr, Red),
  (6, 6) -> Block(Sml, Tri, Lim),
  (6, 7) -> Block(Sml, Tri, Blu),
  (7, 6) -> Block(Sml, Tri, Red),
  (7, 7) -> Block(Sml, Tri, Blu)
)

@main
def run28 = runWorld(RebusWorld, RebusSentences)
