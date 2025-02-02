package dsa.Tree

fun main() {
   println(sortedArrayToBST(intArrayOf(-10,-3,0,5,9)))
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.isEmpty()) {
        return null
    }
    return constructTreeFromArray(nums, 0, nums.size - 1)


}

fun constructTreeFromArray(arr: IntArray, left: Int, right: Int): TreeNode? {
    if (left > right) return null
    val mid = left + (right - left) / 2
    val treeNode = TreeNode(arr[mid])
    treeNode.left = constructTreeFromArray(arr, left, mid - 1)
    treeNode.right = constructTreeFromArray(arr, mid + 1, right)
    return treeNode
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}