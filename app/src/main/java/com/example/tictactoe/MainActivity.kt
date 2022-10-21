package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
        val playerTurn = findViewById<TextView>(R.id.currentPlayer)

        // New game
        val newGame = findViewById<Button>(R.id.newGame)

        // The tiles from 1-9
        firstTile.setOnClickListener {
            if (firstTile.getText() == "") {
                tileClicked(firstTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        secondTile.setOnClickListener {
            if (secondTile.getText() == "") {
                tileClicked(secondTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        thirdTile.setOnClickListener {
            if (thirdTile.getText() == "") {
                tileClicked(thirdTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        fourthTile.setOnClickListener {
            if (fourthTile.getText() == "") {
                tileClicked(fourthTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        fifthTile.setOnClickListener {
            if (fifthTile.getText() == "") {
                tileClicked(fifthTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        sixthTile.setOnClickListener {
            if (sixthTile.getText() == "") {
                tileClicked(sixthTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        seventhTile.setOnClickListener {
            if (seventhTile.getText() == "") {
                tileClicked(seventhTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        eighthTile.setOnClickListener {
            if (eighthTile.getText() == "") {
                tileClicked(eighthTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        ninthTile.setOnClickListener {
            if (ninthTile.getText() == "") {
                tileClicked(ninthTile, playerTurn)
                playerTurn.setText(changePlayerTurn(playerTurn))
            }
        }

        // The new game button
        newGame.setOnClickListener {
            firstTile.setText("")
            secondTile.setText("")
            thirdTile.setText("")
            fourthTile.setText("")
            fifthTile.setText("")
            sixthTile.setText("")
            seventhTile.setText("")
            eighthTile.setText("")
            ninthTile.setText("")
            playerTurn.setText("Player X\'s turn")
        }
    }

    // The function will take a button and textview as parameters. This function
    // will change tile text to the current player's symbol during their turn
    fun tileClicked(button:Button, name: TextView) {
        if (name.getText() == "Player X\'s turn"){
            button.setText("X")
        }
        else {
            button.setText("O")
        }
    }

    // The function will swap player's turn
    fun changePlayerTurn(player:TextView):String{
        if (player.getText() == "Player X\'s turn"){
            return "Player O\'s turn"
        }
        else {
            return "Player X\'s turn"
        }
    }

}