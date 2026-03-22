import tarski.main.*

val sentencesQ10 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ10 = runWorld(MontagueWorld, sentencesQ10)
