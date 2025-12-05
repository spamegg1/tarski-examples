# 03 - Fixing a broken sentence, and playing with parentheses and precedence

One of the following is not a well-formed sentence:

1. Squ(a) ∧ Squ(b) ∨ Cir(b)
2. Tet(a) ∧ Small(a) → Above(a, b)
3. Squ(c) ∧ Small(c) ∧ Left(c, b)
4. Tet(a) → Small(a) ∨ Mid(a)
5. Tet(a) ↔ Squ(b) ↔ Cir(c)
6. Betw(cba

Run your world `run03` to see your program crash with a parse error.
Add whatever punctuation (parentheses and commas) is necessary to fix the crash.
Then make sure there isn't another crash when you "Eval".

With the other sentences, there is more than one way to make them a sentence,
depending on how you place the parentheses.

Now, if you run them as-is, the parser will assume a precedence order
between the logical connectives, and place some parentheses for you.
For example, it will assume that `∧` takes priority over `→`, which is over `∨`.
It will assume them to be well-formed, in *one way*.

It will also drop "unnecessary" parentheses as much as possible.
For example, it knows `A ∧ (B ∧ C)` is the same as `(A ∧ B) ∧ C`,
so it just drops all parentheses entirely.

Close the world and edit the sentences.
Play around with different placement of parentheses.
Make them different from what the parser automatically prefers.
Run again to make sure your entries are well-formed sentences.
See how placing the parentheses differenly can affect the truth values when you "Eval".
