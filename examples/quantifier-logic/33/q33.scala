import tarski.main.*

val sentencesQ33 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ33a = runWorld(PittsWorld, sentencesQ33)

@main
def runQ33b = runWorld(BolzanoWorld, sentencesQ33)

@main
def runQ33c = runWorld(WittgensteinWorld, sentencesQ33)
