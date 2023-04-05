package dsa

fun main() {

   println(findGCD(intArrayOf(2,5,6,9,10)))
}
fun findGCD(nums: IntArray): Int {
    var min = nums[0]
    var max = nums[0]
    for(n in nums){
        if(n > max){
            max = n
        }
        if(n < min ){
            min  = n
        }
    }

    while(min !=0 && max != 0){

        if(min > max){
            min = min.rem(max)
        } else {
            max = max.rem(min)
        }
    }

    return if(min != 0) min else max
}