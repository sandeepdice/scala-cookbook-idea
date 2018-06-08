class MyClass {
  def method(): Unit = {
    println("In a instance method")
    println(s"Access static field from a instance method ${MyClass.staticField}")
  }
}

object MyClass {
  var staticField = 1
  def staticMethod() : Unit = {
    println("In a static method")
    println(s"Access static field from static method $staticField")
  }
}

object StaticsInScala extends App {
  MyClass.staticMethod()
  var obj = new MyClass
  obj.method()

}