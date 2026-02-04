# 27 - Context sensitivity of predicates

We have stressed the fact that fol assumes that every predicate is interpreted
by a determinate relation, whereas this is not the case in natural languages
like English. Indeed, even when things seem quite determinate,
there is often some form of context sensitivity.

In fact, I have built some of this into Tarski's World.
Consider, for example, the difference between the predicates `More` and `Abv`.
Whether or not square a is larger than square b is a determinate matter,
and also one that does not vary depending on your perspective on the world.
Whether or not a is above b is also determinate,
but in this case it does depend on your perspective.
If you rotate the world by 90◦, the answer might change.

- Open `AustinSentences` and `WittgensteinWorld`.
- Evaluate the sentences in this file and tabulate the
  resulting truth values in the table below.

|No |Original|Rotate 90◦|Rotate 180◦|Rotate 270◦|
|:-:|:------:|:--------:|:---------:|:---------:|
|1  |   F    |          |           |           |
|2  |   F    |          |           |           |
|3  |   T    |          |           |           |
|4  |   F    |          |           |           |
|5  |   T    |          |           |           |
|6  |   F    |          |           |           |
|7  |        |          |           |           |
|8  |        |          |           |           |
|9  |        |          |           |           |

- I already filled in the first column, showing the values in the original world.
- Rotate the world 90◦ clockwise and evaluate the sentences again,
  adding the results to the table.
- Repeat until the world has come full circle.

- You should be able to think of an atomic sentence in the blocks
language that would produce a row across the table with the following pattern:

    true, false, true, false

- Add a seventh sentence to `AustinSentences` that would display the above pattern.
- Are there any atomic sentences that would produce a row with this pattern?

    false, true, false, false

- If so, add such a sentence as sentence eight in Austin's Sentences.
- If not, leave sentence eight blank.
- Are there any atomic sentences that would produce a
  row in the table containing exactly three true's?
- If so, add such a sentence as number nine.
- If not, leave sentence nine blank.

Save the modified `AustinSentences`.
