package advance

fun main() {
    executeAll({ println("action1 ") },{ println("action2 ") })
    executeAllNoinline({ println("action1 ") },{ println("action2 ") })
}

inline fun executeAll(action1: () -> Unit, action2: () -> Unit) {
    action1()
    action2()
}

inline fun executeAllNoinline(action1: () -> Unit, noinline action2: () -> Unit) {
    action1()
    action2()
}