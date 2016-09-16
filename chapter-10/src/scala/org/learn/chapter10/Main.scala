package org.learn.chapter10

/**
  * Created by Rahim.khan on 07-09-2016.
  */
object Hello extends App {
  val ae  = new ArrayElement(Array("hello")) above new ArrayElement(Array("world"))
  println(ae)
  val bl=new ArrayElement(Array("one","two")) beside  new ArrayElement(Array("one"))
  println(bl)
}
