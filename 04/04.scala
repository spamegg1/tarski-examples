import tarski.main.*

val BooleSentences = Seq(
  fof"~Mid(c) & Smaller(c, a)",
  fof"~(Mid(c) & Smaller(c, a))",
  fof"~Squ(d) | Tri(f)",
  fof"~(Squ(d) | Tri(f))",
  fof"~Large(c) & Larger(c, a)",
  fof"~(Large(c) & Larger(c, a))",
  fof"~(Squ(d) & Squ(f))",
  fof"~Squ(d) & ~Squ(f)",
  fof"~Squ(d) | ~Squ(f)",
  fof"~(Squ(d) | Squ(f))",
  fof"~(Left(c, f) | Right(c, f))",
  fof"~(Left(a, d) | Right(a, d))",
  fof"Tri(a) | (Tri(f) & Tri(c))",
  fof"(Tri(a) | Tri(f)) & Tri(c)",
  fof"Cir(a) | Cir(b) | Cir(c)",
  fof"Left(a, c) & Left(c, b) & ~Betw(c, a, b)",
  fof"~ ~(Above(e, b) & ~Below(c, b))",
  fof"Above(d, a) & Left(d, e) & Below(b, e) & Betw(c, d, b)",
  fof"Smaller(c, e) | ~(Squ(a) | Squ(d))",
  fof"~(~Cir(e) | ~ ~Tri(f))"
)

@main
def run04 = runWorld(WittgensteinWorld, BooleSentences)
