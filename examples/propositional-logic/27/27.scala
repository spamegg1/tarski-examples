import tarski.main.*

val AustinSentences = Seq(
  fof"Mor(a, b)",
  fof"Btw(c, d, b)",
  fof"Lft(c, b)",
  fof"Bel(c, b)",
  fof"Abv(e, b)",
  fof"Rgt(a, b)",
  fof"Row(d, e)", // added
  fof"Abv(d, e)", // added
  // not possible!
)

val AustinSentences1 = Seq(
  fof"Mor(a, b)",
  fof"Btw(c, d, b)",
  fof"Lft(c, b)",
  fof"Bel(c, b)",
  fof"Abv(e, b)",
  fof"Rgt(a, b)"
  // add more sentences here if needed
)

@main
def run27 = runWorld(WittgensteinWorld, AustinSentences)
