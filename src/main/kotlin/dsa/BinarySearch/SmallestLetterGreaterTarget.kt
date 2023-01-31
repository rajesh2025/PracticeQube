package dsa.BinarySearch

class SmallestLetterGreaterTarget {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        var start = 0
        var end = letters.size - 1
        var mid: Int
        while (start <= end) {
            mid = start + (end - start) / 2
            if (letters[mid].code > target.code) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        return letters[start % letters.size ]
    }
}

fun main() {
   val letters = charArrayOf('c','f','j')
    val target = 'c'
    println(SmallestLetterGreaterTarget().nextGreatestLetter(letters,target))
}