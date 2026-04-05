import tarski.main.*

val ZornSentences = Seq(
  fof"∀x (x = a | x = b | x = c | x = d)",
  fof"∀x (Eq(x, a) | Eq(x, b) | Eq(x, c) | Eq(x, d))",
  fof"∃x (x != a ∧ x != b ∧ x != c ∧ x != d ∧ x != e)",
  fof"∀x (x = a → x = c)",
  fof"∃x (Btw(x, c, a) ∧ x != b)",
  fof"∀x (Btw(x, c, a) → x = b)",
  fof"∀x (Tri(x) ∧ Mid(x) → x = e)",
  fof"∀x (x = e → Tri(x) ∧ Mid(x))",
  fof"∀x (Tri(x) ∧ Sml(x) ↔ x = b)",
  fof"∃y (y != e ∧ Row(y, e))",
  fof"∀x ∃y (x != y ∧ Eq(x, y))"
)

@main
def runQ44 = runWorld(LeibnizWorld, ZornSentences)

// Play the game if needed.
@main
def playQ44 = playGame(LeibnizWorld, ???) // add sentence here
