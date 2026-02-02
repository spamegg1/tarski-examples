import tarski.main.*, Sizes.*, Shape.*, Tone.*

val CNFSentences = Seq(
  fof"(Left(a, b) ∨ Abv(a, b)) ∧ Sqr(a)",
  fof"(Left(a, b) ∧ Sqr(a)) ∨ (Abv(a, b) ∧ Sqr(a))",
  fof"More(a, b) ∧ (Sqr(a) ∨ Tri(a) ∨ a = b)",
  fof"(More(a, b) ∧ Sqr(a)) ∨ (More(a, b) ∧ Tri(a)) ∨ (More(a, b) ∧ a = b)",
  fof"(Btw(a, b, c) ∨ Tri(a) ∨ ¬Tri(b)) ∧ Cir(c)",
  fof"(Btw(a, b, c) ∧ Cir(c)) ∨ (Tri(a) ∧ Cir(c)) ∨ (¬Tri(b) ∧ Cir(c))",
  fof"Sqr(a) ∧ Sqr(b) ∧ (¬Sml(a) ∨ ¬Sml(b))",
  fof"(Sqr(a) ∧ Sqr(b) ∧ ¬Sml(a)) ∨ (Sqr(a) ∧ Sqr(b) ∧ ¬Sml(b))"
)

// Here are a few worlds to test your DNF sentences""
@main
def run22a = runWorld(WittgensteinWorld, CNFSentences)

@main
def run22b = runWorld(BolzanoWorld, CNFSentences)

@main
def run22c = runWorld(VennWorld, CNFSentences)

@main
def run22d = runWorld(BooleWorld, CNFSentences)

@main
def run22e = runWorld(MontagueWorld, CNFSentences)

@main
def run22f = runWorld(LeibnizWorld, CNFSentences)
