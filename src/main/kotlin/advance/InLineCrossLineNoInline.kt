package advance

import java.sql.DriverManager

fun main() {
//    processRecords("Alice", "Billy", "Charlie", "Donald")

    guide()
}

fun processRecords(vararg records: String) {
    for (record in records) {
        executeAndMeasure(record) {
            if (record.startsWith("C")) return@executeAndMeasure
            save(record)
        }
    }

}

inline fun executeAndMeasure(label: String, block: () -> Unit) {
    block()
}

inline fun execute(action : () -> Unit){
    action()
}

fun save(record: String) {
    DriverManager.println(" $record saved")
}

fun guide() {
    println("guide start")

    teach {
        println("teach")

    }

    println("guide end")
}

inline fun teach(abc: () -> Unit) {
    abc()
}

