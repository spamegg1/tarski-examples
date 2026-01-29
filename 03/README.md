# 03 - Fixing broken sentences, playing with parentheses and precedence

Some of the following are not well-formed sentences:

1. Sqr(a) ∧ Sqr(b) ∨ Cir(e)
2. Tri(b) ∧ Sml(a) → Abv(a b)
3. Sqr(c  ∧ Sml(c) ∧ Left(c, b)
4. Tri(a) → Sml(a) ∨ Mid(a)
5. Tri(a) ↔ Sqr(b) ↔ Cir(c)
6. Btw(cba

- Run your world `run03` to see your program crash with a parse error.
- Add whatever punctuation (parentheses and commas) is necessary to fix the crash.
- Then make sure there isn't another crash when you "Eval".

With most of these sentences, there is more than one way to make them a sentence,
depending on how you place the parentheses.

Now, if you run them as-is, the parser will assume a precedence order
between the logical connectives, and place some parentheses for you.
It will add parentheses to disambiguate the sentence with the double use of `↔`.
Or, it will assume that `∧` takes priority over `→`, which is over `∨`.
It will assume them to be well-formed, in *one way*.

It will also drop "unnecessary" parentheses as much as possible.
For example, it knows `A ∧ (B ∧ C)` is the same as `(A ∧ B) ∧ C`,
so it just drops all parentheses entirely.

- Close the world and edit the sentences.
- Play around with different placement of parentheses.
- Make them different from what the parser automatically prefers.
- Run again to make sure your entries are well-formed sentences.
- See if placing the parentheses differenly affects the truth values when you "Eval".
