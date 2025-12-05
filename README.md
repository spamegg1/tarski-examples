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

## Work in progress

Stay tuned!
