# 07 - Solution

Here are the sentences:

```scala
val sentences07 = Seq(
  fof"Sml(a) ∨ (Big(c) ∧ Big(d))",
  fof"Abv(d, b) ∧ Abv(e, b)",
  fof"Abv(d, b) ∧ Abv(e, b) ∧ More(d, b) ∧ More(e, b)",
  fof"Sqr(d) ∧ Sqr(c) ∧ ¬Sml(d) ∧ ¬Sml(c)",
  fof"¬(Rgt(e, c) ∧ Rgt(a, c)) ∧ ¬(Left(e, b)  ∧ Left(a, b))",
  fof"¬Big(e) ∨ Abv(e, a)",
  fof"¬Btw(c, a, b) ∧ ¬Bel(c, a) ∧ ¬Bel(c, b)",
  fof"(Tri(a) ∧ Tri(e)) ∨ (Tri(a) ∧ Tri(f))",
  fof"¬Bel(d, c) ∧ ¬Bel(d, b) ∧ ¬Bel(c, c) ∧ ¬Bel(c, b)",
  fof"Btw(c, d, f) ∨ (Less(c, d) ∧ Less(c, f))",
  fof"¬Row(b, c)",
  fof"Col(b, e) ∧ Row(e, d) ∧ Col(d, a)"
)
```
