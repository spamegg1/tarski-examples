import tarski.main.*

val AbelardSentences = Seq(
  fof"Sqr(d) → Sqr(f)",
  fof"Sqr(d) → Tri(f)",
  fof"Cir(d) → Tri(f)",
  fof"Cir(d) → Sqr(f)",
  fof"Size(a, b) → Row(a, b)",
  fof"Size(a, b) → Size(a, c)",
  fof"Size(a, c) → Size(a, b)",
  fof"Size(a, c) → Size(a, d)",
  fof"(Tri(a) ∧ Sqr(c)) → Cir(d)",
  fof"Left(a, b) → Rgt(b, a)",
  fof"Left(e, d) → Rgt(d, e)",
  fof"(Left(a, c) ∧ Left(c, b)) → Btw(c, a, b)",
  fof"Sqr(c) → (Big(c) → (Sqr(c) ∧ Big(c)))", // make sure you understand this one!
  fof"¬(Tri(a) → Big(a)) → (Tri(a) ∧ ¬Big(a))",
  fof"Big(d) ↔ Sml(a)",
  fof"Cir(d) ↔ Big(d)",
  fof"Adj(a, f) ↔ Adj(a, d)",
  fof"¬(Big(e) ↔ Sml(b))",
  fof"(Cir(c) ∧ (Tri(a) ∨ Tri(d))) ↔ ((Cir(c) ∧ Tri(a)) ∨ (Cir(c) ∧ Tri(d)))",
  fof"Sqr(b) ↔ (Sqr(c) ↔ Big(c))" // this is a bit hard to understand!
)

@main
def run09 = runWorld(WittgensteinWorld, AbelardSentences)

// Optional: if you make a mistake, you can play the game to understand a sentence.
@main
def play09 = playGame(WittgensteinWorld, ???) // add the formula you are stuck on.
