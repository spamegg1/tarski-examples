# 06 - Solution

Here are the sentences:

```scala
val sentences06 = Seq(
  fof"¬Below(f, a)",
  fof"Right(f, a) ∧ Left(f, b)",
  fof"Above(f, a) ∨ Less(f, a)",
  fof"Betw(e, c, a) ∧ Betw(d, c, a)",
  fof"¬More(e, c) ∧ ¬More(d, c)",
  fof"¬More(e, d) ∧ ¬Less(e, d)",
  fof"Less(c, a) ∧ More(c, e)",
  fof"Below(c, f) ∧ Less(c, f)",
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
