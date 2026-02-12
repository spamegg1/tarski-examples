# 10 (Translating existential noun phrases)

The first thing you have to learn in order to translate quantified expressions
is how to treat complex noun phrases, expressions like
"some boy living in Omaha" or "every girl living in Duluth."

In this example we will concentrate on the former sort of noun phrase,
those whose most natural translation involves an existential quantifier.
Typically, these will be noun phrases starting with one of the determiners
"some", "a", and "an", including noun phrases like "something".

- Enter translations of the following English sentences into `sentencesQ10`.
- Each will use the symbol ∃ exactly once.
- None will use the symbol ∀.
- As you go, check that your entries are well-formed sentences.
- By the way, you will find that many of these English sentences
  are translated using the same first-order sentence.

1. Something is big.
2. Something is a lime square.
3. Some square is big.
    (This sentence means the same thing as: Something is both a square and big.)
4. b has a big square to its left.
    Other ways of saying the same thing:
    - Some big square is to the left of b.
    - A big square is to the left of b.
5. b is to the right of a red square.
    (This translation should be similar to the last,
    but it should contain the predicate symbol `Rgt`.)
6. Something to the left of b is above c.
7. A red square to the left of b is above c.
    Another way of saying the same thing:
    - Some red square is to the left of b and above c.
8. Some circle is not big or red.
9. Something is not a big circle.
    Other ways of saying the same thing:
    - It is not the case that something is a big circle.
    - Something is either not big, or not a circle (or neither).
    - Something is not big and a circle at the same time.
10. b is not to the left of a square.
    Warning: This sentence is ambiguous.
    Can you think of two importantly different translations?
    One starts with ∃, the other starts with ¬.
11. Express the other translation of 10 here.

- Save your list of sentences in `sentencesQ10`.
- Run `runQ10` which will open the sentences in `MontagueWorld`.
- Notice that all the English sentences above are true in this world.
- Check that all your translations are also true.
- If not, you have made a mistake.
- Can you figure out what is wrong with your translation?
- Now move the big square to the top right corner of the grid.
- Observe that English sentences 4,5,7,10 are now false, while the rest are still true.
- Check that the same holds of your translations.
- If not, you have made a mistake.
- Can you figure out what is wrong with your translation?
- Now make the big square small.
- The English sentences 1,3,4,5,7,10 are false in the modified world, the rest are true.
- Again, check that your translations have the same truth values.
- If not, figure out what is wrong.
- Finally, move c straight to the top row, and make b big.
- All the English sentences other than 1,2,9,11 are false.
- Check that the same holds for your translations.
- If not, figure out where you have gone wrong.
