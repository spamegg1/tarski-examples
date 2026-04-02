import tarski.main.*

val sentencesQ36 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ36 = runWorld(SkolemWorld, sentencesQ36)
