# 14 - Vacuously true generalizations

- See `DodgsonSentences`.
- Note that the first sentence says that every triangle is big.
- Open `PeanoWorld` by running `runQ14a`.
- Sentence 1 is clearly false in this world, since
  the small triangle is a "counterexample" to the universal claim.
- This means that if you play the game committed to the
  falsity of this claim, then when Tarski's World asks you to pick an
  object you will be able to pick the small triangle and win the game. Try this.
- Delete this counterexample and verify that sentence 1 is now true.
- Now open `PeirceWorld` by running `runQ14b`.
- Verify that sentence 1 is again false this time because there are 3 counterexamples.
- Now if you play the game committed to the falsity of the sentence,
  you will have three different winning moves when asked to pick an object:
  you can pick any of the small triangles and win.
- Delete all three counterexamples, and evaluate the claim.
- Is the result what you expected?
- The generalization is true, because there are no counterexamples to it.
- But it is what we call a vacuously true generalization,
  since there are no objects that satisfy the antecedent.
  That is, there are no triangles at all, small, medium, or big.
- Confirm that all of sentences 1–3 are vacuously true in the current world.
- Two more vacuously true sentences are given in sentences 4 and 5.
  However, these sentences are different in another respect.
- Each of the first three sentences could have been non-vacuously true in a world,
  but these latter two can only be true in worlds containing no triangles.
  That is, the only way they can be true is to be vacuously true.

Let's call generalizations with this property "inherently vacuous."
Thus a sentence of the form ∀x (A(x) → B(x)) is inherently vacuous
if any world in which it is true is also a world in which ∀x ¬A(x) is true.

- Add a sixth generalization to the sentences that is vacuously true in `PeirceWorld`,
  but non-vacuously true in `PeanoWorld`.
  (In both cases, make sure you use the unmodified worlds.)
- Save your sentences.

In everyday conversation, it is rare to encounter a vacuously true generalization.
When we do, we feel that the speaker has misled us. For example, suppose a professor
claims "Every freshman who took the class got an A," when in fact no freshman took
her class. Here we wouldn't say that she lied, but we would certainly say that
she misled us. Her claim suggests that there were freshman in the class, and if
there were no freshman, then that's what she would have said if she were
being forthright. This is why inherently vacuous claims like sentence 5 strike us
as counterintuitive: we can see that they cannot be true without being misleading.
