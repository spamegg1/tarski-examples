# 30 - Translating mixed quantifier sentences

When an English sentence contains more than one quantified noun phrase,
translating it can seem quite confusing unless it is approached in a very
systematic manner. It often helps to have a number of intermediate steps,
where quantified noun phrases are treated one at a time. For example,
suppose we wanted to translate the sentence Each cube is to the left of
a tetrahedron. Here, there are two quantified noun phrases: each cube
and a tetrahedron. We can start by dealing with the first noun phrase,
temporarily treating the complex phrase is-to-the-left-of-a-tetrahedron
as a single unit. In other words, we can think of the sentence as a single
quantifier sentence, on the order of Each cube is small. The translation
would look like this:

∀x (Cube(x) → x-is-to-the-left-of-a-tetrahedron)

Of course, this is not a sentence in our language, so we need to translate
the expression x-is-to-the-left-of-a-tetrahedron. But we can think of this
expression as a single quantifier sentence, at least if we pretend that x
is a name. It has the same general form as the sentence b is to the left
of a tetrahedron, and would be translated as:

∃y (Tet(y) ∧ LeftOf(x, y))

Substituting this in the above, we get the desired translation of the
original English sentence:

∀x (Cube(x) → ∃y (Tet(y) ∧ LeftOf(x, y)))

This multi-step process usually makes translation of multiple quantifier
sentences much easier than if we tried it in a single blow. Eventually,
though, you will be able to go through the intermediate steps in your
head. This exercise is designed to give you a feel for the intermediate
stages in this translation process.

- Open Montague’s Sentences.
- This file contains expressions that are halfway between English and first-order logic.
- Our goal is to edit this file until it contains
  translations of the following English sentences.
- You should read the English sentence,
- make sure you understand how we got to the halfway point,
- and then complete the translation by replacing the hyphenated expression
  with a wff of first-order logic.

The following explains how to do it for the first example:
"Every cube is to the left of every tetrahedron."
Repeat for the rest of the sentences.

- In the sentence window, you see the halfway completed translation,
- together with some blanks that need to be replaced by wffs.
- Commented out below this, you will find an intermediate “sentence.”
- Make sure you understand how we got to this intermediate stage of the translation.
- Then complete the translation by replacing the blank with
  ∀y (Tet(y) → LeftOf(x, y)).
- Once this is done, check to see if you have a well-formed sentence.
- Does it look like a proper translation of the original English? It should.

1. Every cube is to the left of every tetrahedron.
2. Every small cube is in back of a large cube.
3. Some cube is in front of every tetrahedron.
4. A large cube is in front of a small cube.
5. Nothing is larger than everything.
6. Every cube in front of every tetrahedron is large.
7. Everything to the right of a large cube is small.
8. Nothing in back of a cube and in front of a cube is large.
9. Anything with nothing in back of it is a cube.
10. Every dodecahedron is smaller than some tetrahedron.

- Save your list of sentences as Sentences 3.30.
- Open Peirce’s World.
- Notice that all the English sentences are true in this world.
- Check to see that all of your translations are true as well.
- If they are not, see if you can figure out where you went wrong.
- Open Leibniz’s World.
- Note that the English sentences 5, 6, 8, and 10 are true in this world,
- while the rest are false.
- Verify that your translations have the same truth values.
- If not, fix them.
- Open Ron’s World.
- Here, the true sentences are 2, 3, 4, 5, and 8.
- Check that your translations have the right values,
- and correct them if they don’t.
