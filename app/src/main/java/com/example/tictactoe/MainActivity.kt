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
            if (firstTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(firstTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        secondTile.setOnClickListener {
            if (secondTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(secondTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        thirdTile.setOnClickListener {
            if (thirdTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(thirdTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        fourthTile.setOnClickListener {
            if (fourthTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(fourthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        fifthTile.setOnClickListener {
            if (fifthTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(fifthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        sixthTile.setOnClickListener {
            if (sixthTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(sixthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        seventhTile.setOnClickListener {
            if (seventhTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(seventhTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        eighthTile.setOnClickListener {
            if (eighthTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(eighthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        ninthTile.setOnClickListener {
            if (ninthTile.getText() == "" && !winnerCheck && !tieCheck) {
                tileClicked(ninthTile, playerTurn)
                winnerCheck = checkingForWinner(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                    sixthTile, seventhTile, eighthTile, ninthTile)
                if (winnerCheck){
                    playerTurn.setText(winnerMet(playerTurn))
                }
                else {
                    tieCheck = checkingForTie(firstTile, secondTile, thirdTile, fourthTile, fifthTile,
                        sixthTile, seventhTile, eighthTile, ninthTile)
                    if (!tieCheck)
                        playerTurn.setText(changePlayerTurn(playerTurn))
                    else {
                        playerTurn.setText(tieMet(playerTurn))
                    }
                }
            }
        }

        // The new game button will change all tiles to blank, player x will have the first turn,
        // and set both tieCheck and winnerCheck to false
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
            tieCheck = false
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

    fun checkingForTie(tile1: Button, tile2: Button, tile3: Button, tile4: Button, tile5: Button,
                       tile6: Button, tile7: Button, tile8: Button, tile9: Button):Boolean{
        // If all tiles are not null
        if ((tile1.getText() != "") && (tile2.getText() != "") && (tile3.getText() != "") && (tile4.getText() != "") &&
            (tile5.getText() != "") && (tile6.getText() != "") && (tile7.getText() != "") && (tile8.getText() != "") &&
            (tile9.getText() != "")){
            return true
        }
        return false
    }

    fun tieMet(player: TextView):String {return "Tie!"}

}