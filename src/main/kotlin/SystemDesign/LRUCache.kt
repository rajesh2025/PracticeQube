package SystemDesign

class LRUCache<K, V>(private val capacity: Int) {

    private val cache: LinkedHashMap<K, V> = object : LinkedHashMap<K, V>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
            return size > capacity
        }
    }

    fun put(key: K, value: V) {
        cache[key] = value
    }

    fun get(key: K): V? {
        return cache[key]
    }

    fun containKey(key: K): Boolean {
        return cache.containsKey(key)
    }

    fun remove(key: K) {
        cache.remove(key)
    }

    fun size(): Int {
        return cache.size
    }

    fun printCache() {
        println(cache)
    }

}