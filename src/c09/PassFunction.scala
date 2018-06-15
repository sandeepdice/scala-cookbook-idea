object PassFunction extends App {
  var list = List.range(1,10).filter((i : Int) => i%2==0)

  println(list)

  list = List.range(20,30).filter( _ %2 == 0)
  println(list)

  List.range(1,20).foreach(println)

  var func = (i: Int) => i*2
  list = List.range(1,20).map(func)
  println(list)

  /*
  * checking if we can write a function
  * */
  def function(a : Int) : Unit = {
    println("test function")
  }

  function(1)

  /*
* checking if we can write a function inside another function
* */
  def function2(a : Int) : Unit = {
    println(s"Calling nested function with param ${a+10}")
    function(a+10)
    def function(a : Int) : Unit = {
      println(s"nested  function received param ${a}")
    }
  }

  function2(1)
}

// good explanation of Expression Oriented Programming here: https://alvinalexander.com/scala/how-to-use-functional-literals-anonymous-functions-in-scala
// in eop, every statment yields a value.