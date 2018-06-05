package c04

object SubClass {
  def main(args: Array[String]): Unit = {
    var superstar = new SuperStar("sup1", 10)
    var star = new Star("star1", 20, "sup1")
    
    println(star.senior)
  }
}

class SuperStar(var name : String, var age : Int)

class Star(name : String, age : Int, var senior : String) extends SuperStar(name, age)