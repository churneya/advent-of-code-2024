fun main() {
    fun part1(input: List<String>): Int {
        var count = 0
        input.forEach { s ->
            val level = s.split(" ").map { it.toInt() }.zipWithNext()
            var sizeDown = 0
            var sizeUp = 0

            level.forEach { (a, b) ->
                if (a > b && (a - b) <= 3) {
                    sizeDown++
                }
            }
            level.forEach { (a, b) ->
                if (a < b && (b - a) <= 3) {
                    sizeUp++
                }
            }
            if (sizeDown == level.size || sizeUp == level.size) {
                count++
            }
        }
        return count
    }

    fun part2(input: List<String>): Int {
        return input.size
    }


    val testInput = readInput("Day02_test")
    check(part1(testInput) == 2)
//    check(part2(testInput) == 31)

    val input = readInput("Day02")
    part1(input).println()
//    part2(input).println()
}
