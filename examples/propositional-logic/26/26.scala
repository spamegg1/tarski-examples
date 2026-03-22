import tarski.main.*, Sizes.*, Shape.*, Tone.*

val BernaysSentences = Seq(
  fof"Row(a,b)",
  fof"¬Bel(a,b) ∧ ¬Abv(a,b)", // also ¬Bel(a,b) ∧ ¬Bel(b,a), or ¬Abv(b,a) ∧ ¬Abv(a,b)
  fof"Col(d,b)",
  fof"¬Lft(a,b) ∧ ¬Rgt(a,b)", // also ¬Lft(a,b) ∧ ¬Lft(b,a), or ¬Rgt(a,b) ∧ ¬Rgt(b,a)
  fof"Eq(a, d)",
  fof"Siz(a,d) ∧ Shp(a,d) ∧ Ton(a,d)", // does Row(a,d)∧Col(a,d) work? Why or why not?
  fof"Siz(a,b)",
  fof"¬Mor(a,b) ∧ ¬Les(a,b)", // also ¬Mor(a,b) ∧ ¬Mor(b,a), ¬Les(b,a) ∧ ¬Les(a,b)
  // also (Sml(a) ↔ Sml(b)) ∧ (Mid(a) ↔ Mid(b)) ∧ (Big(a) ↔ Big(b))
  fof"Shp(a,b)",
  fof"(Tri(a) ↔ Tri(b)) ∧ (Sqr(a) ↔ Sqr(b)) ∧ (Cir(a) ↔ Cir(b))",
  fof"Ton(a, b)",
  fof"(Lim(a) ↔ Lim(b)) ∧ (Red(a) ↔ Red(b)) ∧ (Blu(a) ↔ Blu(b))",
  fof"Abv(c,b)",
  fof"Bel(c,b)", // also ¬Bel(c,b) ∧ Row(c,b), ¬Abv(b,c) ∧ Row(c,b)
  fof"Lft(a,b)",
  fof"Rgt(b,a)", // also ¬Lft(b,a) ∧ Col(b,a), ¬Rgt(a,b) ∧ Col(a,b)
  fof"Mid(c)",
  fof"¬Sml(c) ∧ ¬Big(c)",
  fof"Mor(a,b)",
  fof"Les(b,a)", // also (Big(a) ∧ Mid(b)) ∨ (Big(a) ∧ Sml(b)) ∨ (Mid(a) ∧ Sml(b))
  fof"Sqr(a)",
  fof"¬Tri(a) ∧ ¬Cir(a)"
)

val BernaysSentences1 = Seq(
  fof"Row(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Col(d,b)",
  // add sentence here! ¬∧∨→↔
  fof"Eq(a, d)",
  // add sentence here! ¬∧∨→↔
  fof"Siz(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Shp(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Ton(a, b)",
  // add sentence here! ¬∧∨→↔
  fof"Abv(c,b)",
  // add sentence here! ¬∧∨→↔
  fof"Lft(a,b)",
  // add sentence here! ¬∧∨→↔
  fof"Mid(c)",
  // add sentence here! ¬∧∨→↔
  fof"Mor(a,b)",
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
