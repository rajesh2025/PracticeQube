package dsa.BinarySearch

class BinarySearchIn2DMatrix {

    fun binarySearchIn2DMatrixUsingWhile(arr: Array<Array<Int>>, target: Int): IntArray {
        var row = 0
        var col = arr.size - 1
        while (row < arr.size && col >= 0) {
            if (arr[row][col] == target) {
                return intArrayOf(row, col)
            } else if (arr[row][col] < target) {
                row = row.inc()
            } else if (arr[row][col] > target) {
                col = col.dec()
            }
        }

        return intArrayOf(-1, -1)
    }

}

fun main() {
    val arr = arrayOf(
        arrayOf(10, 20, 30, 40),
        arrayOf(15, 25, 35, 45),
        arrayOf(28, 29, 37, 49),
        arrayOf(33, 34, 38, 50),
    )

    val arr2 = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 10, 11, 12),
        arrayOf(13, 14, 15, 16),
    )

    println(BinarySearchIn2DMatrix().binarySearchIn2DMatrixUsingWhile(arr2, 12).forEach { print(it)})
}
