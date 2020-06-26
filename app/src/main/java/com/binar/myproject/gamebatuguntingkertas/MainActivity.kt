package com.binar.myproject.gamebatuguntingkertas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pilihanPemain1: String = ""
    var pilihanPemain2 = ""
    val suitController = SuitController()
    var indexPemain1: Int = -1
    var indexPemain2 = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageClose.setOnClickListener {

            finish()

        }
        imageRepeat.setOnClickListener {
            batu1.foreground = null
            kertas1.foreground = null
            gunting1.foreground = null
            batu2.foreground = null
            kertas2.foreground = null
            gunting2.foreground = null

            pilihanPemain1 = ""
            pilihanPemain2 = ""
            indexPemain1 = -1
            indexPemain2 = -1
            tvPemainMenang.text = "Klik pilihan anda"
        }
        batu1.setOnClickListener {
            optionErasePlayer1()
            batu1.foreground = resources.getDrawable(R.drawable.bacground_selection, null)
            indexPemain1 = 0
            pilihanPemain1 = suitController.gameSuit[indexPemain1]
            runGame()
        }
        kertas1.setOnClickListener {
            optionErasePlayer1()
            kertas1.foreground = resources.getDrawable(R.drawable.bacground_selection, null)
            indexPemain1 = 2
            pilihanPemain1 = suitController.gameSuit[indexPemain1]
            runGame()
        }
        gunting1.setOnClickListener {
            optionErasePlayer1()
            gunting1.foreground = resources.getDrawable(R.drawable.bacground_selection, null)
            indexPemain1 = 1
            pilihanPemain1 = suitController.gameSuit[indexPemain1]
            runGame()
        }
        batu2.setOnClickListener {
            optionErasePlayer2()
            batu2.foreground = resources.getDrawable(R.drawable.bacground_selection, null)
            indexPemain2 = 0
            pilihanPemain2 = suitController.gameSuit[indexPemain2]
            runGame()
        }
        kertas2.setOnClickListener {
            optionErasePlayer2()
            kertas2.foreground = resources.getDrawable(R.drawable.bacground_selection, null)
            indexPemain2 = 2
            pilihanPemain2 = suitController.gameSuit[indexPemain2]
            runGame()
        }
        gunting2.setOnClickListener {
            optionErasePlayer2()
            gunting2.foreground = resources.getDrawable(R.drawable.bacground_selection, null)
            indexPemain2 = 1
            pilihanPemain2 = suitController.gameSuit[indexPemain2]
            runGame()
        }
    }

    fun runGame() {
        if (pilihanPemain1 != "" && pilihanPemain2 != "") {
            val hasil = suitController.calculateWinner(indexPemain1, indexPemain2).resultValue
            tvPemainMenang.text = hasil
        } else {
            tvPemainMenang.text = "Klik kedua pilihan anda pada gambar"
        }
    }
    fun optionErasePlayer1() {
        batu1.foreground = null
        kertas1.foreground = null
        gunting1.foreground = null

    }
    fun optionErasePlayer2() {
        batu2.foreground = null
        kertas2.foreground = null
        gunting2.foreground = null
    }
}

