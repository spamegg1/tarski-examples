import tarski.main.*

val sentencesQ51 = Seq(
  fof"∀x ∃y Siz(x, y)",
  // add sentence here
  fof"∀x (Tri(x) → ¬ ∃z (Mid(z) ∨ Mor(x, z)))",
  // add sentence here
  fof"∀x ∀y (x != y ↔ (∃z Col(z, x) ∧ ∀u Sml(u)))",
  // add sentence here
  fof"∃x ∃y ∃z (Btw(x, y, z) ∧ Cir(x) ∧ ∀w Mor(w, x))",
  // add sentence here
  fof"∃y ∀x ∃z (Abv(x, z) ∧ Rgt(y, z))"
  // add sentence here
)

// Test your sentences in various worlds here.
@main
def runQ51 = runWorld(LeibnizWorld, sentencesQ51) // add world here
