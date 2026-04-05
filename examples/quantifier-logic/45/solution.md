# 45 - solution

1. Only the brave know how to forgive.

    ∀x (KnowHowToForgive(x) → Brave(x))

    Domain of discourse is people.

2. No man is an island.

    ¬ ∃x (Man(x) ∧ Island(x))

    Domain of discourse is people.

3. I care for nobody, not I, If no one cares for me.

    ¬ ∃x Cares(x, I) → ¬ ∃x Cares(I, x)

    Domain of discourse is people.

4. Every nation has the government it deserves.

    ∀x (Nation(x) → ∃y (HasGovernment(x, y) ∧ Deserves(x, y)))

    Domain of discourse is "groups of people".
    So, a group of people can be "a nation" or can be "a government".
    Predicate HasGovernment(x, y) means group x has group y as their government.
    Predicate Deserves(x, y) means group x deserves group y.

5. There are no certainties, save logic.

    ¬ ∃x (¬Logic(x) → Certainty(x))

    Domain of discourse is ideas/thoughts/concepts.

6. Misery (that is, a miserable person) loves company.

    ∀x (Miserable(x) → LovesCompany(x))

    Domain of discourse is people.

7. All that glitters is not gold. (ambiguous)

    ¬ ∀x (Glitters(x) → Gold(x))
    ∀x (Glitters(x) → ¬Gold(x))

    Domain of discourse is things.

8. There was a jolly miller once Lived on the River Dee.

    ∃x (JollyMiller(x) ∧ Lived(x, RiverDee))

    Domain of discourse is people. RiverDee is a name.

9. If you praise everybody, you praise nobody.

    ∀x Praise(You, x) → ¬ ∃x Praise(You, x)

    Domain of discourse is people. You is a name.

10. Something is rotten in the state of Denmark.

    ∃x (InDenmark(x) ∧ Rotten(x))

    Domain of discourse is things/events.
