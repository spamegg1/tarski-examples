# 19 - solution

Here is a world where they are all true:

```scala
val grid19a: Grid = Map(
  (1, 1) -> Block(Sml, Sqr, Lim, "a"),
  (1, 5) -> Block(Sml, Tri, Red, "c"),
  (1, 7) -> Block(Big, Sqr, Blu, "b")
)
```

![19a](19a.png)

Here is a world where they are all false:

```scala
val grid19b: Grid = Map(
  (1, 1) -> Block(Sml, Sqr, Blu, "b"),
  (2, 5) -> Block(Sml, Tri, Red, "c"),
  (1, 7) -> Block(Sml, Cir, Lim, "a")
)
```

![19b](19b.png)
