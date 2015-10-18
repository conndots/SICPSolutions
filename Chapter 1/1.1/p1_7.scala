object P1_7 {
    private def squareIteration(guess: Double, x: Double, previousGuess: Double): Double = {
        if (guessGoodEnough(guess, previousGuess))
            guess
        else
            squareIteration(improveGuess(guess, x), x, guess)
    }

    private def improveGuess(guess: Double, x: Double): Double = {
        average(guess, x / guess)
    }

    private def average(nums: Double*): Double = {
        nums.reduce {_ + _} / nums.size
    }
    private def guessGoodEnough(guess: Double, previousGuess: Double): Boolean = {
        scala.math.abs(guess - previousGuess) < 0.00000000001
    }

    def square(x: Double): Double = {
        squareIteration(1d, x, -1)
    }

    def main(args: Array[String]): Unit = {
        println(square(2d))
        println(square(7d))
    }
}
