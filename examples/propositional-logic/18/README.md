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
  the connectives `∧`, `∨` and `¬` (or ASCII equiv `&`, `|`, `~`):
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

```scala
(Tri(a) → Mor(a,b)) ↔ (Lft(b,c) ∨ ¬Bel(b,c))
```

We will replace the redundant conditionals.
First we replace the biconditional A ↔ B in the middle by using (A → B) ∧ (B → A):

```scala
((Tri(a) → Mor(a,b)) → (Lft(b,c) ∨ ¬Bel(b,c))) ∧
((Lft(b,c) ∨ ¬Bel(b,c)) → (Tri(a) → Mor(a,b)))
```

Now replace the conditionals in A → B and in B → A with ¬A ∨ B and ¬B ∨ A:

```scala
(¬(Tri(a) → Mor(a,b)) ∨ (Lft(b,c) ∨ ¬Bel(b,c))) ∧
(¬(Lft(b,c) ∨ ¬Bel(b,c)) ∨ (Tri(a) → Mor(a,b)))
```

Finally replace the conditional in Tri(a) → Mor(a,b):

```scala
(¬(¬Tri(a) ∨ Mor(a,b)) ∨ (Lft(b,c) ∨ ¬Bel(b,c))) ∧
(¬(Lft(b,c) ∨ ¬Bel(b,c)) ∨ (¬Tri(a) ∨ Mor(a,b)))
```

### Second example

Consider:

```scala
Rgt(a,b) ↔ (Lft(a,b) ↔ Les(a,a))
```

First, we replace the leftmost biconditional:

```scala
(Rgt(a,b) → (Lft(a,b) ↔ Les(a,a))) ∧
((Lft(a,b) ↔ Les(a,a)) → Rgt(a,b))
```

Now replace the biconditional Lft ↔ Les

```scala
(Rgt(a,b) → ((Lft(a,b) → Les(a,a)) ∧ (Les(a,a) → Lft(a,b)))) ∧
(((Lft(a,b) → Les(a,a)) ∧ (Les(a,a) → Lft(a,b))) → Rgt(a,b))
```

Now replace the conditionals

```scala
(¬Rgt(a,b) ∨ ((¬Lft(a,b) ∨ Les(a,a)) ∧ (¬Les(a,a) ∨ Lft(a,b)))) ∧
(¬((¬Lft(a,b) ∨ Les(a,a)) ∧ (¬Les(a,a) ∨ Lft(a,b))) ∨ Rgt(a,b))
```
