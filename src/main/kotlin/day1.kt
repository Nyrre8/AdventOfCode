package org.example

import org.example.util.InputReader

fun main() {
    val lines = InputReader.readLines(1);

    println("Part 1: ${partOne(lines)}")
    println("Part 2: ${partTwo(lines)}")

}

fun partOne(lines: List<String>): Int {
    var highestCalorie = 0
    var currentCalorie = 0

    lines.forEach { input ->
        if (input == "") {
            if (currentCalorie > highestCalorie) {
                highestCalorie = currentCalorie
            }
            currentCalorie = 0
        } else {
            currentCalorie += input.toInt()
        }
    }

    if (currentCalorie > highestCalorie) {
        highestCalorie = currentCalorie
    }

    return highestCalorie
}

fun partTwo(lines: List<String>): Int {

    val sumEachElfCalorie = mutableListOf<Int>()
    var currentCalorie = 0

    lines.forEach { input ->
        if (input == "") {
            sumEachElfCalorie.add(currentCalorie)
            currentCalorie = 0
        } else {
            currentCalorie += input.toInt()
        }
    }



    sumEachElfCalorie.add(currentCalorie)
    return sumEachElfCalorie.sortedDescending().take(3).sum()
}
