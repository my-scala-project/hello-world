package test20240616

//字符串插值
//scala提供了三种字符串插值，包括s，f，raw
@main def string_interpolation(): Unit = {
  println(string_introduction())
  println(s_intrpolator())
  println(f_interpolator())
  println(raw_interpolator())
  custom_interpolation()
}
//介绍
//$name和$age相当于调用了name.toString()和age.toString()
def string_introduction(): Unit = {
  val name = "james"
  val age = 10
  println(s"$name is $age years old")
}
//s 允许在字符串中使用变量
def s_intrpolator(): Unit = {
  println(s"1 + 1 = ${1 + 1}")
  val x = -1
  println(s"x.abs = ${x.abs}")
  println(s"NEW OFFERS STARTING AT $$14.99") //可以正确的打印出$
  println(s"""{"name":"james"}""") //通过三引号转义双引号，以字符串的形式打印
  val name = "james"
  val age = 10
  println(
    s"""name: $name,
       |age: $age""".stripMargin) //多行字符串插值
}
//f 创建被格式化的字符串
def f_interpolator(): Unit = {
  val height = 1.9d
  val name = "James"
  println(f"$name%s is $height%2.2f meters tail") //如果变量后面没有格式化字符，默认为%s

  val height1: Double = 1.9d
//  println(f"$height1%4d") double类型格式化为int类型，编译报错
  println(f"3/19 is less thdan 20%%")  // %%代表%
}
//raw 和s的使用类似，但其不会转义字符串的值
def raw_interpolator(): Unit = {
  println(raw"a\nb") //a\nb
  println(s"a\nb") // a  b
}
//自定义插入值
def custom_interpolation(): Unit={
  val x = 12.0
  val point1 = p"1,-1"
  println(point1)
  val point2 = p"$x,${x * 2}"
  println(point2)
}

extension(sc: StringContext)
  def p(args: Double*): Point={
    val pts = sc.s(args: _*).split(",", 2).map{_.toDoubleOption.getOrElse(0.0)}
    Point(pts(0), pts(1))
  }


case class Point(x: Double, y: Double)
