import tarski.main.*, Sizes.*, Shape.*, Tone.*

val BernaysSentences = Seq(
  fof"Row(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Col(d,b)",
  // add sentence here! ¬∧∨→↔
  fof"a = d",
  // add sentence here! ¬∧∨→↔
  fof"Size(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Shap(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Tone(a, b)",
  // add sentence here! ¬∧∨→↔
  fof"Abv(c,b)",
  // add sentence here! ¬∧∨→↔
  fof"Left(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Mid(c)",
  // add sentence here! ¬∧∨→↔
  fof"More(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Sqr(a)"
  // add sentence here! ¬∧∨→↔→↔
)

val AckermannWorld: Grid = Map(
  (1, 2) -> Block(Mid, Cir, Lim, "c"),
  (6, 1) -> Block(Sml, Tri, Red, "a"),
  (5, 4) -> Block(Sml, Sqr, Blu, "b"),
  (4, 6) -> Block(Big, Tri, Blu, "d")
)

@main
def run26a = runWorld(AckermannWorld, BernaysSentences)

@main
def run26b = runWorld(BolzanoWorld, BernaysSentences)

@main
def run26c = runWorld(BooleWorld, BernaysSentences)

@main
def run26d = runWorld(LeibnizWorld, BernaysSentences)
