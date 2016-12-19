/**
  * Created by Rahim.khan on 06-10-2016.
  */
abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String,
                 left: Expr, right: Expr) extends Expr
/*
def example(list: List[Int]) = list match {
  case Nil => println("Nil")
  case List(x,y) => println("one element: " + x)
  case rs => println("more elements: " + rs)
}*/
