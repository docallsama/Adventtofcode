fun main() {
    val day1 = Day1V1()
    val input = readInputAsText("day1")
    println("day1 part1 -> " + day1.part1(input))
}

class Day1V1 {
    fun part1(input: String): Int = input
        .split("\n\n")
        .maxOf { it.split("\n").filter { line -> line.isNotBlank() }.sumOf(String::toInt)}
}
