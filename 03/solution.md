# 03 - Solution

- `Betw(cba` is not well-formed.
  - We can make it well-formed as: `Betw(c, b, a)`.
- The first sentence can be parenthesized two ways:
  - `(Squ(a) ∧ Squ(b)) ∨ Cir(e)`
    - this is the same as what the parser gives you without the parentheses,
      because `∧` has priority over `∨` according to the parser.
      It evaluates to `true`.
  - `Squ(a) ∧ (Squ(b) ∨ Cir(e))`, which evaluates to `false`!
- The second sentence can be parenthesized in two ways:
  - `(Tri(b) ∧ Small(a)) → Above(a, b)`
    - this is the same as what the parser gives you without the parentheses,
      because `∧` has priority over `→` according to the parser.
      It evaluates to `true`.
  - `Tri(b) ∧ (Small(a) → Above(a, b))`, which evaluates to `false`!
- The third can be parenthesized in two ways, but they are logically equivalent:
  - `Squ(c) ∧ (Small(c) ∧ Left(c, b))`
  - `(Squ(c) ∧ Small(c)) ∧ Left(c, b)`
  - The parser drops parentheses entirely.
- The fourth can be parenthesized in two ways:
  - `(Tri(a) → Small(a)) ∨ Mid(a)` which evaluates to `true`.
  - `Tri(a) → (Small(a) ∨ Mid(a))` which evaluates to `true`.
  - `(A → B) ∨ C` is actually logically equivalent to `A → (B ∨ C)`!
    This is not entirely obvious; we will think about it again later.
- The fifth can be parenthesized in two ways, but they are logically equivalent:
  - `(Tri(a) ↔ Squ(b)) ↔ Cir(c)` (this is what the parser defaults to)
  - `Tri(a) ↔ (Squ(b) ↔ Cir(c))`
