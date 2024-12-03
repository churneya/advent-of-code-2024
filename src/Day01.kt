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
            sum += if(left[i] > right[i]) {
                left[i] - right[i]
            } else {
                right[i] - left[i]
            }
        }

        return sum
    }

//    fun part2(input: List<String>): Int {
//        return input.size
//    }

    // Test if implementation meets criteria from the description, like:
//    check(part1(listOf("test_input")) == 1)

    // Or read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 11)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("Day01")
    part1(input).println()
//    part2(input).println()
}
