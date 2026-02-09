# 07 - solution

Here are the corrected sentences:

```scala
val BozoSentences1 = Seq(
  fof"Sqr(a) ∧ Sml(a) ∧ Tri(e) ∧ Bel(a, e)",
  fof"¬Col(a, b)",
  fof"Sqr(a) ∧ Sqr(b) ∨ Sqr(c)",
  fof"Lim(a) ↔ (Blu(b) ↔ Red(e))",
  fof"∃x ¬Sqr(x)",
  fof"∃x (Sqr(x) ∧ Sml(x) ∧ Blu(x))",
  fof"¬ ∃y (Cir(y) ∧ Big(y))",
  fof"∀x (Blu(x) → ¬Mid(x))",
  fof"∀x ((Tri(x) ∧ Sml(x)) → Bel(x, e))"
)
```

They all evaluate to true in `LeibnizWorld`:

![q07](q07.png)
