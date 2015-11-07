object P1_11 {
    def computeRecursively(n: Int): Int = {
        if (n <= 3) n else { computeRecursively(n - 1) + computeRecursively(n - 2) * 2 + computeRecursively(n - 3) * 3 }
    }

   def computeIteratively(n: Int): Int = {
       computeIter(n, 1, 2, 3)
   }
    private def computeIter(n: Int, m3: Int, m2: Int, m1: Int): Int = {
        if (n <= 3) Seq(m3, m2, m1)(n - 1) else { computeIter(n - 1, m2, m1, m1 + m2 * 2 + m3 * 3) }
    }

    def main(args: Array[String]): Unit = {
        val st = System.currentTimeMillis
        val resRec = computeRecursively(25)
        val takeRec = System.currentTimeMillis - st

        val st1 = System.currentTimeMillis
        val resIter = computeIteratively(25)
        val takeIter = System.currentTimeMillis - st1

        println("Recursive: " + resRec + "(" + takeRec + ")")
        println("Iterative: " + resIter + "(" + takeIter + ")")
    }
}
