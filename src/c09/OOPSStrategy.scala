object OOPSStrategy extends App {
  def methodTakesAFunc(func : Int => Unit) = {func(1)}
  def methodTakesAFuncTwoParams(func : (Int, String) => Unit) = {
    // my algo starts here
    // call the strategy passed
    func(1, "string")
    // my algo continues here
  }

  // var or val doensn't matter for functions
  var  oneArgFunc = (i : Int) => {
    println("One arg function called")
  }

  val twoArgFunc = (i : Int, s : String) => {
    println("Two arg function called")
  }



  methodTakesAFunc(oneArgFunc)

  methodTakesAFuncTwoParams(twoArgFunc)
}