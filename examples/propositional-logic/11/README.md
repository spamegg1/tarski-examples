# 11 - Describing a world

Take a look at this image of Montague's World:

![11](11.png)

In this world, each object has a name.
You will describe some features of this world in `sentences11`.

1. Notice that if c is a triangle, then a is not a triangle.
  Use your first sentence to express this.
2. However, note that the same is true of b and d. That is, if b is a
  triangle, then d isn't. Use your second sentence to express this.
3. Observe that if b is a triangle, then c isn't. Express this.
4. Notice that if a is a square and b is a circle, then a is to the
  left of b. Use your next sentence to express this fact.
5. Use your next sentence to express the fact that if b and c are both
  squares, then they are in the same row but not in the same column.
6. Use your next sentence to express the fact that b is a triangle
  only if it is small. [Check this sentence carefully. If your sentence
  evaluates as false, then you've got the arrow pointing in the wrong direction.]
7. Next, express the fact that if a and d are both squares, then one is
  to the left of the other. [Note: You will need to use a disjunction
  to express the fact that one is to the left of the other.]
8. Notice that d is a square if and only if it is either medium or big. Express this.
9. Observe that if b is neither to the right nor left of d, then one of
  them is a triangle. Express this observation.
10. Express the fact that b and c are the same size if and only
  if one is a triangle and the other is a circle.
11. Express that c and d have the same tone if a and b have different tones.
12. Say that a has color red if and only if b and c both have color blue.

- Check each of your sentences to see that it is indeed a sentence.
- Save your sentences in `sentences11`.
- Run `run11` to evaluate them and check they are all true in this world.

When verifying the first three, pay particular attention to the
truth values of the various constituents.
Notice that sometimes the conditional has a false antecedent
and sometimes a true consequent.
What it never has is a true antecedent and a false consequent.
In each of these three cases, play the game `play11` committed to true.
Make sure you understand why the game proceeds as it does.
