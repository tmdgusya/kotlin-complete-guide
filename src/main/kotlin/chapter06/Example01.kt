package chapter06

enum class Direction {
    NORTH, SOUTH, WEST, EAST;

    // 일반 멤버 변수도 포함 가능
    val lowerCaseName get() = name.lowercase()
    fun isNorth() = this == NORTH
}

/**
 * NoWhenBranchWatchException 타입의 예외를 던지는 else 가 포함되어 있음.
 */
fun rotateClockWise(direction: Direction) = when (direction) {
    Direction.NORTH -> Direction.EAST
    Direction.EAST -> Direction.SOUTH
    Direction.SOUTH -> Direction.WEST
    Direction.WEST -> Direction.NORTH
}

fun main() {
    println(rotateClockWise(Direction.SOUTH).lowerCaseName)
}
