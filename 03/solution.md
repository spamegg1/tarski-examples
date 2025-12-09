# 03 - Solution

- `Tri(b) ∧ Sml(a) → Abv(a b)` is not well-formed.
  - We can make it well-formed by adding a comma: `Abv(a, b)`.
- `Sqr(c  ∧ Sml(c) ∧ Left(c, b)` is not well-formed.
  - We can make it well-formed by closing the parentheses: `Sqr(c)`.
- `Btw(cba` is not well-formed.
  - We can make it well-formed as: `Btw(c, b, a)`.
- The first sentence can be parenthesized two ways:
  - `(Sqr(a) ∧ Sqr(b)) ∨ Cir(e)`
    - this is the same as what the parser gives you without the parentheses,
      because `∧` has priority over `∨` according to the parser.
      It evaluates to `true`.
  - `Sqr(a) ∧ (Sqr(b) ∨ Cir(e))`, which evaluates to `false`!
- The second sentence can be parenthesized in two ways:
  - `(Tri(b) ∧ Sml(a)) → Abv(a, b)`
    - this is the same as what the parser gives you without the parentheses,
      because `∧` has priority over `→` according to the parser.
      It evaluates to `true`.
  - `Tri(b) ∧ (Sml(a) → Abv(a, b))`, which evaluates to `false`!
- The third can be parenthesized in two ways, but they are logically equivalent:
  - `Sqr(c) ∧ (Sml(c) ∧ Left(c, b))`
  - `(Sqr(c) ∧ Sml(c)) ∧ Left(c, b)`
  - The parser drops parentheses entirely.
- The fourth can be parenthesized in two ways:
  - `(Tri(a) → Sml(a)) ∨ Mid(a)` which evaluates to `true`.
  - `Tri(a) → (Sml(a) ∨ Mid(a))` which evaluates to `true`.
  - `(A → B) ∨ C` is actually logically equivalent to `A → (B ∨ C)`!
    This is not entirely obvious; we will think about it again later.
- The fifth can be parenthesized in two ways, but they are logically equivalent:
  - `(Tri(a) ↔ Sqr(b)) ↔ Cir(c)` (this is what the parser defaults to)
  - `Tri(a) ↔ (Sqr(b) ↔ Cir(c))`
