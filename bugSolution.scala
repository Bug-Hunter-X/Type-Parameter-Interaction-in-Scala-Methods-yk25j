```scala
class MyClass[T](val value: T)(implicit num: Numeric[T]) {
  def myMethod(other: MyClass[T]): T = {
    num.plus(value, other.value)
  }
}

object Main extends App {
  val a = new MyClass(1)
  val b = new MyClass(2)
  val c = a.myMethod(b)
  println(c) // Output: 3
  // This will also work with other Numeric types
  val d = new MyClass(1.5)(implicitly[Numeric[Double]])
  val e = new MyClass(2.5)(implicitly[Numeric[Double]])
  val f = d.myMethod(e)
  println(f) //Output: 4.0
}
```