package chapter06

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun rotateClockWise(direction: Direction) = when (direction) {
    Direction.NORTH -> Direction.EAST
    Direction.EAST -> Direction.SOUTH
    Direction.SOUTH -> Direction.WEST
    Direction.WEST -> Direction.NORTH
}

fun main() {
    println(rotateClockWise(Direction.SOUTH).name)
}
