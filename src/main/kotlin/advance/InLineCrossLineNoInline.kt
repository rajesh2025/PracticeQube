package advance

import java.sql.DriverManager

fun main(){
processRecords("Alice","Billy","Charlie","Donald")
}

fun processRecords(vararg records: String){
    for(record in records){
        executeAndMeasure(record){
            if (record.startsWith("C")) return@executeAndMeasure
            save(record)
        }
    }

}

inline fun executeAndMeasure(label: String, block:()-> Unit){
    block()
}

fun  save(record: String){
    DriverManager.println(" $record saved")
}