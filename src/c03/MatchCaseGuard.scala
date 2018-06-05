package c03

object MatchCaseGuard {
  def main(args : Array[String]) : Unit = {
    trait Animal
    case class Cat(name : String) extends Animal
    
    
    
    var x = 10
    println(x match {
      case 11 => "11"
      case x if (x <= 10) => "1 to 9"
      case _ : Int => "Got Int"
      case _ => "default"
    })
    
    var cat1 = new Cat("cat19000")
    println ( cat1 match {
      case Cat(name) if name == "cat1" => "Got cat1"
      case Cat(name) if name != "cat1" => "Got a unknown cat"  
    })
    
  }
}