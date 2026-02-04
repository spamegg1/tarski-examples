# 15 - solution

Here are the sentences:

```scala
fof"Tri(a) → Tri(b)",
  fof"Tri(b) → Tri(c)",
  fof"(Tri(a) ∧ Tri(c)) → (Big(a) ∨ Big(c))",
  fof"Tri(a) ∧ ¬Big(c)",
  fof"(Sml(c) ∧ Cir(d)) → (¬Big(d) ∧ ¬Sml(d))",
  fof"Mid(c) → ¬(Sqr(d) ∨ Sqr(e) ∨ Sqr(f))",
  fof"¬Sml(a) → (Sml(d) ∧ Cir(d))",
  fof"Big(e) ↔ (Big(d) ↔ Big(f))",
  fof"Size(d, e)",
  fof"Shap(d, e)",
  fof"Big(f) → (Sqr(f) ∨ Cir(f))",
  fof"More(c,e) → More(b,c)",
  fof"Tone(c,f) ∧ ¬Tone(a,b)",
  fof"Lim(d) -> Red(e)",
  fof"Tone(a,e) ↔ Tone(d,b)"
```

Here is a world where they are all true:

```scala
val grid15: Grid = Map(
  (1, 1) -> Block(Big, Tri, Red, "a"),
  (1, 4) -> Block(Mid, Tri, Blu, "c"),
  (4, 3) -> Block(Big, Tri, Lim, "b"),
  (4, 6) -> Block(Sml, Cir, Lim, "d"),
  (6, 1) -> Block(Big, Cir, Blu, "f"),
  (6, 5) -> Block(Sml, Cir, Red, "e")
)
```

![15](15.png)
