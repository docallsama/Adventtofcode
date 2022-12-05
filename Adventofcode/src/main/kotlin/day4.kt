import java.io.File

fun main() {
//    day4PartOne()
    day4PartTwo()
}

fun day4PartOne() {
    val res = "src/main/resources"
    var totalScore = 0

    File("$res/day4.txt").useLines { lines ->
        lines.forEach breaking@ { line ->
            val splitLine = line.split(",")
            val splitLineFirst = splitLine.first()
            val splitLineFirstRangeFirst = splitLineFirst.split("-").first()
            val splitLineFirstRangeSecond = splitLineFirst.split("-").last()
            val splitLineSecond = splitLine.last()
            val splitLineSecondRangeFirst = splitLineSecond.split("-").first()
            val splitLineSecondRangeSecond = splitLineSecond.split("-").last()

            if ((splitLineFirstRangeFirst.toInt() >= splitLineSecondRangeFirst.toInt()) &&
                (splitLineFirstRangeSecond.toInt() <= splitLineSecondRangeSecond.toInt()) ||
                (splitLineSecondRangeFirst.toInt() >= splitLineFirstRangeFirst.toInt()) &&
                (splitLineSecondRangeSecond.toInt() <= splitLineFirstRangeSecond.toInt())) {
                    print("line -> $line \n")
                totalScore++
            }
        }
    }
    print("result -> " + totalScore)
}

fun day4PartTwo() {
    val res = "src/main/resources"
    var totalScore = 0

    File("$res/day4_partTwo.txt").useLines { lines ->
        lines.forEach breaking@ { line ->
            val splitLine = line.split(",")
            val splitLineFirst = splitLine.first()
            val splitLineFirstRangeFirst = splitLineFirst.split("-").first()
            val splitLineFirstRangeSecond = splitLineFirst.split("-").last()
            val splitLineSecond = splitLine.last()
            val splitLineSecondRangeFirst = splitLineSecond.split("-").first()
            val splitLineSecondRangeSecond = splitLineSecond.split("-").last()

            if ((splitLineFirstRangeSecond.toInt() >= splitLineSecondRangeFirst.toInt()) &&
                (splitLineFirstRangeFirst.toInt() <= splitLineSecondRangeSecond.toInt())) {
                print("line -> $line \n")
                totalScore++
            }
        }
    }
    print("result -> " + totalScore)
}
