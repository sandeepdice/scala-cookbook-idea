package c04

class Person2 private(var firstName: String, var lastName: String) {
  override def  toString() : String = s"first name: $firstName, last name: $lastName"
}

object Person2 {
  val person1Singleton = new Person2("singleton firstname", "singleton lastname")
  def getInstance(): Person2 = person1Singleton
  def getFirstName() = person1Singleton.firstName
}