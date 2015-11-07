object N1_2_2 {
    def changeCount(amount: Int, kindsOfCoin: Int): Int = {
        if ( amount == 0 ) {
            1
        }
        else if ( amount < 0 || kindsOfCoin == 0 ) {
            0
        }else {
            changeCount(amount - getCoinAmount(kindsOfCoin), kindsOfCoin) + changeCount(amount, kindsOfCoin - 1)
        }
    }

    def getCoinAmount(kindOfCoin: Int): Int = {
        kindOfCoin match {
            case 5 => 50
            case 4 => 25
            case 3 => 10
            case 2 => 5
            case 1 => 1
        }
    }

    def main(args: Array[String]): Unit = {
        println(changeCount(100, 5))
    }

    //TODO Iteration version
}
