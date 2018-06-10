trait A {
  def methodA
}

trait B {
  def methodB
}

trait C {
  def methodC
}

class Conc1 extends A with B {
  override def methodA: Unit = {}

  override def methodB: Unit = {}
}

abstract class Abs1 extends A with B {

}

class SubClass extends Conc1 with C {
  override def methodC: Unit = ???
}


abstract class Abs2 extends A with B with C {

}


/**
  *
    If a class extends one trait, use the extends keyword.
    If a class extends multiple traits, use extends for the first trait and with to extend (mix in) the other traits.
    If a class extends a class (or abstract class) and a trait, always use extends before the class name, and use with before the trait name(s).

    https://alvinalexander.com/scala/how-to-use-scala-trait-like-java-interface-cookbook
  **/