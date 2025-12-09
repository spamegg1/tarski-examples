import tarski.main.*

// Fix these! Then play around with parentheses and re-run.
val sentences03 = Seq(
  fof"Sqr(a) ∧ Sqr(b) ∨ Cir(e)",
  fof"Tri(b) ∧ Sml(a) → Above(a b)",
  fof"Sqr(c  ∧ Sml(c) ∧ Left(c, b)",
  fof"Tri(a) → Sml(a) ∨ Mid(a)",
  fof"Tri(a) ↔ Sqr(b) ↔ Cir(c)",
  fof"Betw(cba"
)

@main
def run03 = runWorld(WittgensteinWorld, sentences03)
