# Tarski examples

This is a companion repository to [Tarski](https://github.com/spamegg1/tarski).

Latest is 1.0.1 (Apr 09, 2026) staying in sync with the main repository.

## Usage

You will need a JVM, and Scala 3. [This](https://www.scala-lang.org/download/)
should give you everything you need.

An easier way is to install [Scala-cli](https://scala-cli.virtuslab.org/install)
which can automatically install a JVM for you.

To work through the examples, install `git`, clone this repository with

```bash
git clone https://github.com/spamegg1/tarski-examples
```

then open the folder in your IDE (Visual Studio Code with Metals extension,
or IntelliJ with Scala plugin).

Each example has a README with instructions.
In some examples, you might have to write some formulas first, before executing.

To interact, execute the `@main` methods with names like `run02a` etc.

![runWorld](https://github.com/user-attachments/assets/c1afff52-5d38-419d-9d9f-f03720259b89)

If the window is too small or too big, you can pass an optional parameter to resize it:

```scala
// Make the window smaller, shrink it to 80% size
@main
def run01a = runWorld(LeibnizWorld, RebusSentences, 0.8)
```

## Examples

There are 79 examples in total. The first 28 are for Propositional Logic and
the last 51 are for Quantifier Logic, getting more difficult as you progress.

### Note on equality

There are two kinds of equality used in the examples.

Reference equality a.k.a "identity" (or "identical" when used as an adjective) means that
two names `a, b` are referring to the same block, and is implemented using `a = b`.
So in this case `a` and `b` have the same location (row and column) on the board.

Value equality a.k.a "equality" (or "equal" when used as an adjective) means that two
blocks `a, b` are equal in size, shape and tone, and is implemented using `Eq(a, b)`.
