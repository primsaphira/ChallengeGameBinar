package com.binar.myproject.gamebatuguntingkertas

class SuitController {
    var gameSuit = listOf("Batu", "Gunting", "Kertas")

    fun calculateWinner(player1: Int, player2: Int): Result {
        return when {
            ((gameSuit[player1] == "Batu" && gameSuit[player2] == "Gunting") ||
                    (gameSuit[player1] == "Kertas" && gameSuit[player2] == "Batu") ||
                    (gameSuit[player1] == "Gunting" && gameSuit[player2] == "Kertas")) -> {
                Result.PEMAIN_1_MENANG
            }
            ((gameSuit[player1] == "Batu" && gameSuit[player2] == "Kertas") ||
                    (gameSuit[player1] == "Kertas" && gameSuit[player2] == "Gunting") ||
                    (gameSuit[player1] == "Gunting" && gameSuit[player2] == "Batu")) -> {
                Result.PEMAIN_2_MENANG
            }
            else -> {
                Result.DRAW

            }
        }
    }
}