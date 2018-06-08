
object InstanceOf {
  def main(args: Array[String]): Unit = {
    method(1)
    method("1")
    method("{json_doc: value}") // string
//    var v = <p>paragrah</p>
//    method(v)
  }

  def method(a : Any) : Unit = {
    println(s"type of parameter: ${a.getClass}")
  }
}