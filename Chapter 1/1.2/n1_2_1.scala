object N1_2_1 {
    def fibonacciRecursive(n: Long): Long = {
         n match {
            case 1 => 1
            case _ => n * fibonacciRecursive(n - 1)
        }
    }

    def fibonacciLinearRecursive(n: Long): Long = {
        fibornacciIter(1, 1, n)
    }

    def fibornacciIter(accumulated: Long, count: Long, maxCount: Long): Long = {
        count > maxCount match {
            case true => accumulated
            case false => fibornacciIter(accumulated * count, count + 1, maxCount)
        }
    }

    def main(args: Array[String]): Unit = {
        var start: Long = System.currentTimeMillis
        println(fibonacciRecursive(13))
        println("Recurise mode takes " + (System.currentTimeMillis - start) + " ms to compute 23!")
        start = System.currentTimeMillis
        println(fibonacciLinearRecursive(13))
        println("Linear recurise mode takes " + (System.currentTimeMillis - start) + " ms to compute 23!")
    }
}
