class Cat(name: String) extends Animal,TrailWagger {
  override def speak(): String = "meow"
  override def startWagger(): Unit = println("start wagger")
  override def stopWagger(): Unit = println("stop wagger")
}
