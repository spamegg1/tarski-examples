import tarski.main.*

val sentencesQ29 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ29 = runWorld(PeanoWorld, sentencesQ29)
