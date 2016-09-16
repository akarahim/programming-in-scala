package org.learn.chapter10

/**
  * Created by Rahim.khan on 07-09-2016.
  */
class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
  private val line = ch.toString * width

  def contents = Array.fill((height))(line)
}
