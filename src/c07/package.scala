package c07 {
  class C07Class {
    override def toString: String = "From C07Class.toString"
  }

  package c07Nested {
    class C07NestedClass {
      override def toString: String = "From c07NestedClass.toString"
    }

    package c07InnermostPackage {
      class C07InnerMostClass {
        override def toString: String = "From c07InnermostPackage.toString"
      }
    }
  }
}
