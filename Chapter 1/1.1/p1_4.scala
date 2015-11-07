import scala.language.implicitConversions
object P1_4 {
    implicit def intToDouble(i: Int): Double = i.toDouble
    implicit def longToDouble(l: Long): Double = l.toDouble
    implicit def floatToDouble(f: Float): Double = f.toDouble
    implicit def shortToDouble(s: Short): Double = s.toDouble

    def aPlusAbsB(a: Double, b: Double): Double = {
        if (b > 0) apply(plus, a, b) else apply(minus, a, b)
    }
    private def apply[T](action: ((T, T) => T), a: T, b: T): T = {
        action(a, b)
    }
    private def plus(a: Double, b: Double): Double = {
        a + b
    }
    private def minus(a: Double, b: Double): Double = {
        a - b
    }
    def main(args: Array[String]): Unit = {
        println(aPlusAbsB(3, -5))
        println(aPlusAbsB(3, -3d))
        println(aPlusAbsB(3d, 5d))
        println(aPlusAbsB(-3, -4.3))
    }
}
