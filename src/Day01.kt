fun main() {
    val day = Day01(readInput("day01"))
    println(day.part1())
}

class Day01(private val input: List<String>) {
    fun part1(): Int {
        // Ideas
        // First Part:
        // determine if String is Int
        // 2 loops
        // loop 1: count if first Int String, add to the sub-result
        // loop 2: a reverse loop to check the last Int String, add to the sub-result

        // Second Part:
        // Sum all sub results and return the result
        return input.sumOf { calculateRowDigits(it) }
    }

    private fun calculateRowDigits(row: String): Int {
        val firstDigit = row.first { it.isDigit() }
        val secondDigit = row.last { it.isDigit() }
        return "$firstDigit$secondDigit".toInt()
    }
}
