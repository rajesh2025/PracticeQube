fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    main()
}

fun main() {
//    val arrayname = Array(5) { it.inc() }
//    for (element in arrayname)
//    {
//        println(element)
//    }

//    reverseString("radha".toCharArray())
    println( solution(1041))
//    println(solution(2))
}

fun reverseString(s: CharArray): Unit {
    var n = s.size - 1
    var i = 0
    while (i <= n.div(2)) {
        val temp = s[i]
        s[i] = s[n - i]
        s[n - i] = temp
        i = i.inc()
    }
}


fun solution(N: Int): Int {
    // Implement your solution here
    val numToBinary = Integer.toBinaryString(N).toCharArray()
    var start = 0
    var end = numToBinary.size - 1
    var maxGap = 0
    var lastEnd = end
    while (start < end) {
        if (numToBinary[start] == '1' && numToBinary[end] == '1') {
            //count the max gap  between numbers
            val temp = end - start
            if (temp > maxGap && lastEnd >= end) {
                val temp2 = lastEnd - end
                maxGap = if (temp2 > temp) {
                    temp2
                } else temp
            }
            lastEnd = end
            end = end.dec()
        } else if (numToBinary[start] == '1') {
            end = end.dec()
        } else if (numToBinary[end] == '1') {
            start = start.inc()
        } else {
            start = start.inc()
            end = end.dec()
        }
    }
    if (maxGap > 0 && numToBinary[start + 1] == '0')
        return maxGap

    return 0
}