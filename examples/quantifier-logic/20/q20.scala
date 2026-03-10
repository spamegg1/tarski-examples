import tarski.main.*, Sizes.*, Shape.*, Tone.*

val LeibnizSentences = Seq(
  // This sentence tries to make a reasonable claim. Why is it false?
  // Play the game committed to true and see. Then fix it so it says what was intended.
  fof"∀x ∀y ((Sqr(x) ∧ Sqr(y)) → ∃z Btw(z, x, y))",
  fof"∀x (Btw(x, a, c) → x = b)",

  // Why is this false, but the previous one is true? Play committed to true.
  fof"∀x (∃y Btw(x, y, c) → x = b)",
  fof"∀x (∃y Btw(x, y, c) → ¬Big(x))",

  // Why is this false, but the previous one is true? Play committed to true.
  fof"∀x (∃y ∃z Btw(x, y, z) → ¬Big(x))",
  fof"∀x (∃y ∃z Btw(x, y, z) → Tri(x))",
  fof"∀x (¬ ∃y Lft(y, x) → x = a)",

  // Why is this true, but the previous one is false?
  fof"∀x (¬ ∃y Lft(y, x) ∧ ¬ ∃y Bel(y, x) → x = a)",
  fof"∀x (Red(x) → ∃y ∃z (Btw(x, y, z) ∧ Blu(x) ∧ Blu(z)))",
  fof"∀x (Red(x) → ∃y ∃z (Btw(x, y, z) ∧ Red(x) ∧ Red(z)))",

  // Why is this false, but the previous two are true?
  fof"∀x (Red(x) → ∃y ∃z (Btw(x, y, z) ∧ Red(x) ∧ Blu(z)))",

  // Why is this true, but the previous is false?
  fof"∀x (Blu(x) → ∃y ∃z (Btw(y, x, z) ∧ Red(y) ∧ Blu(z)))",
  fof"∀x (∃y ∃z (Btw(x, y, z) ∧ Tri(y) ∧ Tri(z)) → Loc(x, e))",
  fof"∀x (∃y ∃z (Btw(x, y, z) ∧ Sqr(y) ∧ Sqr(z)) → x = b)",
  fof"∀x ∃y ∃z ((Btw(x, y, z) ∧ x = b) → (y = a ∨ y = c))",

  // Do you see what this says?
  fof"∀x ∀y ((Tri(x) ∧ Tri(y) ∧ Sml(x) ∧ Sml(y)) → Loc(x, y))",

  // If you understand the previous one, you see why this is true as well.
  fof"∀x ∀y ((Cir(x) ∧ Cir(y) ∧ Sml(x) ∧ Sml(y)) → Loc(x, y))",

  // This may look like a dumb thing to say, but make sure you understand it.
  // Why is it true?
  fof"∀x (Cir(x) → x = b)",

  // And do you see why this is false? Under what circumstances would it be true?
  fof"∀x (Cir(x) ↔ x = b)",

  // This time, we got it right:
  fof"∀x ((Tri(x) ∧ Sml(x)) ↔ x = b)",

  // Compare this with the previous sentence. Do you understand what it says?
  // Play the game a couple of times, committed to both true and false.
  fof"∃y ∀x ((Tri(x) ∧ Sml(x)) ↔ x = y)",

  // Play the game here too. Do you see why you can't win when committed to true?
  fof"∃y ∀x ((Sqr(x) ∧ Sml(x)) ↔ Loc(x, y))"

  // In this slot, write a sentence that says there is exactly one large triangle.
  // Pattern it on the previous sentence.
)

@main
def runQ20 = runWorld(LeibnizWorld, LeibnizSentences)

// Play the game here with various sentences.
@main
def playQ20 = playGame(LeibnizWorld, ???) // add sentence here
