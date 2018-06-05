package c04

object Constructor {
  def main(args: Array[String]): Unit = {
    val p = new Person("first", "last")
    println(p.firstName);
    p.firstName = "new first name"
//    p.lastName = "new last name"
    // doesn't work as lastName is val
    println(p)
    
    println(new Person())
  }
}

class Person(var firstName: String, val lastName: String) {
  override def toString() : String = s"$firstName, $lastName"
  
  def this(firstName : String) = {
    this(firstName, "DEFAULT_LASTNAME")
  }
  
  def this() = {
    this("DEFAULT_FIRSTNAME", "DEFAULT_LASTNAME")
  }
}