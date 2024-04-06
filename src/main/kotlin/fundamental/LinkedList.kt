package fundamental

class LinkedList {


    data class Node<T>(var value: T, var next: Node<T>? = null) {
        private var head: Node<T>? = null
        private var tail: Node<T>? = null
        private var size = 0
        override fun toString(): String {
            return "$value -> $next"
        }

        private fun push(value: T) {
            head = Node(value = value, next = head)
            if (tail == null) tail = head
            size++
        }

        private fun addToTail(value: T) {
            if (head == null) {
                push(value)
                return
            }

            tail?.next = Node(value = value, next = null)
            tail = tail?.next
            size++
        }

        fun get(index: Int): Int? {
            var currentNode = head
            var currentIndex = 0
            return if (index >= size) {
                -1
            } else {
                while (currentNode != null && currentIndex < index) {
                    currentNode = currentNode.next
                    currentIndex++
                }
                currentNode?.value.toString().toInt()
            }
        }

        fun addAtIndex(index: Int, `val`: T) {
            var currentNode = head
            var newNode: Node<T>?
            var previousNode: Node<T>? = null
            var currentIndex = 0
            if (index >= size) {
                addToTail(`val`)
            } else if (size > 0 && index == 0) {
                push(`val`)
            } else {
                while (currentNode != null && currentIndex <= index) {
                    previousNode = currentNode
                    currentNode = currentNode.next
                    currentIndex++
                }
                newNode = Node(value = `val`, next = currentNode)
                previousNode?.next = newNode
                size++
            }
        }

        fun deleteIndex(index: Int) {
            //1
            var currentNode = head
            var currentIndex = 0
            var previousNode: Node<T>? = null
            if (index < size) {
                if (index == 0) {
                    if (size > 1) {
                        head = currentNode?.next
                        currentNode?.next = null
                        size--
                    } else if (size == 1) {
                        currentNode = null
                        size--
                    }
                } else {
                    //2
                    while (currentNode != null && currentIndex < index) {
                        previousNode = currentNode
                        currentNode = currentNode.next
                        currentIndex++
                    }
                    previousNode?.next = currentNode?.next
                    currentNode?.next = null
                    if (previousNode?.next == null) {
                        tail = previousNode
                    }
                    size--
                }
            }
        }
    }

}