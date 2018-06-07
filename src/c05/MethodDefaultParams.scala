
object MethodDefaultParams {
  def main(args: Array[String]): Unit = {
    method()
    method("parameter1")
    method("parameter1" , 10)
    method(param1 = "parameter2", param2 = 100)
  }

  def method(param1 : String ="default",param2 : Int=1) : Unit = {
    println(s"param1: $param1 and param2: $param2")
  }

//  can't overload methods sometimes when default values are specified for parameters
  // ideally compiler should be able to resolve which method to invoke
  /*
  def method(param1 : String = "default", param2 : String = "default2", param3 : Int = 10) : Unit = {
    println(s"param1: $param1 and param2: $param2 and param3 = $param3")

  } */
}