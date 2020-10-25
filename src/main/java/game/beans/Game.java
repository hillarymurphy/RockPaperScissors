package game.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	private void setComputerPlayerToRandom() {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int play = r.nextInt(3);
		if (play == 0) {
			this.setComputerPlayer("rock");
		}
		else if (play == 1) {
			this.setComputerPlayer("paper");
		}
		else {
			this.setComputerPlayer("scissors");
		}
		
	}

	private void determineWinner() {
		// TODO Auto-generated method stub
		System.out.print(player1);  
		if (player1.contentEquals("rock")) {
			if (computerPlayer.contentEquals("scissors")) {
				this.setWinner("You");
			}
			else if (computerPlayer.contentEquals("paper")) {
				this.setWinner("Computer");
			}
			else {
				this.setWinner("No one - tie");
			}
		}
		else if (player1.contentEquals("scissors")) {
			if (computerPlayer.contentEquals("paper")) {
				this.setWinner("You");
			}
			else if (computerPlayer.contentEquals("rock")) {
				this.setWinner("Computer");
			}
			else {
				this.setWinner("No one - tie");
			}
		}
		else {
			if (computerPlayer.contentEquals("rock")) {
				this.setWinner("You");
			}
			else if (computerPlayer.contentEquals("scissors")) {
				this.setWinner("Computer");
			}
			else {
				this.setWinner("No one - tie");
			}
		}
	}
	
	
}
