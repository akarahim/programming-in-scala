trait HasLegs

/**
  * Created by Rahim.khan on 16-09-2016.
  */
class Animal

class Frog extends Animal with Philosophical with HasLegs {

  override def philosophize(): Unit = println(s"It ain't easy being $toString!")

  override def toString: String = "green"
}
