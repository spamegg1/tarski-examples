import tarski.main.*

val AustinSentences = Seq(
  fof"More(a, b)",
  fof"Btw(c, d, b)",
  fof"Left(c, b)",
  fof"Bel(c, b)",
  fof"Abv(e, b)",
  fof"Rgt(a, b)"
  // add more sentences here if needed
)

@main
def run27 = runWorld(WittgensteinWorld, AustinSentences)
