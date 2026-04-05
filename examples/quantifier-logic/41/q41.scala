import tarski.main.*

val sentencesQ41 = Seq(
  // add your sentence pairs here! ~&|-><->!? or¬∧∨→↔∀∃
)

@main
def runQ41 = runWorld(CarrollWorld, sentencesQ41)
