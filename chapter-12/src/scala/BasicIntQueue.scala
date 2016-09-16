import scala.collection.mutable.ArrayBuffer

/**
  * Created by Rahim.khan on 16-09-2016.
  */
class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]()

  override def get(): Int = buf.remove(0)

  override def put(x: Int) = {
    println("BasicIntQueue is Called !")
    buf += x
  }
}
