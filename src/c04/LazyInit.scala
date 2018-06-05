package c04

import java.io.FileNotFoundException

object LazyInit {
  def main(args : Array[String]): Unit = {
    var foo = new Foo();
    println(foo.field)
  }
}

class Foo {
  // field is ***NOT*** lazy. lazy val's has *lazy* keyword before them
  var field = {
    var lines = ""
    try {
      lines = io.Source.fromFile("/tmp/file.txt").getLines.mkString
    } catch {
      case x : FileNotFoundException => "File reading error"
    }
  }
//  println(field)

  lazy val lazyval = {
    println(io.Source.fromFile("/tmp/file.txt").getLines.mkString)
  }
}