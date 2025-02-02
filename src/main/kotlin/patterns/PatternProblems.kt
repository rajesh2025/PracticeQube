package patterns

fun main() {
    pattern1()
    println()
    pattern2()
    println()
    pattern3()
    println()
    pattern4()
    println()
    pattern5()
}

/*---
*
**
***
****
*****
---------*/
fun pattern1() {
    val count = 5
    for (i in 0..count) {
        for (j in 0 until i) {
            print("*")
        }
        println()
    }
}

/*-------------
1
12
123
1234
12345
-------------------*/
fun pattern2() {
    val count = 6
    for (i in 1..count) {
        for (j in 1 until i) {
            print("$j")
        }
        println()
    }
}

/*-------------
1
22
333
4444
55555
-------------------*/
fun pattern3() {
    val count = 6
    for (i in 1 until count) {
        for (j in 1..i) {
            print("$i")
        }
        println()
    }
}
/*-------------
*****
****
***
**
*
-------------------*/
fun pattern4() {
    val count = 6
    for (i in 1 until count) {
        for (j in 1..(count - i)) {
            print("*")
        }
        println()
    }
}
/*-------------
12345
1234
123
12
1
-------------------*/
fun pattern5() {
    val count = 6
    for (i in 1 until count) {
        for (j in 1..(count - i)) {
            print("$j")
        }
        println()
    }
}
/*-------------
12345
1234
123
12
1
-------------------*/
fun pattern6() {
    val count = 6
    for (i in 1 until count) {
        for (j in 1..(count - i)) {
            print("$j")
        }
        println()
    }
    for (i in 1 until count) {
        for (j in 1..(count - i)) {
            print("$j")
        }
        println()
    }
}

