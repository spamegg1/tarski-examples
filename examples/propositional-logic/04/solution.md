# 04 - Solution

1. `~Mid(c) & Less(c, a)` is `false`
    - can be made `true` by adding parentheses: `~(Mid(c) & Less(c, a))`
    - so it becomes the same as the next sentence.
2. `~(Mid(c) & Less(c, a))` is `true`
3. `~Sqr(d) | Tri(f)` is `true`
4. `~(Sqr(d) | Tri(f))` is `false`:
    - can be made `true` by deleting parentheses: `~Sqr(d) | Tri(f)`
    - so it becomes the same as the previous sentence.
5. `~Big(c) & More(c, a)` is `true`
6. `~(Big(c) & More(c, a))` is `true`
7. `~(Sqr(d) & Sqr(f))` is `true`
8. `~Sqr(d) & ~Sqr(f)` is `false`:
    - cannot be made `true` with parentheses!
9. `~Sqr(d) | ~Sqr(f)` is `true`
10. `~(Sqr(d) | Sqr(f))` is `false`:
    - same as 8, cannot be made `true`.
11. `~(Left(c, f) | Rgt(c, f))` is `false`
    - cannot be made `true` with parentheses!
12. `~(Left(a, d) | Rgt(a, d))` is `true`
13. `Tri(a) | (Tri(f) & Tri(c))` is `true`
14. `(Tri(a) | Tri(f)) & Tri(c)` is `false`:
    - can be made `true` by moving parentheses: `Tri(a) | (Tri(f) & Tri(c))`
    - so it becomes the same as the previous sentence.
15. `Cir(a) | Cir(b) | Cir(c)` is `false`
    - cannot be made `true` with parentheses!
16. `Left(a, c) & Left(c, b) & ~Btw(c, a, b)` is `true`
17. `~ ~(Abv(e, b) & ~Bel(c, b))` is `true`
18. `Abv(d, a) & Left(d, e) & Bel(b, e) & Btw(c, d, b)` is `false`
    - cannot be made `true` with parentheses!
    - It's a chain of conjunctions, so no matter how we place parentheses,
      they are logically equivalent.
19. `Less(c, e) | ~(Sqr(a) | Sqr(d))` is `true`
20. `~(~Cir(e) | ~ ~Tri(f))` is `false`
    - can be made true by removing parentheses: `~ ~Cir(e) | ~ ~Tri(f)`
