# 12 - Translating universal noun phrases

Universal noun phrases are those that begin with determiners like "every", "each",
and "all". These are usually translated with the universal quantifier.
Sometimes noun phrases beginning with "no" and with "any" are also
translated with the universal quantifier.

Enter translations in `sentencesQ12` of the following sentences.
This time each translation will contain exactly one ∀ and no ∃.
(You can use ¬ as you like.)

1. All squares are small and blue.
2. Each small square is to the right of a.
3. a is to the left of every blue block and every lime block.
4. Every medium triangle is below b.
5. Each square is either below b or above a.
6. Every square is to the right of a and to the left of b.
7. Everything between a and b is a square.
8. Everything smaller than a is blue.
9. No circle is small.
    (Note: it would be more natural to express it as: "¬∃x ..."
    but here you need to express it with exactly one ∀.)
10. All circles are not small.
    (Note: Most people find this sentence ambiguous.
    Can you find both readings?
    One starts with ∀, the other with ¬.
    The first has the same meaning as 9: "all circles are mid or big".
    So, use the second, the one that means: "not all circles are small".)
11. a does not adjoin everything.
    (Note: This sentence is ambiguous.
    We want you to interpret it as a denial of the claim that a adjoins everything.)
12. a does not adjoin anything.
    (Note: These last two sentences mean different things,
    though they can both be translated using ∀, ¬, and Adj.)
13. a is not to the right of any square.
14. If something is a square, then it is not in the same column as either a or b.
    (Warning: While this sentence contains the noun
    phrase "something," it is actually making a universal claim, and so
    should be translated with ∀. You might first try to paraphrase it
    using the English phrase "every square.")
15. Something is a square if and only if it is not in the same column as either a or b.

Now let’s check the translations in some worlds.

- Open `ClaireWorld`.
- Check to see that all the English sentences are true in this world,
- then make sure the same holds of your translations.
- If you have made any mistakes, fix them.
- Adjust `ClaireWorld` by moving `a` directly below `c`.
- Now, English sentences 2, 3, 6, and 12–15 are false, while the rest are true.
- Make sure that the same holds of your translations.
- If not, try to figure out what is wrong and fix it.
- Next, open `WittgensteinWorld`.
- Observe that the English sentences 2, 7, 8, and 10-13 are true, but the rest are false.
- Check that the same holds for your translations.
- If not, try to fix them.
- Finally, open `VennWorld`.
- English sentences 2, 4, 7, and 10–14 are true. What about your translations?
- When you are satisfied that your translations are correct, save your sentence file.
