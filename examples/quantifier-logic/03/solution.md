# 03 - solution

Here is one way to fix them.
Most are fixed by adding a pair of parentheses so that
all the variables are within the scope of a quantifier.
The other few are fixed by adding or changing variables:

```scala
val BernsteinSentences = Seq(
  fof"∀x (Sqr(x) → Sml(x))",
  fof"∃x Sqr(x)",                         // add missing variable x after ∃
  fof"∃v (Sqr(v) ∧ Mid(v) ∧ Mor(v, c))",
  fof"∃u (Sml(u) ∧ Sqr(u))",              // add missing paren at the end
  fof"¬ ∃x (Mor(a, x) ∧ Mor(x, a))",
  fof"∀w (Row(w, b) → Row(b, w))",
  fof"∀x ∀y ∀z (Lft(x,y) ∧ Lft(y,z) → Lft(x,z))",
  fof"∀x ∀y (Mor(a, b) → Sqr(x) ∧ Cir(y))",
  fof"∀x ∀y (Sqr(x) ∧ Sqr(y) → Lft(x, y))",
  fof"∀x (Sqr(x) → ∃y Btw(x, x, y))"      // change ∃ variable to y
)
```
