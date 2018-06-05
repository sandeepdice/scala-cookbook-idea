package c03

object S01 {
  def main(args: Array[String]): Unit = {
    val a = Array("first", "second", "third")
    for (e <- a) println(e)
    
    val newA = for(e <- a) yield e.toUpperCase()
    for(e <- newA) println(e)
    
    val newA2 = for(e <- a) yield {
      e.toUpperCase()
    }
    for(e <- newA2) println(e)
    
    for(i <- 0 until newA2.length) {
      println(s"$i is ${a(i)}")
    }
    
    println(s"\nzipwithindex")
    for((e, i) <- a.zipWithIndex) {
      println(s"$i is $e")
    }
    
    println("\n Range")
    for(i <- 1 to 3) {
      println(i)
    }
    
    println("Guards")
    for(i <- 1 to 10 if i<4) {
      println(i)
    }
    
    val names = Map("first" -> "Philip", "last" -> "Chuck")
    for((k,v) <- names) {
      println(s"$k -> $v")
    }
    
    println("\nforeach")
    a.foreach(println)
    
    println("\n foreach algo")
    a.foreach(e => println(e.toUpperCase()))
    
    println("\n foreach algo multiline")
    a.foreach { e => val s = e.toUpperCase()
      println(s)}
  }
}