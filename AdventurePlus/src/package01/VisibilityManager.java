package package01;

public class VisibilityManager {
	
	UI ui; // Add UI class
	
	public VisibilityManager(UI userInterface) {
		
		ui = userInterface; // Makes userInterface called ui
	}
	
	public void showTitleScreen() {
		/*
		 * SHOW THE TITLE SCREEN
		 */
		
			ui.titleNamePanel.setVisible(true); // Makes the title for start visible
			ui.startButtonPanel.setVisible(true); // Makes the start button panel visible
			ui.startButton.setVisible(true); // Makes the start button visible
		
		/*
		 * HIDE GAME SCREEN
		 */
			ui.playerPanel.setVisible(false); // Makes player information not visible
			ui.mainTextPanel.setVisible(false); // Makes main text not visible
			ui.choiceButtonPanel.setVisible(false); // hides choice button panel
			ui.choice1.setVisible(false); // sets choice1 not visible
			ui.choice2.setVisible(false); // sets choice2 not visible
			ui.choice3.setVisible(false); // sets choice3 not visible
			ui.choice4.setVisible(false); // sets choice4 not visible
			ui.inventoryPanel.setVisible(false);
			ui.imagePanel.setVisible(false);
		/*
		 * HIDE DEAD SCREEN
		 */
			ui.endNamePanel.setVisible(false);
			ui.restartButtonPanel.setVisible(false);
			ui.restartButton.setVisible(false);
			/*
			 * HIDE DEAD SCREEN
			 */
				ui.winNamePanel.setVisible(false);
				ui.restartButtonPanel.setVisible(false);
				ui.restartButton.setVisible(false);
	}
	
	public void titleToTown() {
		/*
		 * SHOW GAME SCREEN
		 */
			ui.playerPanel.setVisible(true); // Makes player information visible
			ui.mainTextPanel.setVisible(true); // Makes main text visible
			ui.choiceButtonPanel.setVisible(true); // hides choice button panel
			ui.choice1.setVisible(true); // sets choice1 visible
			ui.choice2.setVisible(true); // sets choice2 visible
			ui.choice3.setVisible(true); // sets choice3 visible
			ui.choice4.setVisible(true); // sets choice4 visible
			ui.imagePanel.setVisible(true);
		
		/*
		 * HIDE THE TITLE SCREEN
		 */
		
			ui.titleNamePanel.setVisible(false); // Makes the title for start not visible
			ui.startButton.setVisible(false); // Makes the start button not visible
			ui.inventoryPanel.setVisible(false);
		/*
		 * HIDE DEAD SCREEN
		 */
			ui.endNamePanel.setVisible(false);
			ui.restartButtonPanel.setVisible(false);
			ui.restartButton.setVisible(false);
			/*
			 * HIDE DEAD SCREEN
			 */
				ui.winNamePanel.setVisible(false);
				ui.restartButtonPanel.setVisible(false);
				ui.restartButton.setVisible(false);
	}
	
	public void characterDied() {
		/*
		 * SHOW DEAD SCREEN
		 */
			ui.endNamePanel.setVisible(true);
			ui.restartButtonPanel.setVisible(true);
			ui.restartButton.setVisible(true);
		/*
		 * HIDE GAME SCREEN
		 */
			ui.playerPanel.setVisible(false); // Makes player information not visible
			ui.mainTextPanel.setVisible(false); // Makes main text not visible
			ui.choiceButtonPanel.setVisible(false); // hides choice button panel
			ui.choice1.setVisible(false); // sets choice1 not visible
			ui.choice2.setVisible(false); // sets choice2 not visible
			ui.choice3.setVisible(false); // sets choice3 not visible
			ui.choice4.setVisible(false); // sets choice4 not visible
			ui.imagePanel.setVisible(false);
			ui.inventoryPanel.setVisible(false);
		/*
		 * HIDE THE TITLE SCREEN
		 */
			
			ui.titleNamePanel.setVisible(false); // Makes the title for start not visible
			ui.startButton.setVisible(false); // Makes the start button not visible
	}
	public void gameWin() {
		/*
		 * SHOW DEAD SCREEN
		 */
			ui.winNamePanel.setVisible(true);
			ui.restartButtonPanel.setVisible(true);
			ui.restartButton.setVisible(true);
		/*
		 * HIDE GAME SCREEN
		 */
			ui.playerPanel.setVisible(false); // Makes player information not visible
			ui.mainTextPanel.setVisible(false); // Makes main text not visible
			ui.choiceButtonPanel.setVisible(false); // hides choice button panel
			ui.choice1.setVisible(false); // sets choice1 not visible
			ui.choice2.setVisible(false); // sets choice2 not visible
			ui.choice3.setVisible(false); // sets choice3 not visible
			ui.choice4.setVisible(false); // sets choice4 not visible
			ui.imagePanel.setVisible(false);
			ui.inventoryPanel.setVisible(false);
		/*
		 * HIDE THE TITLE SCREEN
		 */
			
			ui.titleNamePanel.setVisible(false); // Makes the title for start not visible
			ui.startButton.setVisible(false); // Makes the start button not visible
			/*
			 * HIDE DEAD SCREEN
			 */
				ui.endNamePanel.setVisible(false);
				ui.restartButtonPanel.setVisible(false);
				ui.restartButton.setVisible(false);
	}
}
