# 27 - Numerical sentences

By a "numerical claim" we mean one that says that there are a certain
number of objects, or a certain number with some property or other.
In earlier examples, we have already come across some simple numerical claims.
This example will help you recognize numerical claims
when you come across them in our first-order language.

- Open `WhiteheadSentences`.
- The first sentence says that there are at least two objects,
  - the second sentence says that there are at most two objects.
  - Do you see how they manage to say these things?
  - Build a world where the first two sentences are both true.
- Sentence 3 is the conjunction of the first two.
  - Hence it asserts, in one sentence, that there are exactly two objects.
  - Check to see that it is true in the world you have just built.
- The fourth sentence is in fact equivalent to the third sentence.
  - It is a shorter way of saying that there are exactly two objects.
  - Use the game to see why it is true in a world where there are two objects,
  - but false in worlds with more or less than two objects.
- Sentence 5 appears, at first sight, to assert that there are at least three objects,
  - so it should be false in a world with two objects.
  - Check to see if it is indeed false in such a world.
  - Why isn't it?
  - Play the game to confirm your suspicions.
- Sentence 6 actually manages to express the claim that there are at least three objects.
  - Do you see how it's different from the fifth sentence?
  - Check to see that it is false in the current world,
  - but is true if you add another object to the world.
- As we increase the number of objects, numerical claims get longer and more complicated.
  - Let's consider one, but we won't be typing or evaluating it.
  - We could say that there are exactly three objects as follows:
    ∃x ∃y ∃z (¬Loc(x,y) ∧ ¬Loc(x,z) ∧ ¬Loc(y,z) ∧ ∀u (Loc(u,x) ∨ Loc(u,y) ∨ Loc(u,z)))
  - This says there are exactly three non-identical blocks (placed at different positions).
  - A similar but different statement is:
    ∃x ∃y ∃z (x != y ∧ x != z ∧ y != z ∧ ∀u (u = x ∨ u = y ∨ u = z)).
    - This says there are three unequal blocks and every block is equal to one of them.
    - Notice how this does not restrict the number of blocks to be exactly 3.
    - There could be tens of objects as long as they are equal (in shape, size, tone)
      to one of the three blocks mentioned.
- Sentence 7 asserts that `a` is a big object, and in fact the only big object.
  - To see just how the sentence manages to say this,
    start with a world with three small objects and name one of them `a`.
  - Play the game committed to true to see why the sentence is false.
  - Now make object `a` big.
  - Play the game committed to false to see why it is true.
  - Finally, make one of the other objects big as well,
  - and play the game committed to true to see why it is false.
- Sentence 7 asserted that `a` was the only big object.
  - How might we say that there is exactly one big object
    without using a name for the object?
  - Compare sentence 7 with sentence 8.
  - The latter asserts that there is something which is the only big object.
  - Check to see that it is true only in worlds in which there is exactly one big object.
- Construct a world in which sentence 9 is true.
- Make sentences 10 and 11 true in a single world.
- Sentence 12 is another way to assert that there is a unique circle.
  - That is, sentence 12 is equivalent to sentence 9. Can you see why?
  - Check three worlds to see that the two sentences are true
    in the same worlds: those in which there is a single circle.
- Sentence 13 says that there are exactly two triangles.
  - Check that it is true in such worlds,
  - but false if there are fewer or more than two.
