# 23 - solution

```scala
val moreCNFSentences = Seq(
  fof"¬((Sqr(a) ∧ ¬Sml(a)) ∧ (¬Cir(b) ∨ Big(c)))",                 // 1.
  fof"(¬Sqr(a) ∨ Sml(a)) ∨ (Cir(b) ∧ ¬Big(c))",                    // 2. nnf
  fof"(¬Sqr(a) ∨ Sml(a) ∨ Cir(b)) ∧ (¬Sqr(a) ∨ Sml(a) ∨ ¬Big(c))", // 3. cnf
  fof"¬((Sqr(a) ∨ ¬Sml(a)) ∧ (¬Sqr(a) ∨ Sml(a)))",                 // 4.
  fof"(¬Sqr(a) ∧ Sml(a)) ∨ (Sqr(a) ∧ ¬Sml(a))",                    // 5. nnf
  fof"(Sml(a) ∨ Sqr(a)) ∧ (¬Sqr(a) ∨ ¬Sml(a))"                     // 6. cnf
)
```

When you evaluate these, they should have the same truth values in groups of 3,
like TTT, FFF, etc.

## Going from 2 to 3

Start with NNF, for ease of understanding, think of it as `A ∨ B`:

```scala
A ∨ B = (¬Sqr(a) ∨ Sml(a)) ∨ (Cir(b) ∧ ¬Big(c))
```

Now distribute `A ∨` over the parts of `B`:

```scala
((¬Sqr(a) ∨ Sml(a)) ∨ Cir(b)) ∧ ((¬Sqr(a) ∨ Sml(a)) ∨ ¬Big(c))
```

*This is in CNF*.

## Going from 5 to 6

Here is how to go from 5 to 6:

Start with NNF, for ease of understanding, think of it as `A ∨ B`:

```scala
A ∨ B = (¬Sqr(a) ∧ Sml(a)) ∨ (Sqr(a) ∧ ¬Sml(a))
```

Distribute `A ∨` over the two parts of `B`:

```scala
((¬Sqr(a) ∧ Sml(a)) ∨ Sqr(a)) ∧ ((¬Sqr(a) ∧ Sml(a)) ∨ ¬Sml(a))
```

Let's call this `part1 ∧ part2`.

In the first part, distribute `∨ Sqr(a)` over `(¬Sqr(a) ∧ Sml(a))`,

in the second part, distribute `∨ ¬Sml(a)` over `(¬Sqr(a) ∧ Sml(a))`:

```scala
((¬Sqr(a) ∨  Sqr(a)) ∧ (Sml(a) ∨  Sqr(a))) ∧ // part1
((¬Sqr(a) ∨ ¬Sml(a)) ∧ (Sml(a) ∨ ¬Sml(a)))   // part2
```

*This is already in CNF*, so if you got this, you got the correct answer.

But this is quite long; so let's simplify a bit further!

Notice `(¬Sqr(a) ∨ Sqr(a))` is always true by Law of Excluded Middle.

So `((¬Sqr(a) ∨ Sqr(a)) ∧ (Sml(a) ∨ Sqr(a)))` is equivalent to `(Sml(a) ∨ Sqr(a))`:

```scala
(Sml(a) ∨ Sqr(a)) ∧ // part1
((¬Sqr(a) ∨ ¬Sml(a)) ∧ (Sml(a) ∨ ¬Sml(a)))   // part2
```

Similarly for `(Sml(a) ∨ ¬Sml(a))`:

```scala
(Sml(a) ∨ Sqr(a)) ∧ // part1
(¬Sqr(a) ∨ ¬Sml(a)) // part2
```

Finally: `(Sml(a) ∨ Sqr(a)) ∧ (¬Sqr(a) ∨ ¬Sml(a))`.
