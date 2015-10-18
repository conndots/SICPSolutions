object P1_8 {
    private def cubicIteration(guess: Double, x: Double): Double = {
        if (guessGoodEnough(guess, x))
            guess
        else
            cubicIteration(improveGuess(guess, x), x)
    }

    private def improveGuess(guess: Double, x: Double): Double = {
        (x/ (guess * guess) + 2 * guess) / 3
    }

    private def guessGoodEnough(guess: Double, x: Double): Boolean = {
        scala.math.abs(scala.math.pow(guess, 3d) - x) < 0.0001
    }

    def cubic(x: Double): Double = {
        cubicIteration(1d, x)
    }

    def main(args: Array[String]): Unit = {
        println(cubic(2d))
        println(cubic(7d))
    }
}
