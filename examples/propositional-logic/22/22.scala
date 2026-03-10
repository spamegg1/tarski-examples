import tarski.main.*

val CNFSentences = Seq(
  fof"(Lft(a, b) ∨ Abv(a, b)) ∧ Sqr(a)",
  // add disjunctive normal form here!
  fof"Mor(a, b) ∧ (Sqr(a) ∨ Tri(a) ∨ Eq(a, b))",
  // add disjunctive normal form here!
  fof"(Btw(a, b, c) ∨ Tri(a) ∨ ¬Tri(b)) ∧ Cir(c)",
  // add disjunctive normal form here!
  fof"Sqr(a) ∧ Sqr(b) ∧ (¬Sml(a) ∨ ¬Sml(b))"
  // add disjunctive normal form here!
)

// Here are a few worlds to test your DNF sentences
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
