package week3

/**
 * Created by sweaterr on 2015. 1. 3..
 */
object Scratch extends App{
  println(new Rational(1,2))
  def error(msg : String) = throw new Error(msg)
  error("test")
}
