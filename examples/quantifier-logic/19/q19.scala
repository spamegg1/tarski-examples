import tarski.main.*

val FregeSentences = Seq(
  fof"∃x ∃y Left(x, y)",
  fof"∃x ∃y (Tri(x) ∧ Sqr(y))",
  fof"∃x ∃y (Tri(x) ∧ Left(x, y))",
  fof"∃x ∃y (Tri(x) ∧ Left(x, y) ∧ Sqr(y))",
  fof"∃x ∃y (Mid(x) ∧ Tri(y))",
  fof"∃x ∃y (Mid(x) ∧ More(y, x))",
  fof"∃x ∃y (Mid(x) ∧ Tri(y) ∧ More(y, x))",
  fof"∀x ∀y Left(x, y)",
  fof"∀x ∀y (Left(x, y) → Sqr(x))",
  fof"∀x ∀y ((Sqr(x) ∧ Tri(y)) → Left(x, y))",
  fof"∀x ∀y ((Big(x) ∧ Sml(y)) → Left(x, y))",
  fof"∀x ∀y More(x, y)",
  fof"∀x ∀y (More(x, y) → Sqr(x))",
  fof"∀x ∀y ((Sqr(x) ∧ Tri(y)) → More(x, y))"
)

@main
def runQ19 = runWorld(PeirceWorld, FregeSentences)

// Play the game if you are stuck.
@main
def playQ19 = playGame(PeirceWorld, ???) // add sentence here
