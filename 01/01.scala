import tarski.main.*, Sizes.*, Shape.*, Tone.*

val WittgensteinWorld: Grid = Map(
  (0, 1) -> Block(Large, Squ, Blue, "d"),
  (0, 4) -> Block(Large, Cir, Green, "e"),
  (0, 7) -> Block(Large, Tri, Gray, "f"),
  (4, 0) -> Block(Mid, Tri, Blue),
  (4, 3) -> Block(Mid, Squ, Green, "c"),
  (4, 6) -> Block(Mid, Cir, Gray),
  (6, 1) -> Block(Small, Tri, Green, "a"),
  (6, 4) -> Block(Small, Squ, Gray, "b"),
  (6, 7) -> Block(Small, Cir, Blue)
)

val WittgenSteinSentencesA = Seq(
  fof"Large(d)",
  fof"Large(c)",
  fof"Large(f)",
  fof"Mid(c)",
  fof"Mid(b)",
  fof"Mid(f)",
  fof"Larger(c, b)",
  fof"Larger(d, e)",
  fof"Larger(d, f)",
  fof"Larger(a, e)",
  fof"Above(b, e)",
  fof"Above(b, f)",
  fof"Above(f, a)",
  fof"Left(b, a)",
  fof"Left(a, b)",
  fof"Left(a, a)",
  fof"Right(a, b)",
  fof"Right(b, d)",
  fof"Size(d, f)",
  fof"Size(b, c)",
  fof"Shape(b, c)",
  fof"Shape(a, b)",
  fof"Shape(d, d)"
)

val WittgenSteinSentencesB = Seq(
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
