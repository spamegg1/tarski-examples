# 25 - solution

```scala
val GentzenSentences2 = Seq(
  fof"¬(More(a,b) ∧ Less(a,b)) ∨ Btw(a,b,c)",
  fof"¬((More(a,b) ∧ Less(a,b)) ∧ ¬Btw(a,b,c))",
  fof"¬(Shap(a,c) ∨ Abv(b,c)) ∧ Adj(b,c)",
  fof"(¬Shap(a,c) ∧ ¬Abv(b,c)) ∧ Adj(b,c)",
  fof"(Tri(a) ∨ Sqr(b) ∨ Lim(c)) ∧ ¬(Blu(b) ∧ Big(f))",
  fof"¬(¬Tri(a) ∧ ¬Sqr(b) ∧ ¬Lim(c)) ∧ ¬(Blu(b) ∧ Big(f))",
  fof"¬(Bel(b,c) ∧ Row(b,c)) ∨ (Tone(b,c) ∧ Adj(b,c))",
  fof"¬((Bel(b,c) ∧ Row(b,c)) ∧ ¬(Tone(b,c) ∧ Adj(b,c)))",
  fof"(Cir(f) ∧ Red(d)) ∨ (Big(b) ∧ (Size(b,c) ∨ ¬Big(f)))",
  fof"¬(¬(Cir(f) ∧ Red(d)) ∧ ¬(Big(b) ∧ ¬(¬Size(b,c) ∧ Big(f))))"
)
```
