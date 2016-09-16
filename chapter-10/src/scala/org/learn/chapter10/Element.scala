package org.learn.chapter10

/**
  * Created by Rahim.khan on 07-09-2016.
  */

import org.learn.chapter10.Element.elem

abstract class Element {
  def contents: Array[String]

  def above(that: Element): Element = {
    new ArrayElement(this.contents ++ that.contents)
  }


  def beside(that: Element): Element = {
    new ArrayElement(
      for (
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  }

  def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }

  def width: Int = if (height == 0) 0 else contents(0).length

  def height: Int = contents.length

  override def toString: String = contents mkString "\n"

  def testMethod: String = {
    if (true) {
      val name = "Rahim"

      name + " Khan"
    }
    else {

      "Khan"
    }
  }
}

object Element {
  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)

  def elem(chr: Char, width: Int, height: Int): Element =
    new UniformElement(chr, width, height)

  def elem(line: String): Element =
    new LineElement(line)


}
