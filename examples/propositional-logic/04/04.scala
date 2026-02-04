import tarski.main.*

val BooleSentences = Seq(
  fof"~Mid(c) & Less(c, a)",
  fof"~(Mid(c) & Less(c, a))",
  fof"~Sqr(d) | Tri(f)",
  fof"~(Sqr(d) | Tri(f))",
  fof"~Big(c) & More(c, a)",
  fof"~(Big(c) & More(c, a))",
  fof"~(Sqr(d) & Sqr(f))",
  fof"~Sqr(d) & ~Sqr(f)",
  fof"~Sqr(d) | ~Sqr(f)",
  fof"~(Sqr(d) | Sqr(f))",
  fof"~(Left(c, f) | Rgt(c, f))",
  fof"~(Left(a, d) | Rgt(a, d))",
  fof"Tri(a) | (Tri(f) & Tri(c))",
  fof"(Tri(a) | Tri(f)) & Tri(c)",
  fof"Cir(a) | Cir(b) | Cir(c)",
  fof"Left(a, c) & Left(c, b) & ~Btw(c, a, b)",
  fof"~ ~(Abv(e, b) & ~Bel(c, b))",
  fof"Abv(d, a) & Left(d, e) & Bel(b, e) & Btw(c, d, b)",
  fof"Less(c, e) | ~(Sqr(a) | Sqr(d))",
  fof"~(~Cir(e) | ~ ~Tri(f))"
)

@main
def run04 = runWorld(WittgensteinWorld, BooleSentences)
