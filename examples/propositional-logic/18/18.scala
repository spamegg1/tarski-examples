import tarski.main.*

val GentzenSentences = Seq(
  fof"Tri(a) → Sqr(b)",
  // add sentence here!
  fof"(Sml(a) ∨ ¬Cir(b)) → (Size(c,d) ∧ Less(a,c))",
  // add sentence here!
  fof"Adj(a,b) ↔ Btw(e,d,f)",
  // add sentence here!
  fof"(Blu(a) ∧ Red(b)) ↔ Lim(c)",
  // add sentence here!
  fof"(Sqr(d) → Tri(a)) ↔ Lim(f)"
  // add sentence here!
)

@main
def run18a = runWorld(BolzanoWorld, GentzenSentences)

@main
def run18b = runWorld(BooleWorld, GentzenSentences)

@main
def run18c = runWorld(WittgensteinWorld, GentzenSentences)
