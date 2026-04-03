import tarski.main.*

val sentencesQ38 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ38 = runWorld(SkolemWorld, sentencesQ38)
