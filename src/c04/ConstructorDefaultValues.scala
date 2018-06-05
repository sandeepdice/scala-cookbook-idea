package c04

class ConstructorDefaultValues(var var1: String = "default var1", var var2 : String = "default var2") {
  override def toString() = s"$var1 , $var2"
}

object ConstructorDefaultValues extends App {
  override def main(args: Array[String]): Unit = {
    var cDVInstance = new ConstructorDefaultValues()
    println(cDVInstance)
  }
}