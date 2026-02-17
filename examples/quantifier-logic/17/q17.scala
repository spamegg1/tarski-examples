import tarski.main.*, Sizes.*, Shape.*, Tone.*

val worldQ17: Grid = Map(
)

val RamseySentences2 = Seq(
  fof"∀x ¬Abv(x, d)",
  fof"∀x ((Sqr(x) ∧ Big(x)) → Loc(x, e))", // ¬∧∨→↔∀∃
  fof""                                    // ¬∧∨→↔∀∃
)

@main
def runQ17 = runWorld(worldQ17, RamseySentences2)
