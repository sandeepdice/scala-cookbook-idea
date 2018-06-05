package c04

object Traits {
  def main(args: Array[String]): Unit = {
    var dog = new Dog("Concrete Dog")
    dog.aAbsVarField = "Dog's Concrete field"
    println(dog.aAbsVarField)
    println(dog)
  }
}

trait Animal {
  var aVarField : String
  val bValField : String
  def method()
}

// traits don't have constructor params
//trait Animal(name : String);

// abstract classes can have constructor
abstract class AnimalAbstractClass(name : String) {
  def absMethod
  var aAbsVarField : String
  val bAbsValField : String = s"From AnimalAbstractClass $name"

  def sayHello = { println(s"Hello, $aAbsVarField")}

  override def toString: String = s"AnimalAbstractClass, aAbsVarField: $aAbsVarField, bAbsValField: $bAbsValField"
}

class Dog (name : String) extends AnimalAbstractClass (name : String) {
  override def absMethod: Unit = { println("Doggy's absMethod")}
  var aAbsVarField : String = s"$aAbsVarField, name"
}