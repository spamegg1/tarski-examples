# 06 - Solution

Here are the sentences:

```scala
val sentences06 = Seq(
  fof"¬Bel(f, a)",
  fof"Rgt(f, a) ∧ Left(f, b)",
  fof"Abv(f, a) ∨ Les(f, a)",
  fof"Btw(e, c, a) ∧ Btw(d, c, a)",
  fof"¬More(e, c) ∧ ¬More(d, c)",
  fof"¬More(e, d) ∧ ¬Les(e, d)",
  fof"Les(c, a) ∧ More(c, e)",
  fof"Bel(c, f) ∧ Les(c, f)",
  fof"Row(b, a) ∧ ¬Col(b, f)",
  fof"¬Col(e, c) ∧ ¬Col(e, d)",
  fof"Ton(a, c) ∧ Shp(a, b)",
  fof"Cir(d) ∧ Cir(e) ∧ Cir(f)"
)
```

You can see they are all true:

![true](06-true.png)

Then we can change the world as described in the example, to make them all false:

![false](06-false.png)
