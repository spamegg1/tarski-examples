# 11 - Solution

Here are the sentences:

```scala
val sentences11 = Seq(
  fof"Tri(c) → ¬Tri(a)",
  fof"Tri(b) → ¬Tri(d)",
  fof"Tri(b) → ¬Tri(c)",
  fof"(Sqr(a) ∧ Cir(b)) → Left(a, b)",
  fof"(Sqr(b) ∧ Sqr(c)) → (Row(b, c) ∧ ¬Col(b, c))",
  fof"Tri(b) → Sml(b)",
  fof"(Sqr(a) ∧ Sqr(d)) → (Left(a, d) ∨ Left(d, a))",
  fof"Sqr(d) ↔ (Mid(d) ∨ Big(d))",
  fof"(¬Rgt(b, d) ∧ ¬Left(b, d)) → (Tri(b) ∨ Tri(d))",
  fof"Size(b, c) ↔ ((Tri(b) ∧ Cir(c)) ∨ (Tri(c) ∧ Cir(b)))",
  fof"¬Tone(a, b) → Tone(c, d)",
  fof"Red(a) ↔ (Blu(b) ∧ Blu(c))"
)
```
