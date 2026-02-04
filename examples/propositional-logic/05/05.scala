import tarski.main.*, Sizes.*, Shape.*, Tone.*

val QuinnSentences = Seq(
  fof"Cir(a) ∧ Sqr(b) ∧ Blu(a)",
  fof"Bel(b, a) ∧ Left(d, b) ∧ Abv(f, d) ∧ Rgt(a, f)",
  fof"Tri(c) ∧ Tri(e) ∧ Left(c, d) ∧ Size(c, d)",
  fof"¬Left(c, e) ∧ ¬Left(e, c) ∧ Shap(c, e)",
  fof"Btw(d, b, c) ∧ ¬Btw(d, c, a)",
  fof"¬Sqr(b) ∨ (Sqr(d) ∧ Abv(d, b))",
  fof"(Sml(c) ∧ Bel(c, b)) ∨ Sqr(d)",
  fof"More(f, a) ∧ More(a, b) ∧ Tone(a, f)",
  fof"¬(Less(c, a) ∨ Less(a, c)) ∧ ¬Tone(a, c)",
  fof"More(d, b) ∧ More(f, d) ∧ ¬(More(e, d) ∨ More(d, e))"
)

@main
def run05 = runWorld(Map(), QuinnSentences)
