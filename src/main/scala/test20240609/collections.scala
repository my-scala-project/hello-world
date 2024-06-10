package test20240609

 @main def main(args: String*): Unit = {
   val g = List.range(1, 10,3);
   println(g)
   val firstTen = (1 to 10).toList
   println(firstTen.reduceLeft(_ + _))
   println(firstTen.foldLeft(100)(_ + _))
 }
