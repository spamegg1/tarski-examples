import tarski.main.*

val PeanoSentences1 = Seq(
  fof"∃x ∃y (Tri(x) ∧ Mor(x, y))",
  fof"∃x (Tri(x) ∧ ∃y Mor(x, y))", // says the same thing as previous, in a different way
  fof"∃x ∃y (Sqr(x) ∧ Tri(y) ∧ Mor(x, y))",
  fof"∃x (Sqr(x) ∧ ∃y (Tri(y) ∧ Mor(x, y)))", // same as prev
  fof"∃x ∃y (Tri(x) ∧ Sqr(y) ∧ Mor(x, y))",
  fof"∃x (Tri(x) ∧ ∃y (Sqr(y) ∧ Mor(x, y)))", // same as prev
  fof"∃x ∃y (Cir(x) ∧ Tri(y) ∧ Mor(x, y))",
  fof"∃x (Cir(x) ∧ ∃y (Tri(y) ∧ Mor(x, y)))", // same as prev
  fof"∃x ∃y ∃z Btw(x, y, z)",
  fof"∃x (Sqr(x) ∧ ∃y ∃z Btw(x, y, z))",
  fof"∃x (Tri(x) ∧ ∃y ∃z Btw(x, y, z))",
  fof"∃x ∃y ∃z (Tri(x) ∧ Sqr(y) ∧ Btw(x, y, z))",
  fof"∀x ∀y (Sqr(x) → Mor(x, y))",
  fof"∀x (Sqr(x) → ∀y Mor(x, y))", // same as prev
  fof"∀x ∀y ((Sqr(x) ∧ Cir(y)) → Mor(x, y))",
  fof"∀x (Sqr(x) → ∀y (Cir(y) → Mor(x, y)))", // same as prev
  fof"∀x ∀y ((Blu(x) ∧ Lim(y)) → Mor(x, y))"
)

val PeanoSentences2 = Seq(
  fof"∀x ((Sqr(x) ∧ Mid(x)) → ∀y Left(y, x))", // understand the difference from next one
  fof"∀x ((Sqr(x) ∧ Mid(x)) → ∀y (y != x → Left(y, x)))",
  fof"∀x ((Tri(x) ∧ Sml(x)) → ∀y Bel(x, y))",
  fof"∀x ((Tri(x) ∧ Sml(x)) → ∀y (y != x → Bel(x, y)))",
  fof"∀x ((Tri(x) ∧ Sml(x)) → ∀y ¬Bel(y, x))",
  fof"∀x ∀y (Abv(x, y) → ¬Bel(x, y))",
  fof"∃x ∃y (Abv(x, y) ∧ ¬Bel(x, y))",
  fof"∃x (Tri(x) ∧ ∃y ∃z (Cir(y) ∧ Cir(z) ∧ Btw(x,y,z)))",
  fof"∃x ∃y (Tri(x) ∧ Tri(y) ∧ ∃z (Cir(z) ∧ Btw(z,x,y)))",
  fof"∃x ∃y (Lim(x) ∧ Blu(y) ∧ ∃z (Red(z) ∧ Btw(x, y, z)))",
  fof"∀x ∀y ((Sqr(x) ∧ Tri(y)) → (Bel(x, y) ∨ Bel(y, x)))",
  fof"∀x ∀y ((Sqr(x) ∧ Tri(y)) → (Left(x, y) ∨ Left(y, x)))",
  fof"∀x ∀y ((Sqr(x) ∧ Sqr(y)) → ¬Row(x, y))", // you may want to play the game for this.
  fof"∀x ∀y ((Cir(x) ∧ Cir(y)) → Siz(x, y))",
  fof"∀x ∀y ((Tri(x) ∧ Tri(y)) → ¬Siz(x, y))",
  fof"∀x ∀y ((Cir(x) ∧ Cir(y)) → Ton(x, y))",
  fof"∀x ∀y ((Blu(x) ∧ Red(y)) → ¬Bel(x, y))"
)

@main
def runQ15a = runWorld(PeanoWorld, PeanoSentences1)

@main
def runQ15b = runWorld(PeanoWorld, PeanoSentences2)

// Play the game if you are stuck on something.
@main
def playQ15 = playGame(PeanoWorld, ???) // add sentence here
