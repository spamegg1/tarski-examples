# 28 - The Russellian analysis of definite descriptions

First-order logic has only two quantifiers, whereas English has many determiners,
words like "some" and "every," that combine with nouns to produce noun phrases
(like "some square," "every square").

Other determiners include numbers (as in "two squares")
and the definite article "the" (as in "the square").

Bertrand Russell proposed that a sentence like "The square is red"
should be analyzed as asserting that there is exactly one square, and it is red.
According to this analysis, the sentence will be false if there is no square,
or if there is more than one, or if there is exactly one, but it's not red.
If this analysis is correct (and many do not think it is),
then such sentences can easily be expressed in first-order logic.

In Example Q27 we saw two ways for saying that there is a single circle
(sentences 10 and 13).

- Open `RussellSentences` in an empty world.
- The first sentence uses the second method to assert that there is a single square.
- Compare sentence 1 with sentence 2.
- Sentence 2 is the Russellian analysis of our sentence "The square is red".
- Construct a world in which sentence 2 is true.
- Construct a world in which sentences 2-8 are all true.

The last sentence is intended as the Russellian analysis of:
"The red circle is to the left of the medium circle".
But for convenience, we defined "the red circle" to be `b`
and "the medium circle" to be `c` in previous sentences,
then expressed it with an atomic formula.

If we fully wrote it out long hand, without resorting to named objects, it would be:

∃x (
  (Cir(x) ∧ Red(x)) ∧ ∀y ((Cir(y) ∧ Red(y)) → Loc(x, y)) "x is the (unique) red circle"
  ∧ ∃z (
    (Cir(z) ∧ Mid(z)) ∧ ∀u ((Cir(u) ∧ Mid(u)) → Loc(z, u)) "z is the (unique) mid circle"
    ∧ Left(x, z)  "the red circle is to the left of the mid circle"
  )
)
