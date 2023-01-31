package dsa

class SeMatrixZeros {

    companion object {

        fun markRowColumnZeroFor0(matrix: Array<Array<Int>>) {

            println(" Input Matrix : ${matrix.forEach { println(it.contentToString()) }}")

            val rowS = matrix.size
            val colS = matrix[0].size
            var flag = 1

            for (i in 0 until rowS) {
                if (matrix[i][0] == 0) flag = 0
                for (j in 1 until colS) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0
                        matrix[0][j] = 0
                    }
                }
            }
            for (i in rowS - 1 downTo 0) {
                for (j in colS - 1 downTo 1) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0
                    }
                }
                if (flag == 0) {
                    matrix[i][0] = 0
                }
            }
        }
    }
}

//input
//[1, 1, 1, 1]
//[1, 0, 1, 1]
//[1, 1, 0, 1]
//[0, 0, 0, 1]
fun main() {
    val matrix = arrayOf(arrayOf(1, 1, 1, 1), arrayOf(1, 0, 1, 1), arrayOf(1, 1, 0, 1), arrayOf(0, 0, 0, 1))
    SeMatrixZeros.markRowColumnZeroFor0(matrix)
    println(" Output Matrix :  ${matrix.forEach { println(it.contentToString()) }}")
}

//output
//[0, 0, 0, 1]
//[0, 0, 0, 0]
//[0, 0, 0, 0]
//[0, 0, 0, 0]