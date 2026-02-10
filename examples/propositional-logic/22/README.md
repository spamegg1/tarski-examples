# 22 - Converting CNF to DNF

A sentence is in disjunctive normal form (DNF)
if it is the disjunction of one or more conjunctions of one or more literals.
Distribution of ∧ over ∨ allows you to translate any sentence in
negation normal form into a sentence in disjunctive normal form.

P ∧ (Q ∨ R) ⇔ (P ∧ Q) ∨ (P ∧ R)

Similarly, a sentence is in conjunctive normal form (CNF) if it is
the conjunction of one or more disjunctions of one or more literals.
Distribution of ∨ over ∧ allows you to translate any sentence in negation
normal form into a sentence in conjunctive normal form.

P ∨ (Q ∧ R) ⇔ (P ∨ Q) ∧ (P ∨ R)

See `CNFSentences`. You will find the following conjunctive
normal form sentences in the odd numbered positions, but you will see
that the even numbered positions are blank.

1. (Left(a, b) ∨ Abv(a, b)) ∧ Sqr(a)
2. More(a, b) ∧ (Sqr(a) ∨ Tri(a) ∨ a = b)
3. (Btw(a, b, c) ∨ Tri(a) ∨ ¬Tri(b)) ∧ Cir(c)
4. Sqr(a) ∧ Sqr(b) ∧ (¬Sml(a) ∨ ¬Sml(b))

In the even numbered positions you should fill in a DNF sentence logically
equivalent to the sentence above it. Check your work by opening
several worlds and checking to see that each of your sentences has the
same truth value as the one above it.

(Recall that equality `=` means "value equality", a.k.a. equality:
`a = b` if the blocks labeled `a` and `b` are equal in size, shape and tone.
This is in contrast to "reference equality" `Loc`, a.k.a. identity:
`Loc(x,y)` means that `x` and `y` have the same row and column on the board,
in other words they refer to one and the same block.)

## Longer example (optional)

Consider this sentence in CNF:

(Sml(a) ∨ Mid(a)) ∧ (Sqr(a) ∨ ¬Cir(a))

Let's put it in DNF. First let's simplify a bit with A = (Sml(a) ∨ Mid(a)):

A ∧ (Sqr(a) ∨ ¬Cir(a))

If we use the distributive property we get:

(A ∧ Sqr(a)) ∨ (A ∧ ¬Cir(a))

Now let's work on each part separately:

(A ∧ Sqr(a)) is ((Sml(a) ∨ Mid(a)) ∧ Sqr(a))

If we use the distributive property here we get:

(Sml(a) ∧ Sqr(a)) ∨ (Mid(a) ∧ Sqr(a))

Similarly distributing on the other half, we get:

(Sml(a) ∧ ¬Cir(a)) ∨ (Mid(a) ∧ ¬Cir(a))

Putting them back together into (A ∧ Sqr(a)) ∨ (A ∧ ¬Cir(a)) we get:

(Sml(a) ∧ Sqr(a)) ∨ (Mid(a) ∧ Sqr(a)) ∨ (Sml(a) ∧ ¬Cir(a)) ∨ (Mid(a) ∧ ¬Cir(a))

which is in disjunctive normal form.
