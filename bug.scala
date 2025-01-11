```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): T = {
    //Some code that uses the Ordering[T] implicitly 
    value
  }
}

//This works fine
object Main extends App {
  val instanceInt = new MyClass(10)
  println(instanceInt.myMethod)
  val instanceString = new MyClass("hello")
  println(instanceString.myMethod)
}
```