package StriversDSA

class MergeSort {


}

fun main() {
}

fun mergeSort(array: Array<Int>, low: Int, high: Int) {
//base condition
    if (low == high) return
    val mid = (low + high) / 2
    //sort left array
    mergeSort(array, low, mid)
    //sort right array
    mergeSort(array, mid + 1, high)
    //merge the separated arrays
    merge(array, low, mid, high)
}

fun merge(array: Array<Int>, low: Int, mid: Int, high: Int): Array<MutableList<Int>> {
    val arrayList: MutableList<Int> = array.toMutableList()
    var left = low
    var right = mid + 1
    while (left <= mid && right <= high) {
        if (array[left] <= array[right]) {
            arrayList.add(array[left])
        } else {
            arrayList.add(array[right])
        }
    }

    while (left <= mid) {
        arrayList.add(array[left])
        left++
    }
    while (right <= high) {
        arrayList.add(array[right])
        right++
    }
    return arrayOf(arrayList)
}