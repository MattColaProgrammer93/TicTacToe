package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // The beginning player turn
        var playerName = "Player X"

        // The winner is not met
        var winner = false

        // All tiles
        val firstTile = findViewById<Button>(R.id.tileOne)
        val secondTile = findViewById<Button>(R.id.tileTwo)
        val thirdTile = findViewById<Button>(R.id.tileThree)
        val fourthTile = findViewById<Button>(R.id.tileFour)
        val fifthTile = findViewById<Button>(R.id.tileFive)
        val sixthTile = findViewById<Button>(R.id.tileSix)
        val seventhTile = findViewById<Button>(R.id.tileSeven)
        val eighthTile = findViewById<Button>(R.id.tileEight)
        val ninthTile = findViewById<Button>(R.id.tileNine)

        // The player turn text
        val turn = findViewById<TextView>(R.id.currentPlayer)

        firstTile.setOnClickListener {
            tileClicked(firstTile, playerName)
            playerName = changePlayerTurn(playerName)
        }

        secondTile.setOnClickListener {
            tileClicked(secondTile, playerName)
            playerName = changePlayerTurn(playerName)
        }

        thirdTile.setOnClickListener {
            tileClicked(thirdTile, playerName)
            playerName = changePlayerTurn(playerName)
        }

        fourthTile.setOnClickListener {
            tileClicked(fourthTile, playerName)
            playerName = changePlayerTurn(playerName)
        }

        fifthTile.setOnClickListener {
            tileClicked(fifthTile, playerName)
            playerName = changePlayerTurn(playerName)
        }

        sixthTile.setOnClickListener {
            tileClicked(sixthTile, playerName)
            playerName = changePlayerTurn(playerName)
        }

        seventhTile.setOnClickListener {
            tileClicked(seventhTile, playerName)
            playerName = changePlayerTurn(playerName)
        }

        eighthTile.setOnClickListener {
            tileClicked(eighthTile, playerName)
            playerName = changePlayerTurn(playerName)
        }

        ninthTile.setOnClickListener {
            tileClicked(ninthTile, playerName)
            playerName = changePlayerTurn(playerName)
        }
    }

    fun tileClicked(button:Button, name: String) {
        if (name == "Player X"){
            button.setText("X")
        }
        else {
            button.setText("O")
        }
    }

    fun changePlayerTurn(player:String): String{
        if (player == "Player X"){
            return "Player O"
        }
        else {
            return "Player X"
        }
    }


}