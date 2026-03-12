package org.example.util

import java.io.File

object InputReader {

    fun readLines (day: Int): List <String> {
        return File("src/main/resources/day$day/input.txt").readLines()

    }
}