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
  fof"~(Left(c, f) | Right(c, f))",
  fof"~(Left(a, d) | Right(a, d))",
  fof"Tri(a) | (Tri(f) & Tri(c))",
  fof"(Tri(a) | Tri(f)) & Tri(c)",
  fof"Cir(a) | Cir(b) | Cir(c)",
  fof"Left(a, c) & Left(c, b) & ~Betw(c, a, b)",
  fof"~ ~(Above(e, b) & ~Below(c, b))",
  fof"Above(d, a) & Left(d, e) & Below(b, e) & Betw(c, d, b)",
  fof"Less(c, e) | ~(Sqr(a) | Sqr(d))",
  fof"~(~Cir(e) | ~ ~Tri(f))"
)

@main
def run04 = runWorld(WittgensteinWorld, BooleSentences)
