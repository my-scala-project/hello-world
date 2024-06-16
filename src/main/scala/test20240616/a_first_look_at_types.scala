package test20240616

@main def a_first_look_at_types(): Unit = {
  printIt(42)
  println("Hello, world!")
  strings()
}

//unit代表方法没有返回值,any是所有类型的超类，类似java中的object
def printIt(a: Any): Unit = println(a)

//下面的数据类型，前四个，如果没有指定数据类型则为int类型，下面的两个为double类型
//scala中默认的数据数据类型为int和double
def data_types(): Unit = {
  //指定数据类型
  val b: Byte = 1
  val i: Int = 1
  val l: Long = 1
  val s: Short = 1
  val d: Double = 2.0
  val f: Float = 3.0
  //未指定数据类型
  val m = 123 // defaults to Int
  val n = 1.0 // defaults to Double
}

//scala中的字符串
def strings(): Unit = {
  //三引号定义字符串，这种打印出来的字符串会有缩进
  val quote =
    """The essence of Scala:
                 Fusion of functional and object-oriented
                 programming in a typed setting."""
  println(quote)
  //去除缩进，靠左对齐
  val quote2 =
    """The essence of Scala:
       |Fusion of functional and object-oriented
       |programming in a typed setting.""".stripMargin
  println(quote2)
}

//bigint, bigdecimal
def decimalNumber(): Unit = {
  val a = BigInt(1_234_567_890_987_654_321L)
  val e = BigDecimal(123_456.789)
  val b = BigInt(1234567890) // scala.math.BigInt = 1234567890
  val c = b + b // scala.math.BigInt = 2469135780
  val d = b * b // scala.math.BigInt = 1524157875019052100
}

//类型转换的顺序是：Byte -> Short -> Int -> Long -> Float -> Double（char -> int）
//


