# 06 - A common translation mistake

When we get around to translating English sentences containing quantifiers,
we will see that sentences of the following forms are translated in quite different ways:

- All A's are B's
- Some A's are B's

The former are translated as:

- ∀x (A(x) → B(x))

whereas the latter are translated as:

- ∃x (A(x) ∧ B(x))

Beginning students are often tempted to translate the latter more like the former, say as:

- ∃x (A(x) → B(x))

This is in fact an extremely unnatural sentence of first-order logic.
It is meaningful, but it doesn't mean what you might think.
This example is designed to show you exactly what a sentence of this form means.

- Open `EdgarSentences` and evaluate them in `EdgarWorld`.
- Make sure you understand why each of them has the truth value it does.
- Play the game if any of the evaluations surprise you.
- Which of these sentences would be a good translation of:
  "There is a triangle that is large"?
  (Clearly this English sentence is false in `EdgarWorld`,
  since there are no triangles at all.)
- Which sentence would be a good translation of:
  "There is a square between a and b"?
- Which would be a good translation of
  "There is a large circle"?
- Express in clear English the claim made by each sentence and save your answers.
