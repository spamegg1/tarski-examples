# 02 - Typing some sentences

- The following are all well-formed sentences:
  1. Tri(a)
  2. Bel(a, b)
  3. ¬Btw(a, b, c)
  4. Btw(a, b, c) ∧ Btw(a, c, b)
  5. Bel(a, c) → Btw(d, e, c)
  6. (Tri(a) ∧ Bel(a, b)) → Btw(a, d, e)
- They are a bit more complex than before: now they use logical connectives.
- Type them into `sentences02` in `02.scala`.
  - Use the interpolator `fof"..."`.
  - For the logical connectives, you can either:
    - copy the Unicode symbols `¬`, `∧`, `→`, or
    - type the ASCII equivalents `~` (or `-`), `&`, `->`.
- Check each after you write it to see that it is a sentence.
- If you make a mistake, edit it before going on.
- Save your changes to the file, and run.
- Notice we are using the same world from Example 01.
- Before you "Eval", think about their truth values.
- When you "Eval", if there is a mistake, the console will throw an exception.
- Once you're done, move on to the next example.
