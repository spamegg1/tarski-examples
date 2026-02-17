# 16 - solution

Here is one world where all `RamseySentences1` are true:

```scala
val worldQ16: Grid = Map(
  (3, 0) -> Block(Big, Sqr, Blu, "d"),
  (3, 2) -> Block(Big, Sqr, Red, "e"),
  (3, 7) -> Block(Big, Tri, Blu, "b"),
  (5, 0) -> Block(Mid, Tri, Red, "a"),
  (5, 2) -> Block(Sml, Cir, Lim),
  (6, 0) -> Block(Sml, Sqr, Lim, "c"),
  (6, 3) -> Block(Sml, Cir, Blu)
)
```

Evaluation, all true:

![q16](q16)
