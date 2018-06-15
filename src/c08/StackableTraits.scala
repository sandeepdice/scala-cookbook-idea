// https://www.artima.com/scalazine/articles/stackable_trait_pattern.html

/**
  * One way to use Scala's traits is as stackable modifications. In this pattern, a trait (or class) can play one of three roles: the base, a core, or a stackable.
  * The base trait (or abstract class) defines an abstract interface that all the cores and stackables extend, as shown in Figure 1.
  * The core traits (or classes) implement the abstract methods defined in the base trait, and provide basic, core functionality.
  * Each stackable overrides one or more of the abstract methods defined in the base trait, using Scala's abstract override modifiers, and provides some behavior and at some point invokes the super implementation of the same method.
  * In this manner, the stackables modify the behavior of whatever core they are mixed into.
  */

import scala.collection.mutable.ArrayBuffer

trait IntQueue {
  def put(x : Int)
  def get() : Int
}

class BasicIntQueu extends IntQueue {
  val array = new ArrayBuffer[Int]()

  def get(): Int = {
    array.remove(0)
  }

  def put(x: Int): Unit = {
    array += x
  }
}

trait Incrementing extends IntQueue {
  // ************ notice both abstract and override keywords are used **************
  abstract override def put(x: Int): Unit = {super.put(x+1)}
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int): Unit = {
    if(x>=0) super.put(x)
  }
}

object StackableTraits extends App {
  // when a trait is added to a class, it's called mix-in
  var queue : IntQueue = new BasicIntQueu with Incrementing with Filtering

  // this calls rightmost trait's method first and goes backwards
  queue.put(-1)
  queue.put(0)
  queue.put(1)

  println(queue.get())
  println(queue.get())
//  println(queue.get())
}