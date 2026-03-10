import tarski.main.*

val FregeSentences = Seq(
  fof"∃x ∃y Lft(x, y)",
  fof"∃x ∃y (Tri(x) ∧ Sqr(y))",
  fof"∃x ∃y (Tri(x) ∧ Lft(x, y))",
  fof"∃x ∃y (Tri(x) ∧ Lft(x, y) ∧ Sqr(y))",
  fof"∃x ∃y (Mid(x) ∧ Tri(y))",
  fof"∃x ∃y (Mid(x) ∧ Mor(y, x))",
  fof"∃x ∃y (Mid(x) ∧ Tri(y) ∧ Mor(y, x))",
  fof"∀x ∀y Lft(x, y)",
  fof"∀x ∀y (Lft(x, y) → Sqr(x))",
  fof"∀x ∀y ((Sqr(x) ∧ Tri(y)) → Lft(x, y))",
  fof"∀x ∀y ((Big(x) ∧ Sml(y)) → Lft(x, y))",
  fof"∀x ∀y Mor(x, y)",
  fof"∀x ∀y (Mor(x, y) → Sqr(x))",
  fof"∀x ∀y ((Sqr(x) ∧ Tri(y)) → Mor(x, y))"
)

@main
def runQ19 = runWorld(PeirceWorld, FregeSentences)

// Play the game if you are stuck.
@main
def playQ19 = playGame(PeirceWorld, ???) // add sentence here
