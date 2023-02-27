package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ControllerClass {

    @FXML
    private ImageView computerImg;

    @FXML
    private Button paperBtn;

    @FXML
    private ImageView playerImg;

    @FXML
    private Button rockBtn;
    
    @FXML
    private Label plScorelbl;
    
    @FXML
    private Label cpScorelbl;

    @FXML
    private Button scissorBtn;
    Game newGame =  new Game();
    int playerScore = newGame.getPlayerscore();
    int computerScore = newGame.getComputerscore();
   
    
    public void cpChoiceIMG() {
    
    String cp = newGame.computerChoice();
    newGame.setComputerChoice(cp);
    	String cpChoice = newGame.getComputerChoice();
    	switch (cpChoice) {
    	case "rock":
    	 computerImg.setImage(new Image("file:/home/shiba/Documents/JavaProj/Java-RockPaperScissor/src/application/rock.png"));
    	 break;
    	case "paper":
       	 computerImg.setImage(new Image("file:/home/shiba/Documents/JavaProj/Java-RockPaperScissor/src/application/paper.png"));
       	 break;
    	case "scissor":
       	 computerImg.setImage(new Image("file:/home/shiba/Documents/JavaProj/Java-RockPaperScissor/src/application/scissor.png"));
       	 break;
    	}
    		
    }
    
    public void scoreDisplay() {
    	String cpScore = String.valueOf(newGame.getComputerscore());
    	String plScore = String.valueOf(newGame.getPlayerscore());
    	plScorelbl.setText(plScore);
    	cpScorelbl.setText(cpScore);
    }
    
    @FXML
    void playerChoiceRock(ActionEvent event) throws IOException {
    	 newGame.setPlayerChoice("rock");
    	 playerImg.setImage(new Image("file:/home/shiba/Documents/JavaProj/Java-RockPaperScissor/src/application/rock.png"));
    	 cpChoiceIMG();
    	 newGame.gameRound();
    	 scoreDisplay();
    }
    @FXML
    void playerChoicePaper(ActionEvent event) throws IOException {
    	 newGame.setPlayerChoice("paper");
    	 playerImg.setImage(new Image("file:/home/shiba/Documents/JavaProj/Java-RockPaperScissor/src/application/paper.png"));
    	 cpChoiceIMG();
    	 newGame.gameRound();
    	 scoreDisplay();
    }
    @FXML
    void playerChoiceScissor(ActionEvent event) throws IOException {
    	 newGame.setPlayerChoice("scissor");
    	 playerImg.setImage(new Image("file:/home/shiba/Documents/JavaProj/Java-RockPaperScissor/src/application/scissor.png"));
    	 cpChoiceIMG();
    	 newGame.gameRound();
    	 scoreDisplay();
}
    @FXML
    void reset(ActionEvent event) throws IOException{
    	newGame.reset();
    	scoreDisplay();
    	System.out.println("RESET");
    }
    
}

