# 20 - solution

Initial evaluation:

![q20](q20.png)

The first sentence is trying to say "between any two squares there is a triangle".
It's false because `x` and `y` can refer to the same block.
To fix it, you can add `x != y`:

```scala
fof"∀x ∀y ((Sqr(x) ∧ Sqr(y) ∧ x != y) → ∃z Btw(z, x, y))"
```

Adding `¬Eq(x, y)` also works, but this is a slightly different statement:
"between any two unequal squares there is a triangle".
This statement would leave out `b` which is between two small blue squares,
and the large triangle on top because it is between two large blue squares.

2nd sentence is true because it says "anything between `a` and `c` is equal to `b`".

3rd sentence is false because now `x` can be the big blue square on the top-right,
`y` can be the mid triangle on the middle right, and it's not equal to `b`.

4th sentence is true because it says "if `x` is between something and `c`,
then `x` is not big", and the only 3 blocks in between `c` and another block
are small or mid triangles.

5th sentence is false because now one of the two blocks does not have to be `c`,
so the big triangle on the top between two big squares is a counterexample.

7th sentence ∀x (¬ ∃y Lft(y, x) → Eq(x, a)) is false because it says:
"if there is nothing to the left of `x` then `x` must be `a`".
`d` is a counterexample to this claim.

8th sentence ∀x (¬ ∃y Lft(y, x) ∧ ¬ ∃y Bel(y, x) → Eq(x, a)) is true because it says:
"if there is nothing to the left of or below `x`, then `x` must be `a`".
This is true because `a` is at the bottom left.

9th sentence ∀x (Red(x) → ∃y ∃z (Btw(x, y, z) ∧ Blu(x) ∧ Blu(z))) is true.
It says "every red block is between two blue blocks".
This is true since every red block (triangle) is either horizontally, vertically
or diagonally between two blue blocks (squares).

10th sentence is false because it says the same thing as 9, for being between red blocks.
`b` is a counterexample: it's a red block that is not between two red blocks.

11th sentence is true because it says for every blue block, there is a red
block that is between it and another blue block. This is true, since every blue
block is a square in one of the "corners" and there is always a red triangle
that is in between that and another blue square on one of the other corners.

15th sentence ∀x ∀y ((Tri(x) ∧ Tri(y) ∧ Sml(x) ∧ Sml(y)) → x = y)
says that there is at most only one small triangle.
This is true, `b` is the only one.
Why "at most 1"? How could we say "exactly 1"?
The sentence says that if there are two, then they are identical.
It does not guarantee the existence of one. We could say "exactly 1" like this:
∃x (Tri(x) ∧ Sml(x) ∧ ∀y(Tri(y) ∧ Sml(y) → x = y))

16th sentence, similarly, says that there is at most one small circle.
This is true, even though there are no circles! Because the sentence
does not require the existence of a small circle, only requires "at most 1".

17th sentence says that every circle is equal to `b`.
It seems dumb because `b` is a triangle!
This is vacuously true: there are no circles, so the antecedent `Cir(x)` is always false.
Therefore the implication `Cir(x) → Eq(x, b)` is always true.

18th sentence says that a block is a circle if and only if it is equal to `b`.
This is false, because `b` is not a circle. The antecedent `Eq(x, b)` is true
when `x` equals `b`, in which case the consequent `Cir(x)` is false.
So the implication `Cir(x) → Eq(x, b)` is false when `x` is `b`,
making the universal statement false.

19th sentence gets it right: being equal to `b` is equivalent to being a small triangle,
at least in this world (since all triangles have the same tone).

20th sentence says that there is a block `y` such that
being a small triangle is equivalent to being identical to `y`.
This is the same as the 19th sentence without using the name `b`,
but using an existential quantifier instead.

21st sentence says the same thing as 20 for being a small square.
This is false since there are two non-identical small squares `a` and `c`.

For the last sentence that says "there is exactly one large triangle" use:

```scala
fof"∃y ∀x ((Tri(x) ∧ Big(x)) ↔ x = y)"
```
