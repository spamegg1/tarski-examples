# 21 - solution

Here are the sentences and their negation normal forms:

```scala
val TuringSentences = Seq(
  fof"¬(Sqr(a) ∧ More(a, b))",
  fof"¬Sqr(a) ∨ ¬More(a, b)",
  fof"¬(Sqr(a) ∨ ¬More(b, a))",
  fof"¬Sqr(a) ∧ More(b, a)",
  fof"¬(¬Sqr(a) ∨ ¬More(a, b) ∨ a != b)",
  fof"Sqr(a) ∧ More(a, b) ∧ a = b",
  fof"¬(Tri(b) ∨ (Big(c) ∧ ¬Less(d, e)))",
  fof"¬Tri(b) ∧ (¬Big(c) ∨ Less(d, e))",
  fof"Cir(f) ∨ ¬(Tri(b) ∨ ¬Tri(f) ∨ ¬Cir(f))",
  fof"Cir(f) ∨ (¬Tri(b) ∧ Tri(f) ∧ Cir(f))"
)
```

Notice that we do have to eliminate double negations.
Because ¬¬A has a non-atomic formula (¬A) that has negation applied to it.

For the world, there is no wrong answer, you can build any world
where all 6 names a,b,c,d,e,f are in use.

```scala
val grid21: Grid = Map(
  (3, 1) -> Block(Sml, Tri, Red, "e"),
  (1, 3) -> Block(Big, Cir, Lim, "f"),
  (2, 6) -> Block(Mid, Sqr, Red, "b"),
  (4, 3) -> Block(Sml, Cir, Blu, "a"),
  (5, 5) -> Block(Mid, Sqr, Lim, "d"),
  (6, 2) -> Block(Big, Tri, Blu, "c")
)
```

![21](21.png)
