import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest extends AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
    assert(CubeCalculator.cube(0) === 0)
  }
  
  test("Cat.method") {
    val cat = new Cat("Whiskers")
    println(cat.speak())
    cat.startWagger()
    cat.stopWagger()
  }
}