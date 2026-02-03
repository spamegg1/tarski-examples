import tarski.main.*

val moreCNFSentences = Seq(
  fof"¬((Sqr(a) ∧ ¬Sml(a)) ∧ (¬Cir(b) ∨ Big(c)))", // 1.
  // 2. add nnf of 1 here!
  // 3. add cnf of 2 here!
  fof"¬((Sqr(a) ∨ ¬Sml(a)) ∧ (¬Sqr(a) ∨ Sml(a)))" // 4.
  // 5. add nnf of 4 here!
  // 6. add cnf of 5 here!
)

// Here are a few worlds to test your sentences
@main
def run23a = runWorld(WittgensteinWorld, moreCNFSentences)

@main
def run23b = runWorld(BolzanoWorld, moreCNFSentences)

@main
def run23c = runWorld(VennWorld, moreCNFSentences)

@main
def run23d = runWorld(BooleWorld, moreCNFSentences)

@main
def run23e = runWorld(MontagueWorld, moreCNFSentences)

@main
def run23f = runWorld(LeibnizWorld, moreCNFSentences)
