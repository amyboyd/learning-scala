object Maths {
  def absoluteValue(number: Double) =
    if (number > 0) number else -number

  def squareRoot(number: Double): Double =
    squareRootIterator(1.0, number)

  private def squareRootIterator(guess: Double, number: Double): Double =
    if (isGoodEnough(guess, number)) guess
    else squareRootIterator(improveGuess(guess), number)

  private def isGoodEnough(guess: Double, number: Double): Boolean =
    absoluteValue((guess * guess) - number) / number < 0.01

  private def improveGuess(guess: Double): Double =
    guess + 0.01
}

Maths.squareRoot(4)

Maths.squareRoot(8)

Maths.squareRoot(400)
