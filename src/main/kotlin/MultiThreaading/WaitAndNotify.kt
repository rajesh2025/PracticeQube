package MultiThreaading

import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class WaitAndNotify {
}

class TotalEarnings : Thread() {
    var totalAmount: Int = 0
    override fun run() {
        val lock = ReentrantLock()
        val condition = lock.newCondition()
        lock.withLock {
            for (i in 0..100) {
                totalAmount += totalAmount
            }
            condition.signal()
        }

    }
}


fun main() {
    val totalEarnings = TotalEarnings()
    val lock = ReentrantLock()
    val condition = lock.newCondition()

    totalEarnings.start()
    lock.withLock {

        condition.await()
        println(" total earnings are ${totalEarnings.totalAmount}")

    }



}
