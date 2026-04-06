import tarski.main.*, Sizes.*, Shape.*, Tone.*

val MarpleWorld: Grid = Map(
  (0, 0) -> Block(Sml, Cir, Red),
  (0, 3) -> Block(Mid, Cir, Blu),
  (0, 7) -> Block(Big, Cir, Lim),
  (3, 5) -> Block(Sml, Sqr, Blu),
  (4, 3) -> Block(Sml, Sqr, Lim),
  (6, 0) -> Block(Sml, Tri, Red),
  (6, 7) -> Block(Sml, Tri, Red)
)

val MarpleSentences = Seq(
  fof"Shp(b, c)",
  fof"Tri(d) ∧ ∃x (Mor(x, c) ∧ Col(x, d))",
  fof"Cir(a) ∧ Col(a, b)",
  fof"Bel(b, c)",
  fof"∃x ∃y (Shp(x, f) ∧ Shp(x, y) ∧ Mor(x, y) ∧ Mor(x, f))",
  fof"∀x ∀y ((Lft(x, y) ∧ Eq(x, y) ∧ Row(x, y)) → x = e)"
)

@main
def runQ47 = runWorld(MarpleWorld, MarpleSentences)
