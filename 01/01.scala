import tarski.main.*, Sizes.*, Shape.*, Tone.*

val WittgensteinWorld: Grid = Map(
  (0, 1) -> Block(Big, Sqr, Blu, "d"),
  (0, 4) -> Block(Big, Cir, Lim, "e"),
  (0, 7) -> Block(Big, Tri, Red, "f"),
  (4, 0) -> Block(Mid, Tri, Blu),
  (4, 3) -> Block(Mid, Sqr, Lim, "c"),
  (4, 6) -> Block(Mid, Cir, Red),
  (6, 1) -> Block(Sml, Tri, Lim, "a"),
  (6, 4) -> Block(Sml, Sqr, Red, "b"),
  (6, 7) -> Block(Sml, Cir, Blu)
)

val WittgenSteinSentencesA = Seq(
  fof"Big(d)",
  fof"Big(c)",
  fof"Big(f)",
  fof"Mid(c)",
  fof"Mid(b)",
  fof"Mid(f)",
  fof"More(c, b)",
  fof"More(d, e)",
  fof"More(d, f)",
  fof"More(a, e)",
  fof"Above(b, e)",
  fof"Above(b, f)",
  fof"Above(f, a)",
  fof"Left(b, a)",
  fof"Left(a, b)",
  fof"Left(a, a)",
  fof"Right(a, b)",
  fof"Right(b, d)",
  fof"Size(d, f)",
  fof"Size(b, c)"
)

val WittgenSteinSentencesB = Seq(
  fof"Shape(b, c)",
  fof"Shape(a, b)",
  fof"Shape(d, d)",
  fof"Row(a, d)",
  fof"Row(d, e)",
  fof"Row(a, a)",
  fof"Col(a, d)",
  fof"Col(d, e)",
  fof"Col(a, c)",
  fof"Adj(a, b)",
  fof"Adj(b, c)",
  fof"Adj(d, e)",
  fof"Adj(b, b)",
  fof"Betw(d, e, f)",
  fof"Betw(e, d, f)",
  fof"Betw(c, a, f)",
  fof"Betw(c, d, b)",
  fof"Betw(c, b, e)",
  fof"Betw(c, c, c)",
  fof"Betw(c, a, e)"
)

@main
def run01a = runWorld(WittgensteinWorld, WittgenSteinSentencesA)

@main
def run01b = runWorld(WittgensteinWorld, WittgenSteinSentencesB)
