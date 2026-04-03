# 40 - solution

```scala
∃x ∃y ∃z (x ≠ y∧Cube(x)∧Cube(y)∧
Between(z,x,y)∧Medium(z)∧Dodec(z)∧
∃u (Large(u)∧Dodec(u)∧FrontOf(z,u)∧
∃v(Small(v)∧Dodec(v)∧LeftOf(u,v)∧LeftOf(z,v))))∧
∃w ∃v ∀x (Tet(x) ↔ (x=v∨x=w))

∃x∃y(∀z (Tet(z) ↔ (z=x∨z=y))∧
∃z (Between(z,x,y)∧Medium(z)∧Dodec(z)∧
∃u (Large(u)∧Dodec(u)∧FrontOf(z,u)))∧
∃v∃w(∀x(Cube(x) ↔ (x=v∨x=w))∧
∃y(Small(y)∧Dodec(y)∧LeftOf(v,y)∧LeftOf(w,y))))
```
