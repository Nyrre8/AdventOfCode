package org.example.day3

import org.example.util.InputReader

fun main() {
    val lines = InputReader.readLines(3)

    println("Part 1: ${partOne(lines)}")
    println("Part 2 : ${partTwo(lines)}")
}

fun partOne(lines: List<String>): Int {

    return lines.sumOf { input ->
        val halfLine = input.length / 2
        val firstHalf = input.take(halfLine)
        val secondHalf = input.drop(halfLine)


        val commonChar = firstHalf.toSet().intersect(secondHalf.toSet()).first()


        if (commonChar.isLowerCase()) {
            commonChar.code - 96
        } else {
            commonChar.code - 38
        }

    }
}

fun partTwo(lines: List<String>): Int {


    return lines.chunked(3).sumOf { input ->
        val first = input[0]
        val second = input[1]
        val third = input[2]

        val commonChar = first.toSet().intersect(second.toSet()).intersect(third.toSet()).first()

        if (commonChar.isLowerCase()) {
            commonChar.code - 96
        } else {
            commonChar.code - 38
        }
    }


}
