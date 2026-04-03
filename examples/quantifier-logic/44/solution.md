# 44 - solution

;∀x (x = a ∨ x = b ∨ x = c ∨ x = d)
∀x (x = a ∨ x = b ∨ x = c ∨ x = d ∨ ∃y FrontOf(y,x))
∃x (x ≠ a ∧ x ≠ b ∧ x ≠ c ∧ x ≠ d ∧ x ≠ e)
∀x (x = a → x = d)
; ∃x (Between(x, c, a) ∧ x ≠ b)
∃x Between(x, c, a)
∀x (Between(x, c, a) → x = b)
; ∀x ((Tet(x) ∧ Medium(x)) → x = e)
∀x ((Tet(x) ∧ Medium(x)) → SameRow(x,e))
∀x (x = e → (Tet(x) ∧ Medium(x)))
∀x ((Tet(x) ∧ Small(x)) ↔ x = b)
∃y (y ≠ e ∧ SameRow(y, e))
