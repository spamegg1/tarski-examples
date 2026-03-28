import tarski.main.*, Sizes.*, Shape.*, Tone.*

val MontagueSentences = Seq(
  // edit the sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
  fof"∀x (Sqr(x) → x-is-to-the-left-of-every-triangle)",
  fof"∀x ((Sqr(x) ∧ Sml(x)) → x-is-above-a-big-square)",
  fof"∃x (Sqr(x) ∧ x-is-below-every-triangle)",
  fof"∃x (Sqr(x) ∧ Big(x) ∧ x-is-below-a-small-square)",
  fof"∀x ¬(x-is-more-than-everything)",
  fof"∀x ((Sqr(x) ∧ x-is-below-every-triangle) → Big(x))",
  fof"∀x (x-is-to-the-right-of-a-big-square → Sml(x))",
  fof"∀x ((x-is-above-a-square ∧ x-is-below-a-square) → ¬Big(x))",
  fof"∀x (there-is-nothing-above-x → Sqr(x))",
  fof"∀x (Cir(x) → x-is-less-than-some-triangle)"
)

val PittsWorld: Grid = Map(
  (3, 0) -> Block(Sml, Sqr, Blu),
  (3, 2) -> Block(Sml, Sqr, Blu),
  (3, 4) -> Block(Sml, Tri, Red, "e"),
  (3, 6) -> Block(Sml, Tri, Red, "d"),
  (5, 0) -> Block(Sml, Sqr, Blu),
  (5, 2) -> Block(Sml, Sqr, Blu, "f"),
  (5, 5) -> Block(Sml, Sqr, Blu),
  (5, 7) -> Block(Sml, Sqr, Blu),
  (7, 1) -> Block(Big, Cir, Lim),
  (7, 3) -> Block(Big, Cir, Lim, "a"),
  (7, 5) -> Block(Big, Sqr, Blu, "b"),
  (7, 7) -> Block(Big, Sqr, Blu, "c")
)

@main
def runQ30a = runWorld(PeirceWorld, MontagueSentences)

@main
def runQ30b = runWorld(LeibnizWorld, MontagueSentences)

@main
def runQ30c = runWorld(PittsWorld, MontagueSentences)
