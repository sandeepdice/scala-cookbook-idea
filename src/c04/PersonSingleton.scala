package c04

class PersonSingleton private (var firstName: String, var lastName: String) {
  override def  toString() : String = s"first name: $firstName, last name: $lastName"
}

object PersonSingleton {
  val person1Singleton = new PersonSingleton("singleton firstname", "singleton lastname")
  def getInstance(): PersonSingleton = person1Singleton
  def getFirstName() = person1Singleton.firstName
}