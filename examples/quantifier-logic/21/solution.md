# 21 - solution

One possible solution:

```scala
val worldQ21: Grid = Map(
  (2, 2) -> Block(Big, Cir, Blu, "c"),
  (2, 4) -> Block(Big, Tri, Red, "a"),
  (3, 4) -> Block(Mid, Cir, Blu, "b"),
  (4, 4) -> Block(Mid, Tri, Lim)
)
```

Gradually satisfying the sentences:

1. To satisfy the first sentence, add three unequal blocks:

    ![q21a](q21a.png)

2. To satisfy the second sentence, change the sizes accordingly:

    ![q21b](q21b.png)

3. To satisfy the third sentence, make sure no block is small:

    ![q21c](q21c.png)

4. To satisfy the fourth sentence, make sure there are no squares:

    ![q21d](q21d.png)

5. To satisfy the fifth sentence, make `a` red:

    ![q21e](q21e.png)

6. To satisfy the sixth sentence, add a triangle so that `b` is between two triangles:

    ![q21f](q21f.png)

7. Now all but the seventh sentence are satisfied.
  To satisfy the seventh sentence without breaking the other sentences,
  make the unnamed triangle mid-sized, move `c` to the left and
  arrange `a`-`b`-triangle vertically instead:

    ![q21g](q21g.png)
