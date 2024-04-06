package dsa.linkedList


class LinkedList<T> {
    var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty List"
        } else {
            head.toString()
        }
    }

    fun push(value: T): LinkedList<T> {
        head = Node(value = value, nextNode = head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }

    fun append(value: T) {
        // 1
        if (isEmpty()) {
            push(value)
            return
        }
        // 2
        tail?.nextNode = Node(value = value)

        // 3
        tail = tail?.nextNode
        size++
    }

    fun nodeAt(index: Int): Node<T>? {
        // 1
        var currentNode = head
        var currentIndex = 0

        // 2
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.nextNode
            currentIndex++
        }

        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T> {
        // 1
        if (tail == afterNode) {
            append(value)
            return tail!!
        }
        // 2
        val newNode = Node(value = value, nextNode = afterNode.nextNode)
        // 3
        afterNode.nextNode = newNode
        size++
        return newNode
    }

    fun reverseListRecursive(head: Node<T>?): Node<T>? {
        if (head == null) return null
        val newHead = reverseListRecursive(head.nextNode)
        head.nextNode = null // Set next to null for the last node in recursion
        if (newHead != null) {
            newHead.nextNode = head
        }
        return newHead ?: head // Return newHead if available, otherwise original head
    }

    fun printList(head: Node<T>?) {
        var current = head
        while (current != null) {
            print("$current -> ")
            current = current.nextNode
        }
        println("null")
    }
}

data class Node<T>(var value: T, var nextNode: Node<T>? = null) {
    override fun toString(): String {
        return if (nextNode != null) {
            "$value -> ${nextNode.toString()}"
        } else {
            "$value"
        }
    }
}

fun main() {
    //"creating and linking nodes"
//    val node1 = Node(value = 1)
//    val node2 = Node(value = 2)
//    val node3 = Node(value = 3)
//
//    node1.nextNode = node2
//    node2.nextNode = node3
//
//    println(node1)

    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)

    println("Before inserting: $list")
    // Reset the linked list to original state (assuming mutable nodes)
    val linkedList = LinkedList<Int>()
    linkedList.head = Node(1, Node(2, Node(3, null)))

    // Test recursive approach
    val reversedHeadRecursive = linkedList.reverseListRecursive(linkedList.head)
    println("Reversed List (Recursive): ")
    linkedList.printList(reversedHeadRecursive)
}


