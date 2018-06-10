import c07.c07Nested.c07InnermostPackage.C07InnerMostClass

object ImportTest extends App {
  import c07.C07Class

  println(new C07Class)
  method()

  def method() : Unit = {
    import c07.c07Nested.C07NestedClass

    println(new C07NestedClass)

    import c07._

    println(new C07InnerMostClass)
  }
}
