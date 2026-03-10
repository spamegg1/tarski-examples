import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ03: Grid = Map(
  (5, 2) -> Block(Big, Sqr, Lim, "a"),
  (4, 5) -> Block(Sml, Cir, Red, "b"),
  (1, 2) -> Block(Mid, Tri, Blu, "c")
)

val BernsteinSentences = Seq(
  fof"∀x Sqr(x) → Sml(x)",
  fof"∃ Sqr(x)",
  fof"∃v Sqr(v) ∧ Mid(v) ∧ Mor(v, c)",
  fof"∃u (Sml(u) ∧ Sqr(u)",
  fof"¬ ∃x Mor(a, x) ∧ Mor(x, a)",
  fof"∀w Row(w, b) → Row(b, w)",
  fof"∀x ∀y ∀z Lft(x,y) ∧ Lft(y,z) → Lft(x,z)",
  fof"∀x ∀y Mor(a, b) → Sqr(x) ∧ Cir(y)",
  fof"∀x ∀y Sqr(x) ∧ Sqr(y) → Lft(x, y)",
  fof"∀x (Sqr(x) → ∃x Btw(x, x, y))"
)

@main
def runQ03 = runWorld(worldQ03, BernsteinSentences)
