# 41 - solution

∀x (Cube(x) → ∃y ∃z (Dodec(y)∧Dodec(z)∧Between(x,y,z)))
∃y ∃z (Dodec(y)∧Dodec(z)∧∀x (Cube(x) →Between(x,y,z)))
∀x (Cube(x) → ∀y((Dodec(y)∧RightOf(x,y)) → Smaller(x,y)))
∃y(Dodec(y)∧∀x ((Cube(x)∧RightOf(x,y)) → Smaller(x,y)))
∃x (Dodec(x) ∧¬Larger(a,x))
∀x(Dodec(x) → ¬Larger(a,x))
¬∃x ∃y (Cube(x)∧Dodec(y)∧LeftOf(x,y))
∃x(Dodec(x)∧∀y(Cube(y) → ¬LeftOf(y,x)))
∃x ∃y (Dodec(x)∧Dodec(y)∧x≠y∧∃z ∃u (Cube(z)∧Cube(u)∧z≠u∧Between(z,x,y)∧Between(y,z,u)))
∃x ∃y (Cube(x)∧Cube(y)∧x≠y∧∃z ∃u (Dodec(z)∧Dodec(u)∧Between(x,z,u))∧∃v ∃w (Dodec(v)∧Dodec(w)∧Between(y,v,w)))
