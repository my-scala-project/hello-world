import org.scalatest.funsuite.AnyFunSuite

class PersonTest extends AnyFunSuite{
  test("PersonTest"){
    val person = new Person("John", 1)
    println(person.printFullName())
  }
}
