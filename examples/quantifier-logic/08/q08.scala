import tarski.main.*

val BozoSentences2 = Seq(
  fof"a = c",
  fof"a = u",
  fof"u = u",
  // Bozo wants to say there is a block between any two non-identical squares.
  fof"∀x ∀y (Sqr(x) ∧ Sqr(y) → Btw(z, x, y))",
  // Bozo wants to say that all small squares have a square above them.
  fof"∀x (Sqr(x) ∧ Sml(x) → ∃y Sqr(y) ∧ Abv(y, x))",
  // Bozo is trying to say there are at least two non-identical blocks in the world.
  fof"∃x ∃y ¬Loc x y",
  fof"Sqr(x) → ¬ Mid(x)", // Bozo wants to say that no squares are medium.
  fof"Tri(x) → Red(x)",   // Bozo wants to say all triangles are red.
  // Help Bozo say that unequal squares have a triangle between them.
  fof"∀x ∀y (Sqr(x) ∧ Sqr(v) ∧ x != y → ∃z Tri(z) ∧ Btw(z x y))",
  // Help Bozo say that unequal blue blocks have a red block between them.
  fof"∀x ∀y (Blue(x) ∧ Blue(y) ∧ x != y → ∃z Red(z) ∧ Btw(z,x,y))",
  fof"∀x ((Red(x) ∧ Big(x) ∧ Sml(y)) → Bel(y, x))",
  fof"∃x, y (Cir(x) ∧ Cir(y) ∧ Less(x, y))",
  // Bozo wants to say that all mid-size squares are red triangles.
  fof"∀x (Mid(x) ∨ Sqr(x) → Tri(x) ∨ Red(x))",
  // Help Bozo say that there are two squares that have only b between them.
  fof"∃x ∃y Sqr(x) ∧ Sqr(y) ∧ ∀z Btw(z,x,y) ↔ Loc(z, b)",
  fof"∀x ∃ ¬Adj(x, y)",
  fof"∃x ¬(Lim x)",
  // There is only one way to add parentheses to this to make it true.
  fof"∀x (Tri(x) → Big(x) → ¬ ∃y Abv(y,x))",
  fof"Sqr a ↔ Tri d ↔ Sqr c",
  // Bozo is trying to say that b is below all OTHER triangles.
  fof"∀x (Tri(x) → Bel(b, x))"
)

@main
def runQ08 = runWorld(LeibnizWorld, BozoSentences2)
