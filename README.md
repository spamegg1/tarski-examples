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

If the window is too small or too large, you can pass an optional parameter to resize it:

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
to avoid repeatedly writing `Shape.`, `Sizes.` or `Tone.`.

### Blocks

Blocks have 3 attributes, each of which has 3 possible values:

|Attribute|value1|value2|value3|
|:-|:-|:-|:-|
|Tone|Blue|Green|Coral|
|Shape|Tri|Squ|Cir|
|Sizes|Small|Mid|Large|

Blocks can also have an optional name, only one of: `a, b, c, d, e, f`.
Other names are not allowed. Formulas can then refer to these names as constants.

### Grids

Then you can write a `Grid`, a map of positions `Pos` to `Block`s, to define the board.
It's an 8x8 standard chess board; coordinates are 0-indexed. For example:

```scala
val grid: Grid = Map(
  (1, 2) -> Block(Small, Tri, Green, "a"),
  (4, 3) -> Block(Mid, Tri, Blue),
  (5, 6) -> Block(Large, Cir, Coral, "d"),
  (6, 3) -> Block(Small, Squ, Blue)
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
|`Squ(x)`| "x is a square"|
|`Cir(x)`| "x is a circle"|
|`Blue(x)`| "x has color blue"|
|`Green(x)`| "x has color green"|
|`Coral(x)`| "x has color coral"|
|`Small(x)`| "x has size small"|
|`Mid(x)`| "x has size mid"|
|`Large(x)`| "x has size large"|

#### Binary

|Syntax|Semantics|
|:-|:-|
|`Left(x, y)`|"x is to the left of y"|
|`Right(x, y)`|"x is to the right of y"|
|`Below(x, y)`|"x is below y"|
|`Above(x, y)`|"x is above y"|
|`Adj(x, y)`|"x is adjacent (but not diagonally) to y"|
|`Less(x, y)`|"x is smaller in size than y"|
|`More(x, y)`|"x is larger in size than y"|
|`Row(x, y)`|"x is on the same row as y"|
|`Col(x, y)`|"x is on the same column as y"|
|`Size(x, y)`|"x has the same size as y"|
|`Shape(x, y)`|"x has the same shape as y"|
|`Tone(x, y)`|"x has the same tone as y"|
|`x = y`|"x is equal to y (in size, shape and tone)"|

#### Ternary

|Syntax|Semantics|
|:-|:-|
|`Betw(x, y, z)`|"x is between y and z (vertically, horizontally or diagonally)"|

## Work in progress

Stay tuned!
