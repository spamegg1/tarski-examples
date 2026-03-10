import tarski.main.*, Sizes.*, Shape.*, Tone.*

val QuinnSentences = Seq(
  fof"Cir(a) ∧ Sqr(b) ∧ Blu(a)",
  fof"Bel(b, a) ∧ Left(d, b) ∧ Abv(f, d) ∧ Rgt(a, f)",
  fof"Tri(c) ∧ Tri(e) ∧ Left(c, d) ∧ Siz(c, d)",
  fof"¬Left(c, e) ∧ ¬Left(e, c) ∧ Shp(c, e)",
  fof"Btw(d, b, c) ∧ ¬Btw(d, c, a)",
  fof"¬Sqr(b) ∨ (Sqr(d) ∧ Abv(d, b))",
  fof"(Sml(c) ∧ Bel(c, b)) ∨ Sqr(d)",
  fof"Mor(f, a) ∧ Mor(a, b) ∧ Ton(a, f)",
  fof"¬(Les(c, a) ∨ Les(a, c)) ∧ ¬Ton(a, c)",
  fof"Mor(d, b) ∧ Mor(f, d) ∧ ¬(Mor(e, d) ∨ Mor(d, e))"
)

@main
def run05 = runWorld(Map(), QuinnSentences)
