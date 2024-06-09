import java.io.{PrintWriter, StringWriter}

@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  println(sum(1, 2))
  println("100".makeInt(10))

def msg = "I was compiled by Scala 3. :)"

def sum(a: Int, b: Int): Int = a + b
def getStackTraceAsString(e: Throwable): String = {
  val sw = new StringWriter()
  val pw = new PrintWriter(sw)
  e.printStackTrace(pw)
  sw.toString
}

//定义字符串的扩展方法
extension(s: String)
  def makeInt(radix: Int): Int = Integer.parseInt(s, radix)