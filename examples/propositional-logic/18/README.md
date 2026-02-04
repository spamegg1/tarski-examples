# 18 - Redundancy of conditionals

The next few examples exploit the propositional equivalences:

A ↔ B  equiv. to:  (A → B) ∧ (B → A)
A → B  equiv. to:  ¬A ∨ B
A ∧ B  equiv. to:  ¬(¬A ∨ ¬B)
A ∨ B  equiv. to:  ¬(¬A ∧ ¬B)

They demonstrate that the language or propositional logic
can be reduced by discarding some connectives, without affecting
the expressive power of the language (but while sacrificing convenience.)

## Your task

- `GentzenSentences` contains sentences involving `↔` and `→` in the odd-numbered slots.
- In the even numbered slots, write equivalent sentences using only
  the connectives `∧`, `∨` and `¬`.
  - eliminate the double negations that happen as a result,
  - but no need to simplify further with DeMorgan Laws.
- Evaluate your sentences in:
  - `BolzanoWorld`
  - `BooleWorld`
  - `WittgensteinWorld`
- The sentences in the even numbered slots should always have
  the same truth value as the sentence preceding them.

## Some longer examples (optional, for reading only)

### First example

Consider:

(Tri(a) → More(a,b)) ↔ (Left(b,c) ∨ ¬Bel(b,c))

We will replace the redundant conditionals.
First we replace the biconditional A ↔ B in the middle by using (A → B) ∧ (B → A):

((Tri(a) → More(a,b)) → (Left(b,c) ∨ ¬Bel(b,c))) ∧
((Left(b,c) ∨ ¬Bel(b,c)) → (Tri(a) → More(a,b)))

Now replace the conditionals in A → B and in B → A with ¬A ∨ B and ¬B ∨ A:

(¬(Tri(a) → More(a,b)) ∨ (Left(b,c) ∨ ¬Bel(b,c))) ∧
(¬(Left(b,c) ∨ ¬Bel(b,c)) ∨ (Tri(a) → More(a,b)))

Finally replace the conditional in Tri(a) → More(a,b):

(¬(¬Tri(a) ∨ More(a,b)) ∨ (Left(b,c) ∨ ¬Bel(b,c))) ∧
(¬(Left(b,c) ∨ ¬Bel(b,c)) ∨ (¬Tri(a) ∨ More(a,b)))

### Second example

Consider:

Rgt(a,b) ↔ (Left(a,b) ↔ Less(a,a))

First replace the first biconditional:

(Rgt(a,b) → (Left(a,b) ↔ Less(a,a))) ∧
((Left(a,b) ↔ Less(a,a)) → Rgt(a,b))

Now replace the biconditional Left ↔ Less

(Rgt(a,b) → ((Left(a,b) → Less(a,a)) ∧ (Less(a,a) → Left(a,b)))) ∧
(((Left(a,b) → Less(a,a)) ∧ (Less(a,a) → Left(a,b))) → Rgt(a,b))

Now replace the conditionals

(¬Rgt(a,b) ∨ ((¬Left(a,b) ∨ Less(a,a)) ∧ (¬Less(a,a) ∨ Left(a,b)))) ∧
(¬((¬Left(a,b) ∨ Less(a,a)) ∧ (¬Less(a,a) ∨ Left(a,b))) ∨ Rgt(a,b))
