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

        // Winner?
        var winnerCheck = false

        // Tie?
        var tieCheck = false

        // The tiles from 1-9
        firstTile.setOnClickListener {
            if (firstTile.getText() == "" && !winnerCheck) {
                tileClicked(firstTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        secondTile.setOnClickListener {
            if (secondTile.getText() == "" && !winnerCheck) {
                tileClicked(secondTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        thirdTile.setOnClickListener {
            if (thirdTile.getText() == "" && !winnerCheck) {
                tileClicked(thirdTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        fourthTile.setOnClickListener {
            if (fourthTile.getText() == "" && !winnerCheck) {
                tileClicked(fourthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        fifthTile.setOnClickListener {
            if (fifthTile.getText() == "" && !winnerCheck) {
                tileClicked(fifthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        sixthTile.setOnClickListener {
            if (sixthTile.getText() == "" && !winnerCheck) {
                tileClicked(sixthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        seventhTile.setOnClickListener {
            if (seventhTile.getText() == "" && !winnerCheck) {
                tileClicked(seventhTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        eighthTile.setOnClickListener {
            if (eighthTile.getText() == "" && !winnerCheck) {
                tileClicked(eighthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        ninthTile.setOnClickListener {
            if (ninthTile.getText() == "" && !winnerCheck) {
                tileClicked(ninthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else if (!winnerCheck){
                    playerTurn.setText(changePlayerTurn(playerTurn))
                }
            }
        }

        // The new game button will change all tiles to blank, player x will have the first turn,
        // and set winnerCheck to false
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
            winnerCheck = false
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

    // The function will take all of the tiles and check for any symbols lined up in 3 in row, return true
    // if a row has been matched
    fun checkingForWinner(tile1: Button, tile2: Button, tile3: Button, tile4: Button, tile5: Button,
                          tile6: Button, tile7: Button, tile8: Button, tile9: Button):Boolean {
        // Checking horizontal rows with symbols Xs
        if (((tile1.getText() == "X") && (tile2.getText() == "X") && (tile3.getText() == "X")) ||
            ((tile4.getText() == "X") && (tile5.getText() == "X") && (tile6.getText() == "X")) ||
            ((tile7.getText() == "X") && (tile8.getText() == "X") && (tile9.getText() == "X"))){
            return true
        }

        // Checking horizontal rows with symbols Os
        else if (((tile1.getText() == "O") && (tile2.getText() == "O") && (tile3.getText() == "O")) ||
            ((tile4.getText() == "O") && (tile5.getText() == "O") && (tile6.getText() == "O")) ||
            ((tile7.getText() == "O") && (tile8.getText() == "O") && (tile9.getText() == "O"))){
            return true
        }

        // Checking vertical rows with symbols Xs
        else if (((tile1.getText() == "X") && (tile4.getText() == "X") && (tile7.getText() == "X")) ||
            ((tile2.getText() == "X") && (tile5.getText() == "X") && (tile8.getText() == "X")) ||
            ((tile3.getText() == "X") && (tile6.getText() == "X") && (tile9.getText() == "X"))){
            return true
        }

        // Checking vertical rows with symbols Os
        else if (((tile1.getText() == "O") && (tile4.getText() == "O") && (tile7.getText() == "O")) ||
            ((tile2.getText() == "O") && (tile5.getText() == "O") && (tile8.getText() == "O")) ||
            ((tile3.getText() == "O") && (tile6.getText() == "O") && (tile9.getText() == "O"))){
            return true
        }

        // Checking crossing rows Xs
        else if (((tile1.getText() == "X") && (tile5.getText() == "X") && (tile9.getText() == "X")) ||
            ((tile7.getText() == "X") && (tile5.getText() == "X") && (tile3.getText() == "X"))){
            return true
        }

        // Checking crossing rows 0s
        else if (((tile1.getText() == "O") && (tile5.getText() == "O") && (tile9.getText() == "O")) ||
            ((tile7.getText() == "O") && (tile5.getText() == "O") && (tile3.getText() == "O"))){
            return true
        }

        // Return false if none of the conditions are met
        return false
    }

    // Change the playerTurn text to winner text
    fun winnerMet(player:TextView):String{
        if (player.getText() == "Player X\'s turn"){
            return "X wins"
        }
        else {
            return "O wins"
        }
    }
}