object P1_12 {
    def pascal(row: Int, col: Int): Int = {
        if (col == 1 || col == row) 1 else pascal(row - 1, col - 1) + pascal(row - 1, col)
    }

    def main(args: Array[String]): Unit = {
        println(pascal(5, 3))
    }
}
