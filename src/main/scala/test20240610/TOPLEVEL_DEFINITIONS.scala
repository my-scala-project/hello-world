package test20240610

/**
 * toplevel_definitions
 *
 *@author jwl
 *@date 2024/6/10
 */

import scala.collection.mutable.ArrayBuffer
enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions, Mushrooms, Sausage, Anchovies

import Topping.*
class Pizza:
  //创建ArrayBuffer类型为Topping
  val toppings = ArrayBuffer[Topping]()

val p = Pizza()

extension (s: String)
  def capitalizeAllWords: String = s.split(" ").map(_.capitalize).mkString(" ")

val hwUpper = "hello world".capitalizeAllWords
//type关键字创建类型别名，可以使用Money代替BigDecimal
type Money = BigDecimal

//replace package object
package foo{
  def double(i: Int) = i * 2
}
package foo{
  package bar{
    @main def fooBarMain =
      println(s"${double(2)}")
  }

}

@main def toplevel_definitions: Unit =
  p.toppings += Cheese
  //只会打印Cheese
  p.toppings.foreach(item => println(item))
  println("show me the money".capitalizeAllWords)
