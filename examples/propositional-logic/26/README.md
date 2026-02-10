# 26 - Equivalences in the blocks language

In the blocks language used in Tarski's World there are a
number of equivalent ways of expressing some of the predicates.

(Recall that equality `=` means "value equality", a.k.a. equality:
`a = b` if the blocks labeled `a` and `b` are equal in size, shape and tone.
This is in contrast to "reference equality" `Loc`, a.k.a. identity:
`Loc(x,y)` means that `x` and `y` have the same row and column on the board,
in other words they refer to the same one block.)

- Look at `BernaysSentences`.
- You will find a list of atomic sentences,
  where every other sentence is left blank.
- In each blank, write a sentence that is equivalent to the sentence
  above it, but does not use the predicate used in that sentence.
- In doing this, you may presuppose any general facts about
  Tarski's World, for example that blocks come in only three shapes.
- If your answers are correct, the odd numbered sentences will have
  the same truth values as the even numbered sentences in every world.
- Check that they do in
  - `AckermannWorld`,
  - `BolzanoWorld`,
  - `BooleWorld`, and
  - `LeibnizWorld`.
- Save the modified `BernaysSentences`.
