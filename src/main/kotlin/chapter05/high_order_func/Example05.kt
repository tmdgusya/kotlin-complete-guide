package chapter05.high_order_func

/**
 * inline function 을 통한 Object Creation OverHead 개선
 *   - 함수를 호출 한다는 것 자체가 OverHead 가 됨. 컴파일러는 함수값의 정적인 타잆을 알 수 없으므로 동적으로 가상호출을 해야만 함.
 */
inline fun indexOf(numbers: IntArray, condition: (Int) -> Boolean): Int {
    for (i in numbers.indices) {
        if (condition(numbers[i])) return i
    }

    return -1
}

fun main() {
    println(
        indexOf(intArrayOf(1, 2, 3, 4)) {
            it > 3
        }
    )
}
