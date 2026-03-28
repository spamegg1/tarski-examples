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

In Example Q27 we saw two ways (sentences 10 and 12)
for saying that there is a single circle.
One uses: ∃y ∀x (Cir(x) ↔ x = y)
The other uses: ∃x (Cir(x) ∧ ∀y (Cir(y) → x = y))

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
  (Cir(x) ∧ Red(x)) ∧ ∀y ((Cir(y) ∧ Red(y)) → x = y)   "x is the (unique) red circle"
  ∧ ∃z (
    (Cir(z) ∧ Mid(z)) ∧ ∀u ((Cir(u) ∧ Mid(u)) → z = u) "z is the (unique) mid circle"
    ∧ Lft(x, z)                      "the red circle is to the left of the mid circle"
  )
)

## Historical: who was Bertrand Russell?

English mathematician, logician, philosopher (1872 - 1970)

Major contributions to many fields, co-authored Principia Mathematica.

Won Nobel prize in literature. Teacher of Wittgenstein.

<https://en.wikipedia.org/wiki/Bertrand_Russell>
