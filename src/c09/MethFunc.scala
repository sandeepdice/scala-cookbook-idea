object MethFunc extends App {

  def method(i : Int) = {println(i%2 == 0)}
  /*
  A function value is an object, and extends the FunctionN traits in the main scala package, such as Function0 for a function that takes no parameters.
   */
  val func = (i:Int) => i%2==0

  def methodTakesAFunctionWithOneParam(i:(Int)=>Unit) = {}
  def methodTakesAFunctionWithNoParam(callback:()=>Unit) = {}
}