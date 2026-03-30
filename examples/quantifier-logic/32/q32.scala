import tarski.main.*

val sentencesQ32 = Seq(
  // add your sentences here! ~&|-><->!? or ¬∧∨→↔∀∃
)

@main
def runQ32a = runWorld(PittsWorld, sentencesQ32)

@main
def runQ32b = runWorld(BolzanoWorld, sentencesQ32)

@main
def runQ32c = runWorld(WittgensteinWorld, sentencesQ32)
