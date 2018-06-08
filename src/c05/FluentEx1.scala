package c05

object FluentEx1 {
  def main(args: Array[String]): Unit = {
    println("Builder pattern")

    var p1 = new Person().setFirstName("fn").setLastName("ln").setAge(10)
    println(p1)
    var e1 = new Employee().setLastName("eln").setFirstName("efn").setAge(35).setEmployeeId(25)
    print(e1)
  }
}

class Person () {
  var age : Int = 0

  def setAge(i: Int): this.type =  {
    this.age = i
    this
  }

  var firstName : String = ""
  var lastName : String = ""

  def setFirstName(firstName : String) : this.type = {
    this.firstName = firstName
    this
  }

  def setLastName(lastName : String) : this.type = {
    this.lastName = lastName
    this
  }

  override def toString() : String = {
    "%s %s %d".format(firstName, lastName, age)
  }
}


class Employee extends Person {
  var employeeId : Int = 0

  def setEmployeeId(eid : Int) : this.type = {
    employeeId = eid
    this
  }

  override def toString() : String = {
    "%s %s %s %s".format(firstName, lastName, age, employeeId)
  }
}