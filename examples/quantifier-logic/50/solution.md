# 50 - solution

∀x ∃y SameSize(x, y)
∀x ¬∀y¬SameSize(x,x)
∀x (Tet(x) → ¬∃z (Medium(z) ∨ Larger(x,z)))
∀x (Tet(x) → ∀z (¬Medium(z) ∧ ¬Larger(x,z)))
∀x ∀y (x ≠ y ↔ (∃z SameCol(z, x) ∧ ∀u Small(u)))
∀x ∀y (x ≠ y ↔ ¬(∀z ¬SameCol(z, x) ∨ ¬∀u Small(u)))
∃x ∃y ∃z (Between(x, y, z) ∧ Dodec(x) ∧ ∀w Larger(w,  x))
¬∀x ∀y ∀z ¬(Between(x, y, z) ∧ Dodec(x) ∧ ∀w Larger(w,  x))
∃y ∀x ∃z (BackOf(x, z) ∧ RightOf(y, z))
¬∀y ¬∀x ¬∀z ¬(BackOf(x, z) ∧ RightOf(y, z))
