package application;

import java.util.Random;

public class Game {
static int playerscore = 0;
static int computerscore = 0;
static String playerChoice;
static String computerChoice;

public String getComputerChoice() {
	return computerChoice;
}

public void setComputerChoice(String computerChoice) {
	this.computerChoice = computerChoice;
}

public String getPlayerChoice() {
	return playerChoice;
}

public void setPlayerChoice(String playerChoice) {
	this.playerChoice = playerChoice;
}

public int getPlayerscore() {
	return playerscore;
}

public  void setPlayerscore(int playerscore) {
	this.playerscore = playerscore;
}

public int getComputerscore() {
	return computerscore;
}

public void setComputerscore(int computerscore) {
	this.computerscore = computerscore;
}


static String choices[] = {"rock","paper","scissor"};

public String computerChoice() {
	Random rand = new Random();
    String cpChoice = choices[rand.nextInt(3)];
    return cpChoice;
}
static void gameRound() {
	
		if(playerChoice == computerChoice) {
			
		}else if( playerChoice == "rock" && computerChoice == "scissor" || playerChoice == "scissor" && computerChoice == "paper" || playerChoice == "paper" && computerChoice == "rock") 
		{
			playerscore++;
			System.out.println(playerscore);
			System.out.println(computerscore);
			
		}else {
			computerscore++;
			System.out.println(playerscore);
			System.out.println(computerscore);
		}	
}

void reset() {
	playerscore = 0;
	computerscore = 0;
}

}
