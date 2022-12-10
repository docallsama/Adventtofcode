
fun main() {
    val input = readInput("day1")
    val day1 = Day1V2()

//    check(day1.part1(input, handler) == 66487)
//    check(day1.part2(input, handler) == 197301)
    println("part 1 result -> " + day1.part1(input,handler))
    println("part 2 result -> " + day1.part2(input,handler))
}

typealias Day1V1Handler = (input: List<String>) -> List<Int>

class Day1V2 {
    fun part1(input: List<String>, handler: Day1V1Handler): Int {
        return handler(input).max()
    }

    fun part2(input: List<String>, handler: Day1V1Handler): Int {
        return handler(input).sortedDescending().take(3).sum()
    }
}

val handler = { input: List<String> ->
    var sums = mutableListOf(0)
    input.forEach {
        if (it.isBlank()) {
            sums.add(0)
        } else {
            sums[sums.lastIndex] += it.toInt()
        }
    }
    sums
}

