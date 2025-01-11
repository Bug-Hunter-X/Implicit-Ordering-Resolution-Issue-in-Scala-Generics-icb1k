# Implicit Ordering Resolution Issue in Scala Generics

This repository demonstrates a subtle issue related to implicit Ordering resolution in Scala when working with generics.  The `MyClass` class attempts to use an implicit `Ordering` instance within its `myMethod`.  While this works for types like `Int` and `String` (which have default `Ordering` instances), it can lead to unexpected behavior or compilation errors with custom types or types lacking implicit `Ordering` instances.

The `bug.scala` file shows the code that exhibits the issue. The `bugSolution.scala` file provides a solution that shows better handling of missing implicit Orderings and shows how to make use of the `Option` type to handle this scenario.

## How to Reproduce

1. Clone this repository.
2. Navigate to the project directory.
3. Compile and run the `bug.scala` file. Observe the unexpected or missing output.
4. Then compile and run `bugSolution.scala` to see the correct solution.
