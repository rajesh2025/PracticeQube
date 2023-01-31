package MultiThreaading


class Processor {
    private val list = ArrayList<Int>()
    private val lock = Object()
    private val value: Int = 0

    fun producer() {
        try {
            synchronized(lock) {
                while (true) {
                    if (list.size == UPPER_LIMIT) {
                        println("waiting for removing item")
                        lock.wait()
                    } else {
                        println(" Adding $value")
                        list.add(value)
                        value.inc()
                        lock.notify()
                    }
                }
            }
        } catch (e: InterruptedException) {

        }
    }

    fun consumer() {
        synchronized(lock) {
            while (true) {
                if (list.size == LOWER_LIMIT) {
                    println("wiating for adding items...")
                    lock.wait()
                } else {
                    println("removing ${list.remove(list.size - 1)}")
                    lock.notify()
                }
            }
        }
    }

    companion object {
        private const val UPPER_LIMIT = 5
        private const val LOWER_LIMIT = 5
    }
}