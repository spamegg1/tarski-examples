# 21 - Negation normal form

A sentence is in negation normal form (NNF) if all occurrences of ¬
apply directly to atomic sentences.

Any formula involving only the connectives ∧, ∨ and ¬ can be put
into negation normal form using the equivalences:

- ¬¬A ⇔ A
- ¬(A ∧ B) ⇔ ¬A ∨ ¬B
- ¬(A ∨ B) ⇔ ¬A ∧ ¬B

Look at `TuringSentences`.
You will find the following five sentences,
each followed by an empty sentence position.

1. ¬(Sqr(a) ∧ Mor(a, b))
2. ¬(Sqr(a) ∨ ¬Mor(b, a))
3. ¬(¬Sqr(a) ∨ ¬Mor(a, b) ∨ ¬Eq(a, b))
4. ¬(Tri(b) ∨ (Big(c) ∧ ¬Les(d, e)))
5. Cir(f) ∨ ¬(Tri(b) ∨ ¬Tri(f) ∨ ¬Cir(f))

- In the empty positions, write the negation normal form of the sentence above it.
- Then build any world in `world21` where all of the names are in use.
  - You do not have to make all the sentences true. Any world is OK.
- Then run `run21` to check them.
- If you have gotten the negation normal forms correct,
  each NNF sentence you added will have the same truth value
  in your world as the sentence above it.
- Verify that this is so in your world.
- Save the modified sentences in `TuringSentences`.

(Recall that `Eq` means "value equality", a.k.a. equality:
`Eq(a, b)` means the blocks labeled `a` and `b` are equal in size, shape and tone.
This is in contrast to "reference equality" `=`, a.k.a. identity:
`x = y` means that `x` and `y` have the same row and column on the board,
in other words they refer to the same one block.)
