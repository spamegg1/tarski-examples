import tarski.main.*

val GentzenSentences2 = Seq(
  fof"¬(More(a,b) ∧ Less(a,b)) ∨ Btw(a,b,c)",
  // add here! ¬∧∨
  fof"¬(Shap(a,c) ∨ Abv(b,c)) ∧ Adj(b,c)",
  // add here! ¬∧∨
  fof"(Tri(a) ∨ Sqr(b) ∨ Lim(c)) ∧ ¬(Blu(b) ∧ Big(f))",
  // add here! ¬∧∨
  fof"¬(Bel(b,c) ∧ Row(b,c)) ∨ (Tone(b,c) ∧ Adj(b,c))",
  // add here! ¬∧∨
  fof"(Cir(f) ∧ Red(d)) ∨ (Big(b) ∧ (Size(b,c) ∨ ¬Big(f)))"
  // add here! ¬∧∨
)

// Here are a few worlds to test your sentences
@main
def run25a = runWorld(WittgensteinWorld, GentzenSentences2)

@main
def run25b = runWorld(BolzanoWorld, GentzenSentences2)

@main
def run25c = runWorld(VennWorld, GentzenSentences2)

@main
def run25d = runWorld(BooleWorld, GentzenSentences2)

@main
def run25e = runWorld(MontagueWorld, GentzenSentences2)

@main
def run25f = runWorld(LeibnizWorld, GentzenSentences2)
