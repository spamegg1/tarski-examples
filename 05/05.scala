import tarski.main.*, Sizes.*, Shape.*, Tone.*

val QuinnSentences = Seq(
  fof"Cir(a) ∧ Squ(b) ∧ Blue(a)",
  fof"Below(b, a) ∧ Left(d, b) ∧ Above(f, d) ∧ Right(a, f)",
  fof"Tri(c) ∧ Tri(e) ∧ Left(c, d) ∧ Size(c, d)",
  fof"¬Left(c, e) ∧ ¬Left(e, c) ∧ Shape(c, e)",
  fof"Betw(d, b, c) ∧ ¬Betw(d, c, a)",
  fof"¬Squ(b) ∨ (Squ(d) ∧ Above(d, b))",
  fof"(Small(c) ∧ Below(c, b)) ∨ Squ(d)",
  fof"Larger(f, a) ∧ Larger(a, b) ∧ Tone(a, f)",
  fof"¬(Smaller(c, a) ∨ Smaller(a, c)) ∧ ¬Tone(a, c)",
  fof"Larger(d, b) ∧ Larger(f, d) ∧ ¬(Larger(e, d) ∨ Larger(d, e))"
)

@main
def run05 = runWorld(Map(), QuinnSentences)
