import tarski.main.*

val GentzenSentences1 = Seq(
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
def run24a = runWorld(WittgensteinWorld, GentzenSentences1)

@main
def run24b = runWorld(BolzanoWorld, GentzenSentences1)

@main
def run24c = runWorld(VennWorld, GentzenSentences1)

@main
def run24d = runWorld(BooleWorld, GentzenSentences1)

@main
def run24e = runWorld(MontagueWorld, GentzenSentences1)

@main
def run24f = runWorld(LeibnizWorld, GentzenSentences1)
