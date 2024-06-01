class Person (name: String, age: Int) {
  def getName: String = name
  def getAge: Int = age

  def printFullName() = println(s"$name is $age years old")
}
