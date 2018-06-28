object ParitallyAppliedFunc extends App {

  // we can think of partially applied functions as alias.
  val c = scala.math.cos(_)

  println (c(0))
}
