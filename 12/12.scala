import tarski.main.*

val sentences12 = Seq(
  // add your sentences here! ¬∨∧→↔
  fof"Tri(a) → Bel(a, d)",
  fof"(Left(a,d) ∨ Rgt(a,d)) → Sqr(a)",
  fof"Btw(c,a,e) ∨ Btw(c,a,d)",
  fof"Sml(c) → Rgt(c, a)",
  fof"Rgt(c,d) → (Rgt(b,c) ∧ Left(b,e))",
  fof"Tri(e) → (Rgt(e,b) ↔ Bel(e,b))",
  fof"Cir(b) → (¬Bel(b,d) → ¬Abv(b,d))",
  fof"Abv(c,a) ∧ Bel(c,e)",
  fof"¬Bel(e,d) → (Big(e) ∧ Tri(e))",
  fof"Sqr(a) ∨ Sqr(c) ∨ Sqr(e)",
  fof"Tri(a) → Bel(a, b)",
  fof"More(b,a) ∧ More(b,e)",
  fof"More(a,c) ∧ More(e,c) ∧ ¬Big(a) ∧ ¬Big(e)",
  fof"Shap(d,b) → Size(d,b)",
  fof"Big(a) ↔ Sqr(a)",
  fof"¬Tri(c) → Sqr(b)",
  fof"¬Sqr(e) → (Big(b) ∨ Big(d))",
  fof"(Tri(a) ∨ Tri(c)) → (Sqr(b) ∨ Sqr(d))",
  fof"Sml(d) ↔ Big(a)",
  fof"Big(e) ↔ Big(a)",
  fof"Blu(c) ↔ Tone(b, d)",
  fof"¬Tone(b, c) → Tone(a, e)"
)
