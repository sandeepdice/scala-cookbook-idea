abstract class Animal {
  val greeting = { println("Animal"); "Hello" }
}

class Dog extends Animal {
  override val greeting = { println("Dog"); "Woof" }
}

object Test extends App {
  new Dog
}
