class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def addRational(r: Rational, s: Rational): Rational =
    new Rational (
      r.numer * s.denom + s.numer * r.denom,
      r
    )
}

object rationals {
  val x = new Rational(1,2)
  x.numer
  x.denom
}