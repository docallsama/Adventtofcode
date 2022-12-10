import java.io.File

fun main() {
//    day5PartOne()
//    day4PartTwo()
}

fun day5PartOne() {
    val res = "src/main/resources"
    var totalScore = 0
    var input = arrayOf(arrayOf("M", "F", "C", "W", "T", "D", "L", "B"),
                        arrayOf("L", "B", "N"),
                        arrayOf("V", "L", "T", "H", "C", "J"),
                        arrayOf("W", "J", "P", "S"),
                        arrayOf("R", "L", "T", "F", "C", "S", "Z"),
                        arrayOf("Z", "N", "H", "B", "G", "D", "W"),
                        arrayOf("N", "C", "G", "V", "P", "S", "M", "F"),
                        arrayOf("Z", "C", "V", "F", "J", "R", "Q", "W"),
                        arrayOf("H", "L", "M", "P", "R"),)


    val testString = "abcd"
    var result = testString.drop(1).take(1)

    File("$res/day5.txt").useLines { lines ->
        lines.forEach breaking@ { line ->
            val splitLine = line.split(",")
        }
    }
    print("result -> " + totalScore)
}

//fun day4PartTwo() {
//    val res = "src/main/resources"
//    var totalScore = 0
//
//    File("$res/day4_partTwo.txt").useLines { lines ->
//        lines.forEach breaking@ { line ->
//            val splitLine = line.split(",")
//            val splitLineFirst = splitLine.first()
//            val splitLineFirstRangeFirst = splitLineFirst.split("-").first()
//            val splitLineFirstRangeSecond = splitLineFirst.split("-").last()
//            val splitLineSecond = splitLine.last()
//            val splitLineSecondRangeFirst = splitLineSecond.split("-").first()
//            val splitLineSecondRangeSecond = splitLineSecond.split("-").last()
//
//            if ((splitLineFirstRangeSecond.toInt() >= splitLineSecondRangeFirst.toInt()) &&
//                (splitLineFirstRangeFirst.toInt() <= splitLineSecondRangeSecond.toInt())) {
//                print("line -> $line \n")
//                totalScore++
//            }
//        }
//    }
//    print("result -> " + totalScore)
//}
