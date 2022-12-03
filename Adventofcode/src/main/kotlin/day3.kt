import java.io.File

fun main() {
//    day3PartOne()
    day3PartTwo()
}

fun day3PartOne() {
    val res = "src/main/resources"
    var totalScore = 0
    val scoreString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    File("$res/day3.txt").useLines { lines ->
        lines.forEach breaking@ { line ->
            var leftString = line.substring(0, line.length / 2)
            var leftStringCharArray = leftString.toCharArray()
            var rightString = line.drop(line.length / 2)
            rightString.forEach { char ->
                if (leftStringCharArray.contains(char)) {
                    val charScore = scoreString.indexOf(char) + 1
                    totalScore += charScore
                    print("orgstring -> $line vis -> $char score -> $charScore totalScore -> $totalScore \n")
                    return@breaking
                }
            }
        }
    }
    print("result -> " + totalScore)
}

fun day3PartTwo() {
    val res = "src/main/resources"
    var totalScore = 0
    val scoreString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var currentLine = 1
    var matchArray = "".toCharArray()

    File("$res/day3_partTwo.txt").useLines { lines ->
        lines.forEach breaking@ { line ->
            if (matchArray.count() == 0) {
                matchArray = line.toCharArray()
            } else {
                var tempMatchString = ""
                line.forEach { char ->
                    if (matchArray.contains(char)) {
                        tempMatchString += char
                    }
                }
                matchArray = tempMatchString.toCharArray()
            }
            print("line -> $line <")
            if (currentLine % 3 == 0) {
                print("matchArray -> ${matchArray.toString()} <")
                val charScore = scoreString.indexOf(matchArray.first()) + 1
                totalScore += charScore
                matchArray = "".toCharArray()
                print("\n")
            }
            currentLine++
        }
    }
    print("result -> " + totalScore)
}
