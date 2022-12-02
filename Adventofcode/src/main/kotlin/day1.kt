import java.io.File
import kotlin.math.max

fun main() {
//    partOne()
    partTwo()
}

fun partOne() {
    val res = "src/main/resources"
    var maxNumber = 0
    var currentElfCarry = 0
    File("$res/day1.txt").useLines { line ->
        line.forEach {
            if (it.isBlank()) {
                maxNumber = max(maxNumber, currentElfCarry)
                currentElfCarry = 0
            } else {
                currentElfCarry += it.toInt()
            }
        }
    }
    print("result -> " + maxNumber)
}

fun partTwo() {
    val res = "src/main/resources"
    var currentElfCarry = 0
    var caloriesArray = ArrayList<Int>()
    File("$res/day1_partTwo.txt").useLines { line ->
        line.forEach {
            if (it.isBlank()) {
                caloriesArray.add(currentElfCarry)
                currentElfCarry = 0
            } else {
                currentElfCarry += it.toInt()
            }
        }
    }
    val topThreeCalories = caloriesArray
        .sortedDescending()
        .take(3)
        .sum()

    print("top 3 -> " + topThreeCalories)
}
