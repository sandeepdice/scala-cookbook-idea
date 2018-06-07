package c05

object FluentEx1 {
  def main(args: Array[String]): Unit = {
    println("Builder pattern")
  }
}

class Person (var firstName : String, var lastName : String) {

  def setFirstName(firstName : String) : this.type = {
    this.firstName = firstName
    this
  }

  def setLastName(lastName : String) : this.type = {
    this.lastName = lastName
    this
  }
}


