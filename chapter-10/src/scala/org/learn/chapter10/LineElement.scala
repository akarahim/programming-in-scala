package org.learn.chapter10

/**
  * Created by Rahim.khan on 07-09-2016.
  */
class LineElement(s: String) extends Element {
  val contents = Array(s)

  override def width = s.length

  override def height = 1
}


