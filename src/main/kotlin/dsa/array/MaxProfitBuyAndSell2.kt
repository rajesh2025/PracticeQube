package dsa.array

fun main() {
   println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}

fun maxProfit(prices: List<Int>): Int {
    var maxProfit = 0
    var minPrice = Int.MAX_VALUE

    for (price in prices) {
        minPrice = minOf(minPrice, price)  // Track the minimum price seen so far
        maxProfit = maxOf(maxProfit, price - minPrice)  // Update max profit based on current price and min price
    }

    return maxProfit
}