package c03

import java.io._

object VarsInTryCatchFinally {
  def main(args : Array[String]) : Unit = {
    // remember this as: var X has no option yeT. 
    // T is in caps to remember the Type.
    var x = None : Option[FileInputStream]
    try {
      x = Some(new FileInputStream("/tmp/a.txt"))
      // x = new FileInputStream("/tmp/a.txt")
      // this will not work because x is of type of Option but not FileInputStream
    } catch {
      case e : Exception => println("caught exception")
    } finally {
      // to get the object pointed in the Option, we need to use get on the Option
      if(x.isDefined) x.get.close
    }
  }
}