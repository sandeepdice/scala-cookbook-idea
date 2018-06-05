package c03

trait Animal
case class Cat(name: String) extends Animal
case class Dog(name: String) extends Animal
case class Woodpecker() extends Animal

object CaseClassMatching {
  def main(args: Array[String]): Unit = {
    println(printCaseClassType(new Cat("cat1")))
    println(printCaseClassType(new Woodpecker()))
    println(printCaseClassType(new Dog("my doggy")))
  }

  def printCaseClassType(x: Animal): String = {
    return x match {
      case _: Cat => "Got Cat 2" // whichever matches first is taken. Here, both case _:Cat and case Cat(_) matches. So, whichever defined first is taken
      case Cat(_) => "Got a no-name Cat"
      case Cat(name) => "Got Cat $name"

      case Dog(name) => s"Got $name"
      case _ => "Got unknow type"
        // if we want to use any object that doesn't implement Match, it has to be used like below:
        // we can't use case Exception(e)
      case e : Exception => "Got exception"
    }
  }
}