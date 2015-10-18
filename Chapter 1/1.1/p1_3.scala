object P1_3 {
    def getSumOfBiggerTwoOfThree(a: Double, b: Double, c: Double): Double = {
        getBiggerTwoOfThree(a, b, c).map {(a) => a * a}.reduce {_ + _}
    }
    def getBiggerTwoOfThree(a: Double, b: Double, c: Double): Seq[Double] = {
        if (min(a, b, c) == c) Seq(a, b)
        else if (min(a, b, c) == b) Seq(a, c)
        else Seq(b, c)
    }
    def min(nums: Double*): Double = {
        nums.reduce {(a: Double, b: Double) => if (a > b) b else a }
    }
    def main(args: Array[String]): Unit = {
        println(getSumOfBiggerTwoOfThree(4, 5, 1))
    }
}
