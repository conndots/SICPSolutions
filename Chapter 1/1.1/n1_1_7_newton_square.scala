object NewtonSquare {
    private def squareIteration(guess: Double, x: Double): Double = {
        if (guessGoodEnough(guess, x))
            guess
        else
            squareIteration(improveGuess(guess, x), x)
    }

    private def improveGuess(guess: Double, x: Double): Double = {
        average(guess, x / guess)
    }

    private def average(nums: Double*): Double = {
        nums.reduce {_ + _} / nums.size
    }
    private def guessGoodEnough(guess: Double, x: Double): Boolean = {
        scala.math.abs(scala.math.pow(guess, 2d) - x) < 0.001
    }

    def square(x: Double): Double = {
        squareIteration(1d, x)
    }

    def main(args: Array[String]): Unit = {
        println(square(2d))
        println(square(7d))
    }
}
