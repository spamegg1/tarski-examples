# 11 - solution

In this world, sentences 2,4 are true and 1,3 are false:

```scala
val worldQ11: Grid = Map(
  (3, 3) -> Block(Mid, Sqr, Blu, "a")
)
```

It's not possible to have a world where 3 is true and 4 is false.
If 3 is true, then ∀x (Tri(x) ∧ Sml(x)) is true.
So every block is a small triangle.
Then Tri(x) → Sml(x) is true for every block (because true → true evaluates to true).
So ∀x (Tri(x) → Sml(x)) has to be true.

It's not possible to have a world where 1 is true and 2 is false.
If 1 is true, then ∃x (Cir(x) ∧ Big(x)) is true.
So there is a block, let's call it `a`, which is a big circle.
Then Cir(a) is true and Big(a) is true.
Then Cir(a) → Big(a) is true (because true → true evaluates to true).
So ∃x (Cir(x) → Big(x)) has to be true, because `a` satisfies it.
