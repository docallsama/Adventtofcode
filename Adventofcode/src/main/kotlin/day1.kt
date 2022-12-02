import java.io.File
import kotlin.math.max

fun main() {
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
