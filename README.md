# Tarski examples

This is a companion repository to [Tarski](https://github.com/spamegg1/tarski).

## Usage

To work through the examples, clone this repository with

```bash
git clone https://github.com/spamegg1/tarski-examples
```

then open the folder in your IDE (Visual Studio Code with Metals extension,
or IntelliJ with Scala plugin).

Each example has a README with instructions.
In some examples, you might have to write some formulas first, before executing.

To interact, execute the `@main` methods with names like `run02a` etc.

![runWorld](images/runWorld.png)

If the window is too small or too big, you can pass an optional parameter to resize it:

```scala
// Make the window smaller, shrink it to 80% size
@main
def run01a = runWorld(WittgensteinWorld, WittgenSteinSentencesA, 0.8)
```

## Exercises

There are 79 examples in total. The first 28 are for Propositional Logic and
the last 51 are for First-Order Logic, getting more difficult as you progress.

Some info from [Tarski](https://github.com/spamegg1/tarski) is repeated here:

### Imports

All you need is to `import tarski.main.*`.
Optionally you can also `import Shape.*, Sizes.*, Tone.*`
to avoid repeatedly writing `Shap.`, `Sizes.` or `Tone.`.

### Blocks

Blocks have 3 attributes, each of which has 3 possible values:

|Attribute|value1|value2|value3|
|:-|:-|:-|:-|
|Tone|Blu|Lim|Red|
|Shap|Tri|Sqr|Cir|
|Sizes|Sml|Mid|Big|

Blocks can also have an optional name, only one of: `a, b, c, d, e, f`.
Other names are not allowed. Formulas can then refer to these names as constants.

### Grids

Then you can write a `Grid`, a map of positions `Pos` to `Block`s, to define the board.
It's an 8x8 standard chess board; coordinates are 0-indexed. For example:

```scala
val grid: Grid = Map(
  (1, 2) -> Block(Sml, Tri, Lim, "a"),
  (4, 3) -> Block(Mid, Tri, Blu),
  (5, 6) -> Block(Big, Cir, Red, "d"),
  (6, 3) -> Block(Sml, Sqr, Blu)
)
```

### Formulas

Then you can write a list of first-order logic formulas, `FOLFormula`
(courtesy of [Gapt](https://github.com/gapt/gapt)).

The formulas use a special string interpolator `fof"..."`,
and can use the Unicode symbols or their ASCII equivalents for logical connectives:

|Connective|ASCII|Unicode|
|:-|:-|:-|
|and|`&`|`∧`|
|or|`\|`|`∨`|
|not|`-`|`¬`|
|implies|`->`|`→`|
|biconditional|`<->`|`↔`|
|forall|`!`|`∀`|
|exists|`?`|`∃`|

### Predicates for atomic formulas

The following predicates are supported:

#### Unary

|Syntax|Semantics|
|:-|:-|
|`Tri(x)`| "x is a triangle"|
|`Sqr(x)`| "x is a square"|
|`Cir(x)`| "x is a circle"|
|`Blu(x)`| "x has color blue"|
|`Lim(x)`| "x has color lime"|
|`Red(x)`| "x has color red"|
|`Sml(x)`| "x has small size"|
|`Mid(x)`| "x has medium size"|
|`Big(x)`| "x has big size"|

#### Binary

|Syntax|Semantics|
|:-|:-|
|`Left(x, y)`|"x is to the left of y"|
|`Rgt(x, y)`|"x is to the right of y"|
|`Bel(x, y)`|"x is below y"|
|`Abv(x, y)`|"x is above y"|
|`Adj(x, y)`|"x is adjacent (but not diagonally) to y"|
|`Less(x, y)`|"x is smaller in size than y"|
|`More(x, y)`|"x is larger in size than y"|
|`Row(x, y)`|"x is on the same row as y"|
|`Col(x, y)`|"x is on the same column as y"|
|`Size(x, y)`|"x has the same size as y"|
|`Shap(x, y)`|"x has the same shape as y"|
|`Tone(x, y)`|"x has the same tone as y"|
|`x = y`|"x is equal to y (in size, shape and tone)"|

#### Ternary

|Syntax|Semantics|
|:-|:-|
|`Btw(x, y, z)`|"x is between y and z (vertically, horizontally or diagonally)"|

## Work in progress

Stay tuned!
