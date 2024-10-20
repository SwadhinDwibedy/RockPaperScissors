package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var PlayerChoice = ""
    println("From rock paper scissors Enter your choice")
    PlayerChoice= readln()
    val randomNumber = (1..3).random()
    when(randomNumber){
        1->{
            computerChoice="rock"
        }2->{
            computerChoice="paper"
        }3-> {
        computerChoice = "scissors"
        }
    }
    println(computerChoice)
    val winner = when {
        PlayerChoice == computerChoice -> "Tie"
        PlayerChoice == "rock"&&computerChoice=="scissors"->"Player"
        PlayerChoice == "scissors"&&computerChoice=="paper"->"Player"
        PlayerChoice == "paper"&&computerChoice=="rock"->"Player"
        else->"computer"
    }
    if(winner == "Tie"){
        println("its a tie")
    }else{
        println("$winner won!")
    }
}