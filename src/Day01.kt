import kotlin.math.abs

fun main() {
    fun part1(input: List<String>): Int {
        val left = mutableListOf<Int>()
        val right = mutableListOf<Int>()
        input.map {
            val split = it.split("   ")
            left.add(split[0].toInt())
            right.add(split[1].toInt())
        }
        left.sort()
        right.sort()
        var sum = 0
        for (i in left.indices) {
            sum += abs(left[i] - right[i])
        }

        return sum
    }

    fun part2(input: List<String>): Int {
        val left = mutableListOf<Int>()
        val right = mutableListOf<Int>()
        input.map { s ->
            val (l, r) = s.split("   ").map { it.toInt() }
            left.add(l)
            right.add(r)
        }
        var sum = 0

        left.forEach { l ->
            sum += right.count { it == l } * l
        }
        return sum
    }

    // Test if implementation meets criteria from the description, like:
//    check(part1(listOf("test_input")) == 1)

    // Or read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 11)
    check(part2(testInput) == 31)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
