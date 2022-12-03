import java.io.File
import kotlin.math.max

fun main() {
//    day2PartOne()
    day2PartTwo()
}

fun day2PartOne() {
    val res = "src/main/resources"
    var totalScore = 0

    val xRockScore = 1
    val yPaperScore = 2
    val zScissorsScore = 3

    val winScore = 6
    val drawScore = 3
    val lostScore = 0

    File("$res/day2.txt").useLines { line ->
        line.forEach {
            if (it == "A X") {
                totalScore += drawScore + xRockScore
            } else if (it == "A Y") {
                totalScore += 8
            } else if (it == "A Z") {
                totalScore += lostScore + zScissorsScore
            } else if (it == "B X") {
                totalScore += 1
            } else if (it == "B Y") {
                totalScore += drawScore + yPaperScore
            } else if (it == "B Z") {
                totalScore += winScore + zScissorsScore
            } else if (it == "C X") {
                totalScore += winScore + xRockScore
            } else if (it == "C Y") {
                totalScore += lostScore + yPaperScore
            } else if (it == "C Z") {
                totalScore += 6
            }
        }
    }
    print("result -> " + totalScore)
}

fun day2PartTwo() {
    val res = "src/main/resources"
    var totalScore = 0

    val xRockScore = 1
    val yPaperScore = 2
    val zScissorsScore = 3

    val winScore = 6
    val drawScore = 3
    val lostScore = 0

    File("$res/day2.txt").useLines { line ->
        line.forEach {
            if (it == "A X") {
                totalScore += lostScore + zScissorsScore
            } else if (it == "A Y") {
                totalScore += 4
            } else if (it == "A Z") {
                totalScore += winScore + yPaperScore
            } else if (it == "B X") {
                totalScore += 1
            } else if (it == "B Y") {
                totalScore += drawScore + yPaperScore
            } else if (it == "B Z") {
                totalScore += winScore + zScissorsScore
            } else if (it == "C X") {
                totalScore += lostScore + yPaperScore
            } else if (it == "C Y") {
                totalScore += drawScore + zScissorsScore
            } else if (it == "C Z") {
                totalScore += 7
            }
        }
    }
    print("result -> " + totalScore)
}
