# 22 - solution

Here are the translation of the two sentences:

```scala
val twoSentencesQ22 = Seq(
  fof"¬ ∃x Sqr(x)",
  fof"∃x ∀y ((Tri(y) ∧ Big(y)) ↔ Loc(x, y))"
)
```

Initial evaluation in the world taken from the solution to the previous example:

![q22a](q22a.png)

Now we add a square.
Here are a few different positions and sizes of the square added.

Sentences 4 and 10 are false:

![q22b](q22b.png)

Sentences 3, 8 and 10 are false:

![q22c](q22c.png)

Sentences 3, 8, 9 and 10 are false:

![q22d](q22d.png)

Here only sentence 4 is false:

![q22e](q22e.png)

Here we deleted the square and added another big triangle where
only one of the original ten sentences in `BuridanSentences` is false:

![q22f](q22f.png)
