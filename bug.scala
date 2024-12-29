```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    value + other.value 
  }
}

object Main extends App {
  val a = new MyClass(1)
  val b = new MyClass(2)
  val c = a.myMethod(b)
  println(c) // Compilation error if T is not a numeric type 
}
```