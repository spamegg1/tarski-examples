# 03 - solution

Here is one way to fix them.
Most are fixed by adding a pair of parentheses so that
all the variables are within the scope of a quantifier.
The other few are fixed by adding or changing variables:

```scala
val BernsteinSentences = Seq(
  fof"∀x (Sqr(x) → Sml(x))",
  fof"∃x Sqr(x)",                         // add missing variable x after ∃
  fof"∃v (Sqr(v) ∧ Mid(v) ∧ More(v, c))",
  fof"∃u (Sml(u) ∧ Sqr(u))",              // add missing paren at the end
  fof"¬ ∃x (More(a, x) ∧ More(x, a))",
  fof"∀w (Row(w, b) → Row(b, w))",
  fof"∀x ∀y ∀z (Left(x,y) ∧ Left(y,z) → Left(x,z))",
  fof"∀x ∀y (More(a, b) → Sqr(x) ∧ Cir(y))",
  fof"∀x ∀y (Sqr(x) ∧ Sqr(y) → Left(x, y))",
  fof"∀x (Sqr(x) → ∃y Btw(x, x, y))"      // change ∃ variable to y
)
```
