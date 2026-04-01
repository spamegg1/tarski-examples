# 35 - Definite descriptions and numerical quantifiers

In this example we will try our hand translating English sentences
involving numerical claims and definite descriptions.

For purposes of this example, we will assume that the Russellian
analysis of definite descriptions, described in example Q28 is correct.

So, for example, "THE small triangle" implies existence and uniqueness;
it means there is exactly one small triangle:

    ∃x (Sml(x) ∧ Tri(x) ∧ ∀y ((Sml(y) ∧ Tri(y)) → x = y))

But for convenience you can use the shorter approach:

    ∃x ∀y ((Sml(y) ∧ Tri(y)) ↔ x = y)

- Translate the following English sentences in `sentencesQ35`.

1. There are at least two circles.
2. There are at most two triangles.
3. There are exactly two squares.
4. The small triangle has nothing below it.
5. The triangle with something below it is big.
6. No circle is above the big square.
7. The smallest square is medium.

- Save your list in `sentencesQ35`.
- Open `PeanoWorld` by running `runQ35a`.
- Note that all of the English sentences are true in this world.
- Check to see that your translations are as well.
- Open `BolzanoWorld` by running `runQ35b`.
- Here sentences 1, 3, and 6 are the only true ones.
- Verify that your translations have the right truth values in this world.
- Open `SkolemWorld` by running `runQ35c`.
- Only sentences 4 and 6 are true in this world.
- Check your translations.
- Finally, open `MontagueWorld` by running `runQ35d`.
- In this world, sentences 2, 3, 4, 6, and 7 are the only true ones.
- Check your translations.

## Optional longer sentences

There are three more translations but the formulas are too long,
so do these by hand instead of inputting them into `sentencesQ35`:

- There are only 3 things that are not small.
- The medium square is to the right of the big square.
- The only thing with nothing to its right is the medium square.

Similarly to how "THE" implies existence and uniqueness (exactly one),
"ONLY thing" also implies existence and uniqueness here,
and "ONLY three" means exactly three.

## Historical: who was Skolem?

Norwegian mathematician and logician (1887 - 1963)

<https://en.wikipedia.org/wiki/Thoralf_Skolem>
