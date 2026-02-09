import tarski.main.*, Sizes.*, Shape.*, Tone.*

val EdgarWorld: Grid = Map(
  (0, 1) -> Block(Big, Sqr, Blu),
  (0, 6) -> Block(Big, Sqr, Lim),
  (5, 2) -> Block(Sml, Cir, Red, "a"),
  (5, 4) -> Block(Sml, Cir, Lim),
  (5, 6) -> Block(Sml, Cir, Blu, "b")
)

val EdgarSentences = Seq(
  fof"∃x Tri(x)",
  fof"∃x (Tri(x) ∧ Big(x))",
  fof"∃x (Tri(x) ∨ Big(x))",
  fof"∃x ((Tri(x) ∧ ¬Tri(x)) ∨ Big(x))",
  fof"∃x (¬Tri(x) ∨ Big(x))",
  fof"∃x (Tri(x) → Big(x))",
  fof"∃x (¬Sqr(x) ∨ Btw(x,a,b))",
  fof"∃x (Sqr(x) → Btw(x,a,b))",
  fof"∃x (Sqr(x) ∧ Btw(x,a,b))",
  fof"∃y (Big(y) ∧ Blu(y))",
  fof"∃x Cir(x) ∧ ∃y Big(y)",
  fof"∃x (Cir(x) ∧ Big(x))"
)

@main
def runQ06 = runWorld(EdgarWorld, EdgarSentences)

// Play the game if you are confused about any sentence.
@main
def playQ06 = playGame(EdgarWorld, ???) // add sentence here
