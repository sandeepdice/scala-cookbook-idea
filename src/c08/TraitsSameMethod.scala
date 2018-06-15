trait A02 {
  def methodA(str : String) { println("In default implementation of A02")}
}

trait anotherA {
  def methodA(str : String) { println("In default implementation of anotherA")}
}

object TraitsSameMethod extends App with  A02 with anotherA {
  // can specify with trait's method to be called
  override def methodA(str: String): Unit = {
    super[A02].methodA("")
    super[anotherA].methodA("")
  }
  println(methodA("test method"))
}