import tarski.main.*

val LeibnizSentences = Seq(
  // This sentence tries to make a reasonable claim. Why is it false?
  // Play the game committed to true and see. Then fix it so it says what was intended.
  fof"∀x ∀y ((Sqr(x) ∧ Sqr(y)) → ∃z Btw(z, x, y))",

  // Why is this true, and the next false?
  fof"∀x (Btw(x, a, c) → Eq(x, b))",
  fof"∀x (∃y Btw(x, y, c) → Eq(x, b))", // Play committed to true.

  // Why is this true, but the next one is false?
  fof"∀x (∃y Btw(x, y, c) → ¬Big(x))",
  fof"∀x (∃y ∃z Btw(x, y, z) → ¬Big(x))", // Play committed to true.

  fof"∀x (∃y ∃z Btw(x, y, z) → Tri(x))",

  // Why is this false, but the next one is true?
  fof"∀x (¬ ∃y Lft(y, x) → Eq(x, a))",
  fof"∀x (¬ ∃y Lft(y, x) ∧ ¬ ∃y Bel(y, x) → Eq(x, a))",

  // Why is this true, but the next is false?
  fof"∀x (Red(x) → ∃y ∃z (Btw(x, y, z) ∧ Blu(y) ∧ Blu(z)))",
  fof"∀x (Red(x) → ∃y ∃z (Btw(x, y, z) ∧ Red(y) ∧ Red(z)))",
  fof"∀x (Blu(x) → ∃y ∃z (Btw(y, x, z) ∧ Red(y) ∧ Blu(z)))", // Why is this true?

  fof"∀x (∃y ∃z (Btw(x, y, z) ∧ Tri(y) ∧ Tri(z)) → x = e)",
  fof"∀x (∃y ∃z (Btw(x, y, z) ∧ Sqr(y) ∧ Sqr(z)) → Eq(x, b))",
  fof"∀x ∃y ∃z ((Btw(x, y, z) ∧ Eq(x, b)) → (Eq(y, a) ∨ Eq(y, c)))",

  // Do you see what this says?
  fof"∀x ∀y ((Tri(x) ∧ Tri(y) ∧ Sml(x) ∧ Sml(y)) → x = y)",

  // If you understand the previous one, you see why this is true as well.
  fof"∀x ∀y ((Cir(x) ∧ Cir(y) ∧ Sml(x) ∧ Sml(y)) → x = y)",

  // This may look like a dumb thing to say, but make sure you understand it.
  // Why is it true?
  fof"∀x (Cir(x) → Eq(x, b))",

  // And do you see why this is false? Under what circumstances would it be true?
  fof"∀x (Cir(x) ↔ Eq(x, b))",

  // This time, we got it right:
  fof"∀x ((Tri(x) ∧ Sml(x)) ↔ Eq(x, b))",

  // Compare this with the previous sentence. Do you understand what it says?
  // Play the game a couple of times, committed to both true and false.
  fof"∃y ∀x ((Tri(x) ∧ Sml(x)) ↔ x = y)",

  // Play the game here too. Do you see why you can't win when committed to true?
  fof"∃y ∀x ((Sqr(x) ∧ Sml(x)) ↔ x = y)"

  // In this slot, write a sentence that says there is exactly one large triangle.
  // Pattern it on the previous sentence.
)

@main
def runQ20 = runWorld(LeibnizWorld, LeibnizSentences)

// Play the game here with various sentences.
@main
def playQ20 = playGame(LeibnizWorld, ???) // add sentence here
