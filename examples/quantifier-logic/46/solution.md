# 46 - solution

∀x ∀y ((Small(x)∧Large(y)) → FrontOf(x,y))
∃x ∃y (Cube(x)∧Tet(y)∧Larger(x,y))
∀x ∀y ((Cube(x)∧Cube(y)∧x≠y) → SameCol(x,y))
¬∀x ∀y ((Tet(x)∧Tet(y)∧x≠y) → SameCol(x,y))
∀x ∀y ((Cube(x)∧Cube(y)∧x≠y) → ¬SameRow(x,y))
¬∀x ∀y ((Tet(x)∧Tet(y)∧x≠y) → ¬SameRow(x,y))
∃x ∃y (x≠ y ∧ Tet(x)∧Tet(y)∧SameSize(x,y))
¬∃x ∃y (x≠ y ∧ Cube(x)∧Cube(y)∧SameSize(x,y))
