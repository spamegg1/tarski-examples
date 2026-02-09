import tarski.main.*

val BozoSentences1 = Seq(
  // Looks like Bozo is trying to say that
  // a small square named a is below a triangle named e.
  fof"Sml(Sqr(a)) Bel Tri(e)",
  fof"¬Col(x, b)",
  // After fixing this, there are two different ways to add parentheses to it.
  fof"Sqr(a) and Sqr(b) or Sqr(c)",
  fof"Lim(a) iff Blu(b) iff Red(e)",
  fof"∃x ¬(Sqr x)",
  fof"∃x Sqr(x) ∧ Small(x) ∧ Blue(x)", // Bozo wants to say there is a small blue square.
  // Bozo left out a negation sign.
  // There are 4 places you can put it, 1 of them would make the sentence false.
  fof"∃y (Cir(y) ∧ Big(y))",
  fof"∀y (Blu(x) → ¬Mid(x))",
  fof"∀x (if Tri(x) and Sml(x) then Bel(x, e))"
)

@main
def runQ07 = runWorld(LeibnizWorld, BozoSentences1)
