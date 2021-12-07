package package01; // Sets up Game Class in package package01

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.awt.GraphicsEnvironment;

/*
 * IMPORTS
 */
	/* -- JAVA AWT IMPORTS -- */

		/* - EVENT -*/

			import java.awt.event.ActionEvent; // Allows to use the ActionEvent in code
			import java.awt.event.ActionListener; // Allows to use the ActionListner in code



public class Game {	
    static Font deadFont;
    static Font winFont;
	String nextPosition1, nextPosition2, nextPosition3, nextPosition4; // Create nextPosition variables
/*
 * CREATE THE CONNECTIONS TO OTHER CLASSES
 */
	
	//CREATE CONNECTION TO CHOICE HANDLER CLASS
	
		ChoiceHandler cHandler = new ChoiceHandler(); // Instantiate ChoiceHandler class

	
	//CREATE CONNECTION TO UI CLASS
	
		UI ui = new UI(); // Instantiate UI class
		
		
	//CREATE CONNECTION TO VISIBILITY MANAGER Class
		
		VisibilityManager vm = new VisibilityManager(ui); // Instantiate VisibilityManager class
		
	//CREATE CONNECTION TO VISIBILITY MANAGER Class
			
		Story story = new Story(this, ui, vm); // Instantiate VisibilityManager class


	public static void main(String[] args) {
		try {

			deadFont = Font.createFont(Font.TRUETYPE_FONT, new File("Butcherman-Regular.ttf")).deriveFont(60f);

			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Butcherman-Regular.ttf")));
			}
			catch(IOException | FontFormatException e) {
				
			}
		try {

			winFont = Font.createFont(Font.TRUETYPE_FONT, new File("TradeWinds-Regular.ttf")).deriveFont(60f);

			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("TradeWinds-Regular.ttf")));
			}
			catch(IOException | FontFormatException e) {
				
			}
		
			new Game(); // Activates Game method
			
	}
	
	public Game() {
		
		//STARTS THE GAME
			ui.createUI(cHandler); // Access the createUI method from UI also allows UI to have cHandler class

			story.defaultSetup();
			vm.showTitleScreen();
			
	}

	
	public class ChoiceHandler implements ActionListener{ // Creates a class called ChoiceHandler that uses ActionListner
		
		public void actionPerformed(ActionEvent event) {
			/*
			 * VARIABLES
			 */
			
				String yourChoice = event.getActionCommand(); // Stores users choice to the yourChoice variable
				
			/*
			 * SWITCH STATEMENT(KIND OF LIKE A BETTER IF STATEMENT)
			 */
				
				switch(yourChoice) {//Switch case start
					case "start": // Calls a case of when start is clicked
						vm.titleToTown(); // Makes main text Visible
						story.townGate();
						break;
					case "c1":// Calls a case of when choice1 is clicked
						if(story.player.hp<= 0) {
							vm.characterDied();
						}else {
							story.selectPosition(nextPosition1);
						}

						break;
					case "c2": // Calls a case of when choice2 is clicked
						if(story.player.hp <= 0) {
							vm.characterDied();
						}else {
							story.selectPosition(nextPosition2);
						}
						break;
					case "c3": // Calls a case of when choice3 is clicked
						if(story.player.hp<= 0) {
							vm.characterDied();
						}else {
							story.selectPosition(nextPosition3);
						}
						break;
					case "c4": // Calls a case of when choice4 is clicked
						if(story.player.hp<= 0) {
							vm.characterDied();
						}else {
							story.selectPosition(nextPosition4);
						}
						break;
					case "restart":
						story.defaultSetup();
						vm.showTitleScreen();
						break;
				}
				
		}
		
	}
	
	
	}

