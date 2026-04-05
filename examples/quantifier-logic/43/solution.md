# 43 - solution

1. There's a sucker born every minute.

    ∀x (Minute(x) → ∃y (Sucker(y) ∧ Born(y, x)))

    - Predicate Minute(x) means that x is a minute.
    - Predicate Sucker(y) means that y is a person who is a sucker.
    - Predicate Born(y, x) means that person y is born on the minute x.

    Shortcoming: the domain of discourse is confusing.
    Variables like x, y are ranging over the union of people and time.
    Minutes are not even objects, they are periods of time.
    With "mixed type domains" like this, the predicates have to be false
    by default on some of the types (Minute(x) should be always false
    whenever x is a person, Sucker(y) should always be false when y is a time).

2. Whither thou goest, I will go.

    It's a Bible passage. "Whither" means "to what place".
    So it means "wherever you go, I will go (to the same place with you)".

    ∀x (Place(x) ∧ Go(You, x) → Go(I, x))

    - Name "You" means you or "thou", the other person mentioned in the sentence.
    - Name "I" means I, the person who is speaking the sentence.
    - Predicate Place(x) means that x is a place (that one can go to).
    - Predicate Go(person, place) means that person goes to the place.

    Shortcoming: similar to before, the domain of discourse is confusing.
    Variables range over places, but the names refer to people.
    So the domain seems to be the union of places and people.

3. Soothsayers make a better living in the world than truthsayers.

    ∀x ∀y (Soothsayer(x) ∧ Truthsayer(y) → Better(Living(x), Living(y)))

    - Predicate Soothsayer(x) means person x is a soothsayer.
    - Predicate Truthsayer(y) means person y is a truthsayer.
    - Function Living(x) consumes person x and produces the living (money)
      that x makes in the world.
    - Predicate Better(a, b) means a is a bigger amount of money than b.

    Shortcoming: some predicates talk about people,
    while other predicates talk about numbers (amounts of money).
    So the domain of discourse is the union of people and numbers.

4. To whom nothing is given, nothing can be required.

    ∀x ∀y (¬ ∃z Give(x, z, y) → ¬ ∃w Require(x, w, y))

    - Predicate Give(x, z, y) means person x gives thing z to person y.
    - Predicate Require(x, w, y) means person x requires thing w from person y.

    Shortcoming: domain of discourse is the union of people and things.

5. If you always do right, you will gratify some people and astonish the rest.

    ∀x (AlwaysDoRight(You) → (Gratify(You, x) ∨ Astonish(You, x)))

    - Predicate AlwaysDoRight(x) means person x always does right.
    - Predicate Gratify(y, x) means person y gratifies person x.
    - Predicate Astonish(y, x) means person y astonishes person x.

    Shortcoming: the domain of discourse is fine this time, it's just people.
    But the conclusion is stated as: gratify OR astonish.
    This is not exactly an accurate translation, the statement says
    "astonish the rest", implying that people are either gratified or astonished,
    but not both (so it sounds more like an exclusive OR, a.k.a XOR).
