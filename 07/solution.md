# 07 - Solution

```scala
val sentences07 = Seq(
  fof"Sml(a) ∨ (Big(c) ∧ Big(d))",
  fof"Above(d, b) ∧ Above(e, b)",
  fof"Above(d, b) ∧ Above(e, b) ∧ More(d, b) ∧ More(e, b)",
  fof"Sqr(d) ∧ Sqr(c) ∧ ¬Sml(d) ∧ ¬Sml(c)",
  fof"¬(Right(e, c) ∧ Right(a, c)) ∧ ¬(Left(e, b)  ∧ Left(a, b))",
  fof"¬Big(e) ∨ Above(e, a)",
  fof"¬Betw(c, a, b) ∧ ¬Below(c, a) ∧ ¬Below(c, b)",
  fof"(Tri(a) ∧ Tri(e)) ∨ (Tri(a) ∧ Tri(f))",
  fof"¬Below(d, c) ∧ ¬Below(d, b) ∧ ¬Below(c, c) ∧ ¬Below(c, b)",
  fof"Betw(c, d, f) ∨ (Less(c, d) ∧ Less(c, f))",
  fof"¬Row(b, c)",
  fof"Col(b, e) ∧ Row(e, d) ∧ Col(d, a)",
  // ¬∨∧
  // fof"",
)
```
