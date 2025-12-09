import tarski.main.*, Sizes.*, Shape.*, Tone.*

val QuinnSentences = Seq(
  fof"Cir(a) ∧ Sqr(b) ∧ Blu(a)",
  fof"Below(b, a) ∧ Left(d, b) ∧ Above(f, d) ∧ Right(a, f)",
  fof"Tri(c) ∧ Tri(e) ∧ Left(c, d) ∧ Size(c, d)",
  fof"¬Left(c, e) ∧ ¬Left(e, c) ∧ Shape(c, e)",
  fof"Betw(d, b, c) ∧ ¬Betw(d, c, a)",
  fof"¬Sqr(b) ∨ (Sqr(d) ∧ Above(d, b))",
  fof"(Sml(c) ∧ Below(c, b)) ∨ Sqr(d)",
  fof"More(f, a) ∧ More(a, b) ∧ Tone(a, f)",
  fof"¬(Less(c, a) ∨ Less(a, c)) ∧ ¬Tone(a, c)",
  fof"More(d, b) ∧ More(f, d) ∧ ¬(More(e, d) ∨ More(d, e))"
)

@main
def run05 = runWorld(Map(), QuinnSentences)
