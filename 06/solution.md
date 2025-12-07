# 06 - Solution

Here are the sentences:

```scala
val sentences06 = Seq(
  fof"¬Below(f, a)",
  fof"Right(f, a) ∧ Left(f, b)",
  fof"Above(f, a) ∨ Smaller(f, a)",
  fof"Betw(e, c, a) ∧ Betw(d, c, a)",
  fof"¬Larger(e, c) ∧ ¬Larger(d, c)",
  fof"¬Larger(e, d) ∧ ¬Smaller(e, d)",
  fof"Smaller(c, a) ∧ Larger(c, e)",
  fof"Below(c, f) ∧ Smaller(c, f)",
  fof"Row(b, a) ∧ ¬Col(b, f)",
  fof"¬Col(e, c) ∧ ¬Col(e, d)",
  fof"Tone(a, c) ∧ Shape(a, b)",
  fof"Cir(d) ∧ Cir(e) ∧ Cir(f)"
)
```

You can see they are all true:

![true](06-true.png)

Then we can change the world as described in the example, to make them all false:

![false](06-false.png)
