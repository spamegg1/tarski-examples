# 26 - solution

Many of these have multiple solutions:

```scala
val BernaysSentences = Seq(
  fof"Row(a,b)",
  fof"¬Bel(a,b) ∧ ¬Abv(a,b)", // also ¬Bel(a,b) ∧ ¬Bel(b,a), or ¬Abv(b,a) ∧ ¬Abv(a,b)
  fof"Col(d,b)",
  fof"¬Left(a,b) ∧ ¬Rgt(a,b)", // also ¬Left(a,b) ∧ ¬Left(b,a), or ¬Rgt(a,b) ∧ ¬Rgt(b,a)
  fof"a = d",
  fof"Siz(a,d) ∧ Shape(a,d) ∧ Ton(a,d)", // does Row(a,d)∧Col(a,d) work? Why or why not?
  fof"Siz(a,b)",
  fof"¬Mor(a,b) ∧ ¬Les(a,b)", // also ¬Mor(a,b) ∧ ¬Mor(b,a), ¬Les(b,a) ∧ ¬Les(a,b)
  // also (Sml(a) ↔ Sml(b)) ∧ (Mid(a) ↔ Mid(b)) ∧ (Big(a) ↔ Big(b))
  fof"Shp(a,b)",
  fof"(Tri(a) ↔ Tri(b)) ∧ (Sqr(a) ↔ Sqr(b)) ∧ (Cir(a) ↔ Cir(b))",
  fof"Ton(a, b)",
  fof"(Lim(a) ↔ Lim(b)) ∧ (Red(a) ↔ Red(b)) ∧ (Blu(a) ↔ Blu(b))",
  fof"Abv(c,b)",
  fof"Bel(c,b)", // also ¬Bel(c,b) ∧ Row(c,b), ¬Abv(b,c) ∧ Row(c,b)
  fof"Left(a,b)",
  fof"Rgt(b,a)", // also ¬Left(b,a) ∧ Col(b,a), ¬Rgt(a,b) ∧ Col(a,b)
  fof"Mid(c)",
  fof"¬Sml(c) ∧ ¬Big(c)",
  fof"Mor(a,b)",
  fof"Les(b,a)", // also (Big(a) ∧ Mid(b)) ∨ (Big(a) ∧ Sml(b)) ∨ (Mid(a) ∧ Sml(b))
  fof"Sqr(a)",
  fof"¬Tri(a) ∧ ¬Cir(a)"
)
```

Evaluations:

![26a](26a.png)

![26b](26b.png)

![26c](26c.png)

![26d](26d.png)
