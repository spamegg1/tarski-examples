import tarski.main.*

val sentencesQ31 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ31a = runWorld(BolzanoWorld, sentencesQ31)

@main
def runQ31b = runWorld(PittsWorld, sentencesQ31)

@main
def runQ31c = runWorld(VonNeumannWorld, sentencesQ31)

@main
def runQ31d = runWorld(PeanoWorld, sentencesQ31)
