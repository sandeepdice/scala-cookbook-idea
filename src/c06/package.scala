package object c06 {
  var varInPackage = 10
// everything defined in package.scala is visible in all objects / classes defined in the package
  object PackageObject {
    var a = 1
  }
}
