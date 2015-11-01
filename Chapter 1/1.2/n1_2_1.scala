/*
* 递归计算过程
* 线性递归过程
迭代计算过程就是那种其状态可以在从一个状态到下一个状态转换时，这些变量的更新方式；还有一个（可能有的）结束监测。
所有的迭代过程都可以『以硬件的方式』实现为一个机器，其中只有固定数目的寄存器，无须任何辅助寄存器。
Scheme总能在常量空间中执行迭代计算过程，即使这一计算是用一个递归过程描述的。具有这一特性的实现称为尾递归。
*/
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
        println(fibonacciLinearRecursive(13))b
        println("Linear recurise mode takes " + (System.currentTimeMillis - start) + " ms to compute 23!")
    }
}
