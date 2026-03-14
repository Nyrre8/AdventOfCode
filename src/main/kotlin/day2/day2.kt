package org.example.day2

import org.example.util.InputReader


fun main() {
    val lines = InputReader.readLines(2)

    println("Part 1: ${processLinePartOne(lines)}")
    println("Part 2:  ${processLinePartTwo(lines)}")

}

fun processLinePartOne(lines: List<String>): Int {


    return lines.sumOf { input ->

        val a = input[0];
        val b = input[2];
        when ("$a$b") {

            "AY" -> 8;
            "AX" -> 4;
            "AZ" -> 3;
            "BY" -> 5;
            "BX" -> 1;
            "BZ" -> 9
            "CY" -> 2;
            "CZ" -> 6;
            "CX" -> 7

            else -> 0;


        }
    }


}

fun processLinePartTwo(lines: List<String>): Int {


    /*
A ROCK
B PAPER
C SCISSOR
LOSS 0 DRAW 3 WIN 6

X = LOSE
Y = DRAW
Z = WIN

 ROCK 1
 PAPER 2
 SCISSOR 3
*/
    return lines.sumOf { input ->

        val a = input[0];
        val b = input[2];

        when ("$a$b") {

            "AY" -> 4;
            "AX" -> 3;
            "AZ" -> 8;
            "BY" -> 5;
            "BX" -> 1;
            "BZ" -> 9;
            "CY" -> 6;
            "CZ" -> 7;
            "CX" -> 2;



            else -> 0;
        }
    }

}