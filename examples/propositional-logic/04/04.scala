import tarski.main.*

val BooleSentences = Seq(
  fof"~Mid(c) & Les(c, a)",
  fof"~(Mid(c) & Les(c, a))",
  fof"~Sqr(d) | Tri(f)",
  fof"~(Sqr(d) | Tri(f))",
  fof"~Big(c) & Mor(c, a)",
  fof"~(Big(c) & Mor(c, a))",
  fof"~(Sqr(d) & Sqr(f))",
  fof"~Sqr(d) & ~Sqr(f)",
  fof"~Sqr(d) | ~Sqr(f)",
  fof"~(Sqr(d) | Sqr(f))",
  fof"~(Lft(c, f) | Rgt(c, f))",
  fof"~(Lft(a, d) | Rgt(a, d))",
  fof"Tri(a) | (Tri(f) & Tri(c))",
  fof"(Tri(a) | Tri(f)) & Tri(c)",
  fof"Cir(a) | Cir(b) | Cir(c)",
  fof"Lft(a, c) & Lft(c, b) & ~Btw(c, a, b)",
  fof"~ ~(Abv(e, b) & ~Bel(c, b))",
  fof"Abv(d, a) & Lft(d, e) & Bel(b, e) & Btw(c, d, b)",
  fof"Les(c, e) | ~(Sqr(a) | Sqr(d))",
  fof"~(~Cir(e) | ~ ~Tri(f))"
)

@main
def run04 = runWorld(WittgensteinWorld, BooleSentences)
