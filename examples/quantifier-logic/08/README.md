# 08 - Fixing ungrammatical expressions

- Try running `runQ08`, it will crash.
- Look at `BozoSentences2`.
- Most of the expressions in this file are not sentences.
- Some are not wffs, while others are wffs but not sentences.
- Read and assess each one.
- If it is not a wff, fix it.
- Try running `runQ08` again, see if it still crashes.
- Fix them until there is no crash.
- Now you'll see some of the wffs will error when evaluated.
- Read and assess each one. Fix them until there are no errors.
- If a wff is not a sentence, adjust it so as to make it a
  true sentence with as little change as possible.
- If it is a false sentence, try to make it true, again
  with as little change as possible.
- See if you can capture the intent of the original expression.
- Save your modified sentences.

(Recall that equality `=` means "value equality", a.k.a. equality:
`a = b` if the blocks labeled `a` and `b` are equal in size, shape and tone.
This is in contrast to "reference equality" `Loc`, a.k.a. identity:
`Loc(x,y)` means that `x` and `y` have the same row and column on the board,
in other words they refer to the same one block, i.e. they are identical.)
