package c03

object TryCatchMatch {
  def main(args : Array[String]) : Unit = {
   try {
     var x= 10;
     println(x/0);
   } catch {
     case e : ArithmeticException => println ("Got ArithmeticException: " + e.getMessage)
     case e : Exception => println ("Got excception " + e)
   }
  }
}