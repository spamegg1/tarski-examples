import tarski.main.*

// Fix these! Then play around with parentheses and re-run.
val sentences03 = Seq(
  fof"Squ(a) ∧ Squ(b) ∨ Cir(e)",
  fof"Tri(b) ∧ Small(a) → Above(a, b)",
  fof"Squ(c) ∧ Small(c) ∧ Left(c, b)",
  fof"Tri(a) → Small(a) ∨ Mid(a)",
  fof"Tri(a) ↔ Squ(b) ↔ Cir(c)",
  fof"Betw(cba"
)

@main
def run03 = runWorld(WittgensteinWorld, sentences03)
