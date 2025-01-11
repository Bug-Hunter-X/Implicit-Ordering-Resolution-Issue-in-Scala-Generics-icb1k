```scala
class MyClass[T](val value: T) {
  def myMethod(implicit ev: Ordering[T]): Option[T] = {
    try {
      Some(value) 
    } catch {
      case e: scala.MatchError => None
    }
  }
}

object Main extends App {
  val instanceInt = new MyClass(10)
  println(instanceInt.myMethod)
  val instanceString = new MyClass("hello")
  println(instanceString.myMethod)
  val instanceCustom = new MyClass(new CustomClass(10))
  println(instanceCustom.myMethod)
}

case class CustomClass(value: Int) //Example of a custom class without an implicit ordering
```