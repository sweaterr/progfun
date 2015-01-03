package week3

/**
 * Created by sweaterr on 2015. 1. 3..
 */
class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")
  private def gcd(a: Int, b: Int) : Int = if(b==0) a else gcd(b,a%b)
  private val g = gcd(x,y)


  def this(x: Int) = this(x,1)

  val numer = x / g
  val denom = y / g


  def < (that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if(this < that ) that else this

  def + (that : Rational) =
    new Rational (
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def - (that : Rational) = this + -that

  def unary_- :Rational =
    new Rational (
      -1*numer,denom
    )

  override def toString = numer + "/" + denom

}