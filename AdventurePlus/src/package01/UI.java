package package01; // Sets UI class to the package called package01

/*
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */

	/*
	 * JAVA AWT IMPORTS
	 */

		import java.awt.Color; // Allows color to be used on page and creation of custom colors
		import java.awt.Font; // Allows creation of custom fonts
		import java.awt.GridLayout; // Allows creation of grids
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

/*
	 * JAVAX SWING IMPORTS
	 */
		
		import javax.swing.JButton; // Allows creation of buttons on page
		import javax.swing.JFrame; // Allows creation of the window
		import javax.swing.JLabel; // Allows creation of text to go into the panels
		import javax.swing.JPanel; // Allows creation of panel's
		import javax.swing.JTextArea; // Allows creation of text areas

	/*
	 * PACKAGE).GAME IMPORTS
	 */
		
		import package01.Game.ChoiceHandler; // Allows use of ChoiceHandler class
import package01.Game.InventoryHandler;

/*
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */

public class UI {
	InventoryHandler iHandler = new InventoryHandler();
	/*
	 * CREATE VARIABLES FOR EVERYTHING ON PAGE
	*/
	
		JFrame window; // Creates a JFrame window
		JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, endNamePanel, restartButtonPanel, winNamePanel, imagePanel, inventoryPanel; // titleNamePanel: Creates a panel for the title of the game, startButtonPanel: Creates Panel for Start Button, mainTextPanel: Creates panel for Main game text, choiceButtonPanel: Creates panel for choice buttons, playerPanel: Creates panel for player data 
		JLabel titleNameLabel, hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel, endNameLabel, winNameLabel, imageLabel; // titleNameLabel: Creates label(text) for the title panel, hpLabel: Creates a label for hp, hpNumberLabel: Creates label for player's HP, weaponLabel: Creates label for weapon, weaponNameLabel: Creates label for the player's weapon
		JButton startButton, choice1, choice2, choice3, choice4, restartButton, inventoryButton, itemButton1, itemButton2, itemButton3, itemButton4, itemButton5, itemButton6, itemButton7, itemButton8, itemButton9, itemButton10, itemButton11, itemButton12; // startButton: Creates a button for starting the game, choice1: Creates Button for first choice, choice2: Creates Button for second choice, choice3: Creates Button for third choice, choice4: Creates Button for fourth choice
		JTextArea mainTextArea; // mainTextArea: Creates a Text Area for the game text to go into
		Font titleFont = new Font("Times New Roman", Font.PLAIN, 90); // Creates custom font for title text
		Font normalFont = new Font("Times New Roman", Font.PLAIN, 26); // Creates custom font for all other text on page
		ImageIcon image;
		String inventoryStatus;

		// Custom color in RGB mode: Color colorName = new Color(0,0,0);
		// Custom color in RGBA mode: Color colorName = new Color(0,0,0,0.5);
		// Custom color in HEX(#) mode: Color colorName = Color.decode("#000000");
		// If you only need to have a color once you would use .setBackground(new Color(0,0,0); or .setBackground(new Color(0,0,0,0.5); or .setBackground(Color.decode("#000000"));
		
/*
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	public void createUI(ChoiceHandler cHandler) {
		
		/*
		 * 	CREATE WINDOW
		 */
		
			/* -- CREATE WINDOW VALUES -- */
		
				window =new JFrame(); // Sets window as a JFrame
				window.setSize(800,600); // Sets size to window
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Defines When the game stops running
				window.getContentPane().setBackground(Color.black); // Sets background color of window
				window.setLayout(null); // Allows use of custom layout
				

/*
* =====================================================================================================================================================================================
*                                                                        === START SCREEN ===
* =====================================================================================================================================================================================
*/
		
		/*
		* CREATE FIRST SCREEN		
		*/
				
			/*
			 * TITLE
			 */
				
				/* -- TITLE PANEL -- */
				
					titleNamePanel = new JPanel(); // Sets titleNewPanel as a JPanel also creates panel where the title text will go
					titleNamePanel.setBounds(-60, 100, 900, 500); // Sets position and size of text field
					titleNamePanel.setBackground(Color.black); // Sets background color of text field
		
				/* -- TITLE LABEL(TEXT) -- */
					
					titleNameLabel = new JLabel(""
							+"<html>"
							+"	<body style='text-align:center'>"
							+"		GUILD MISSIONS <br> ADVENTURE 1"
							+"	</body>"
							+"</html>"); // Sets titleNewLabel as a JLabel also creates text for the titleNamePanel
					titleNameLabel.setForeground(Color.white); // Sets color of the text
					titleNameLabel.setFont(titleFont); // Uses custom font for the text
					titleNameLabel.setVisible(true);

			/*
			 * START BUTTON
			 */
					
				/* -- START BUTTON PANEL -- */
					
					startButtonPanel = new JPanel(); // Sets startButtonPanel as a JPanel also creates panel where the start button will go
					startButtonPanel.setBounds(300, 400, 200, 100); // Sets position and size of the start button
					startButtonPanel.setBackground(Color.black); // Sets color of the start button panel to black
					startButtonPanel.setVisible(false); // sets the startButtonPanel not visible to fix button pop up
					
				/* -- START BUTTON -- */
					
					startButton = new JButton("START"); // Sets StartButton as a JButton also creates text for the button
					startButton.setBackground(Color.black); // Sets background color for the start button 
					startButton.setForeground(Color.white); // Sets color of the text of the button
					startButton.setFont(normalFont); // Sets font of the button to the normalFont
					startButton.setFocusPainted(false); // Removes Blue Focus ring out side of the button
					startButton.setVisible(true); // sets the startButton visible to fix button pop up
			
									

/*
 * =====================================================================================================================================================================================
 *                                                                        === GAME SCREEN ===
 * =====================================================================================================================================================================================
 */
				
	/*
	 * PLAYER INFORMATION
	 */
				
				/* -- PLAYER PANEL -- */
				
					playerPanel = new JPanel(); // Sets playerPanel as a JPanel also creates panel where the player information will go
					playerPanel.setBounds(500, 100, 270, 70); // Sets position and size of the player panel
					playerPanel.setBackground(Color.black); // Sets background color of the player panel to black
					playerPanel.setLayout(new GridLayout(2,2)); // Sets layout of panel to a grid that has 1 row and 4 columns
					
				/* -- HP LABEL -- */
					
					hpLabel = new JLabel("HP: "); // Sets hpLabel as a JLabel also creates text for first column in playerPanel
					hpLabel.setForeground(Color.white); // Sets text color of hpLabel to white
					hpLabel.setFont(normalFont); // Sets font of hpLabel to normalFont
					
				/* -- HP NUMBER(#) LABEL -- */
					hpNumberLabel = new JLabel(); // Sets hpNumberLabel as a JLabel also creates text for second column in playerPanel
					hpNumberLabel.setForeground(Color.white); // Sets text color of hpNumberLabel to white
					hpNumberLabel.setFont(normalFont); // Sets font of hpNumberLabel to normalFont
					
				/* -- WEAPON LABEL -- */
					weaponLabel = new JLabel("WEAPON: "); // Sets weaponLabel as a JLabel also creates text for third column in playerPanel
					weaponLabel.setForeground(Color.white); // Sets text color of weaponLabel to white
					weaponLabel.setFont(normalFont); // Sets font of weaponLabel to normalFont
					
				/* -- WEAPON NAME LABEL -- */
					weaponNameLabel = new JLabel(); // Sets weaponNameLabel as a JLabel also creates text for fourth and final column in playerPanel
					weaponNameLabel.setForeground(Color.white); // Sets text color of weaponNameLabel to white
					weaponNameLabel.setFont(normalFont); // Sets font of weaponNameLabel to normalFont
	
	/*
	 * IMAGE
	 */
					
					imagePanel = new JPanel();
					imagePanel.setBounds(10,50,420,250);
					imagePanel.setBackground(Color.black);
					window.add(imagePanel);
					imageLabel = new JLabel();
					//image = new ImageIcon(".//res//BlackScreen.jpg");
					image = new ImageIcon(getClass().getClassLoader().getResource("BlackScreen.jpg"));
					imageLabel.setIcon(image);
					imagePanel.add(imageLabel);
				
	/*
	 * MAIN TEXT
	 */
				
		/* -- MAIN TEXT PANEL -- */
				
			mainTextPanel = new JPanel(); // Sets mainTextPanel as a panel also creates panel for main text of the game
			mainTextPanel.setBounds(10, 350, 450, 250); // Sets the position and size of main text panel of the game
			mainTextPanel.setBackground(Color.black); // Sets background color of main text panel to black
		
		/* -- MAIN TEXT AREA -- */
			
			mainTextArea = new JTextArea("THIS THE MAIN TEXT AREA"); // Sets mainText area as a text area also adds text to area
			mainTextArea.setBounds(50, 350, 430, 250); // Sets position and size of the text area
			mainTextArea.setBackground(Color.black); // Sets background color of main text area to black
			mainTextArea.setForeground(Color.white); // Sets text color of the main text area to white
			mainTextArea.setFont(normalFont); // Sets Font to normalFont
			mainTextArea.setLineWrap(true); // Allows line wrapping in text field
			mainTextArea.setEditable(false); // Makes text area no editable
			
	/*
	 * CHOICE BUTTONS
	 */	
			
		/* -- CHOICE BUTTON PANEL -- */
			
			choiceButtonPanel = new JPanel(); // Sets choiceButtonPanel as a panel also panel where choice buttons will go
			choiceButtonPanel.setBounds(500, 350, 250, 200); // Sets position and size of choice button panel
			choiceButtonPanel.setBackground(Color.black); // Sets background color of choice button panel to black
			choiceButtonPanel.setLayout(new GridLayout(5,1)); // Sets the layout of the panel to a grid with 4 rows and 1 column
			choiceButtonPanel.setVisible(false); // sets the choiceButtonPanel not visible to fix button pop up
			
		/* -- CHOICE BUTTON JBUTTON'S -- */
			
			/* - CHOICE1 BUTTON - */
				
				choice1 = new JButton("CHOICE 1"); // Sets choice1 as a JButton also sets text of choice1
				choice1.setBackground(Color.black); // Sets background color of choice1 to black
				choice1.setForeground(Color.white); // Sets text color of choice1 to white
				choice1.setFont(normalFont); // Sets font of choice1 to normalFont
				choice1.setFocusPainted(false); // Removes Blue Focus ring out side of the button
				choice1.setVisible(true); // sets choice1 visible to fix button pop up
			
			/* - CHOICE2 BUTTON - */	
			
				choice2 = new JButton("CHOICE 2"); // Sets choice2 as a JButton also sets text of choice2
				choice2.setBackground(Color.black); // Sets background color of choice2 to black
				choice2.setForeground(Color.white); // Sets text color of choice2 to white
				choice2.setFont(normalFont); // Sets font of choice2 to normalFont
				choice2.setFocusPainted(false); // Removes Blue Focus ring out side of the button
				choice2.setVisible(true); // sets choice2 visible to fix button pop up
			
			/* - CHOICE3 BUTTON - */	
			
				choice3 = new JButton("CHOICE 3"); // Sets choice1 as a JButton also sets text of choice3
				choice3.setBackground(Color.black); // Sets background color of choice3 to black
				choice3.setForeground(Color.white); // Sets text color of choice3 to white
				choice3.setFont(normalFont); // Sets font of choice3 to normalFont
				choice3.setFocusPainted(false); // Removes Blue Focus ring out side of the button
				choice3.setVisible(true); // sets choice3 visible to fix button pop up
			
			/* - CHOICE4 BUTTON - */
			
				choice4 = new JButton("CHOICE 4"); // Sets choice1 as a JButton also sets text of choice4
				choice4.setBackground(Color.black); // Sets background color of choic4 to black
				choice4.setForeground(Color.white); // Sets text color of choice4 to white
				choice4.setFont(normalFont); // Sets font of choice4 to normalFont
				choice4.setFocusPainted(false); // Removes Blue Focus ring out side of the button
				choice4.setVisible(true); // sets choice4 visible to fix button pop up
				
				inventoryButton = new JButton("Inventory"); // Sets choice1 as a JButton also sets text of choice4
				inventoryButton.setBackground(new Color(0,0,24));
				inventoryButton.setForeground(Color.white);
				inventoryButton.setFont(normalFont);
				inventoryButton.setFocusPainted(false);
				inventoryButton.addActionListener(iHandler);
				inventoryButton.setActionCommand("inventoryButton");
				
				inventoryPanel = new JPanel();
				inventoryPanel.setBounds(10,350,450,250);
				inventoryPanel.setBackground(Color.black);
				inventoryPanel.setLayout(new GridLayout(5,3));
				
				
				itemButton1 = new JButton("Item 01");
				itemButton1.setBackground(Color.black);
				itemButton1.setForeground(Color.white);
				itemButton1.setFont(normalFont);
				itemButton1.setFocusPainted(false);
				
				itemButton1.addActionListener(iHandler);
				itemButton1.setActionCommand("item1");
				
				itemButton2 = new JButton("Item 02");
				itemButton2.setBackground(Color.black);
				itemButton2.setForeground(Color.white);
				itemButton2.setFont(normalFont);
				itemButton2.setFocusPainted(false);
				
				itemButton2.addActionListener(iHandler);
				itemButton2.setActionCommand("item2");
				
				itemButton3 = new JButton("Item 03");
				itemButton3.setBackground(Color.black);
				itemButton3.setForeground(Color.white);
				itemButton3.setFont(normalFont);
				itemButton3.setFocusPainted(false);
				
				itemButton3.addActionListener(iHandler);
				itemButton3.setActionCommand("item3");
				
				itemButton4 = new JButton("Item 04");
				itemButton4.setBackground(Color.black);
				itemButton4.setForeground(Color.white);
				itemButton4.setFont(normalFont);
				itemButton4.setFocusPainted(false);
				
				itemButton4.addActionListener(iHandler);
				itemButton4.setActionCommand("item4");
				
				itemButton5 = new JButton("Item 05");
				itemButton5.setBackground(Color.black);
				itemButton5.setForeground(Color.white);
				itemButton5.setFont(normalFont);
				itemButton5.setFocusPainted(false);
				
				itemButton5.addActionListener(iHandler);
				itemButton5.setActionCommand("item5");
				
				itemButton6 = new JButton("Item 06");
				itemButton6.setBackground(Color.black);
				itemButton6.setForeground(Color.white);
				itemButton6.setFont(normalFont);
				itemButton6.setFocusPainted(false);
				
				itemButton6.addActionListener(iHandler);
				itemButton6.setActionCommand("item6");
				
				itemButton7 = new JButton("Item 07");
				itemButton7.setBackground(Color.black);
				itemButton7.setForeground(Color.white);
				itemButton7.setFont(normalFont);
				itemButton7.setFocusPainted(false);
				
				itemButton7.addActionListener(iHandler);
				itemButton7.setActionCommand("item7");
				
				itemButton8 = new JButton("Item 08");
				itemButton8.setBackground(Color.black);
				itemButton8.setForeground(Color.white);
				itemButton8.setFont(normalFont);
				itemButton8.setFocusPainted(false);
				
				itemButton8.addActionListener(iHandler);
				itemButton8.setActionCommand("item8");
				
				
				itemButton9 = new JButton("Item 09");
				itemButton9.setBackground(Color.black);
				itemButton9.setForeground(Color.white);
				itemButton9.setFont(normalFont);
				itemButton9.setFocusPainted(false);
				
				itemButton9.addActionListener(iHandler);
				itemButton9.setActionCommand("item9");
				
				itemButton10 = new JButton("Item 10");
				itemButton10.setBackground(Color.black);
				itemButton10.setForeground(Color.white);
				itemButton10.setFont(normalFont);
				itemButton10.setFocusPainted(false);
				
				itemButton10.addActionListener(iHandler);
				itemButton10.setActionCommand("item10");
				
				itemButton11 = new JButton("Item 11");
				itemButton11.setBackground(Color.black);
				itemButton11.setForeground(Color.white);
				itemButton11.setFont(normalFont);
				itemButton11.setFocusPainted(false);
				
				itemButton11.addActionListener(iHandler);
				itemButton11.setActionCommand("item11");
				
				itemButton12 = new JButton("Item 12");
				itemButton12.setBackground(Color.black);
				itemButton12.setForeground(Color.white);
				itemButton12.setFont(normalFont);
				itemButton12.setFocusPainted(false);
				
				itemButton12.addActionListener(iHandler);
				itemButton12.setActionCommand("item12");
				
				inventoryStatus ="close";
				
				
				
			/*
			 * =====================================================================================================================================================================================
			 *                                                                        === DEAD SCREEN ===
			 * =====================================================================================================================================================================================
			 */
						
						/*
						* CREATE FIRST SCREEN		
						*/
								
							/*
							 * TITLE
							 */
								
								/* -- TITLE PANEL -- */
								
									endNamePanel = new JPanel(); // Sets titleNewPanel as a JPanel also creates panel where the title text will go
									endNamePanel.setBounds(-60, 100, 900, 500); // Sets position and size of text field
									endNamePanel.setBackground(Color.black); // Sets background color of text field
						
								/* -- TITLE LABEL(TEXT) -- */
									
									endNameLabel = new JLabel(""
											+"<html>"
											+"	<body style='text-align:center'>"
											+"		<b>Y O U &nbsp; &nbsp; D I E D</b><br> You have no more HP!"
											+"	</body>"
											+"</html>"); // Sets titleNewLabel as a JLabel also creates text for the titleNamePanel
									endNameLabel.setForeground(Color.white); // Sets color of the text
									endNameLabel.setFont(Game.deadFont); // Uses custom font for the text
									endNameLabel.setVisible(true);

							/*
							 * START BUTTON
							 */
									
								/* -- RESTART BUTTON PANEL -- */
									
									restartButtonPanel = new JPanel(); // Sets startButtonPanel as a JPanel also creates panel where the start button will go
									restartButtonPanel.setBounds(300, 400, 200, 100); // Sets position and size of the start button
									restartButtonPanel.setBackground(Color.black); // Sets color of the start button panel to black
									restartButtonPanel.setVisible(false); // sets the startButtonPanel not visible to fix button pop up
									
								/* -- START BUTTON -- */
									
									restartButton = new JButton("RESTART"); // Sets StartButton as a JButton also creates text for the button
									restartButton.setBackground(Color.black); // Sets background color for the start button 
									restartButton.setForeground(Color.white); // Sets color of the text of the button
									restartButton.setFont(normalFont); // Sets font of the button to the normalFont
									restartButton.setFocusPainted(false); // Removes Blue Focus ring out side of the button
									restartButton.setVisible(true); // sets the startButton visible to fix button pop up
													

/*
 * =====================================================================================================================================================================================
 *                                                                        === DEAD SCREEN ===
 * =====================================================================================================================================================================================
 */
												
			/*
			 * CREATE FIRST SCREEN		
			 */
														
				/*
				 * TITLE
				 */
														
					/* -- TITLE PANEL -- */
														
						winNamePanel = new JPanel(); // Sets titleNewPanel as a JPanel also creates panel where the title text will go
						winNamePanel.setBounds(-60, 100, 900, 500); // Sets position and size of text field
						winNamePanel.setBackground(Color.black); // Sets background color of text field
												
									/* -- TITLE LABEL(TEXT) -- */
															
										winNameLabel = new JLabel(""
													+"<html>"
													+"	<body style='text-align:center'>"
													+"		<b>Y O U &nbsp;&nbsp;W I N</b><br>You Woke up and Found yourself in the real world"
													+"	</body>"
													+"</html>"); // Sets titleNewLabel as a JLabel also creates text for the titleNamePanel
										winNameLabel.setForeground(Color.white); // Sets color of the text
										winNameLabel.setFont(Game.winFont); // Uses custom font for the text
										winNameLabel.setVisible(true);

				/*
				 * START BUTTON
				 */
															
					/* -- RESTART BUTTON PANEL -- */
															
									restartButtonPanel = new JPanel(); // Sets startButtonPanel as a JPanel also creates panel where the start button will go
									restartButtonPanel.setBounds(300, 400, 200, 100); // Sets position and size of the start button
									restartButtonPanel.setBackground(Color.black); // Sets color of the start button panel to black
									restartButtonPanel.setVisible(false); // sets the startButtonPanel not visible to fix button pop up
															
					/* -- START BUTTON -- */
															
									restartButton = new JButton("RESTART"); // Sets StartButton as a JButton also creates text for the button
									restartButton.setBackground(Color.black); // Sets background color for the start button 
									restartButton.setForeground(Color.white); // Sets color of the text of the button
									restartButton.setFont(normalFont); // Sets font of the button to the normalFont
									restartButton.setFocusPainted(false); // Removes Blue Focus ring out side of the button
									restartButton.setVisible(true); // sets the startButton visible to fix button pop up
																			

														
	/*
	 * ADD ACTION's
	 */
								
		/* -- ACTION LISTNER -- */
								
			startButton.addActionListener(cHandler); // Adds a listener to start button
								
		/*	-- ACTION COMMAND -- */
			startButton.setActionCommand("start"); // Sets the action command for the start button
								
	/*
	 * ADD TO WINDOW
	 */
			
		/* -- ADD LABELS & BUTTONS TO PANELS -- */
												
				titleNamePanel.add(titleNameLabel); //Adds titleNameLabel to titleNamePanel
				startButtonPanel.add(startButton); // Adds startButton to the startButtonPanel
			
			/* - playerPanel - */
				
				playerPanel.add(hpLabel); // Adds hpLabel to playerPanel
				playerPanel.add(hpNumberLabel); // Adds hpNumberLabel to playerPanel
				playerPanel.add(weaponLabel); // Adds weaponLabel to playerPanel
				playerPanel.add(weaponNameLabel); // Adds weaponNameLabel to playerPanel
			
			/* - mainTextPanel - */
			
				mainTextPanel.add(mainTextArea); // Adds mainTextArea to mainTextPanel
			
			/* - ChoiceButtonPanel - */
			
				choiceButtonPanel.add(choice1); // Adds choice1 button to choiceButtonPanel
				choiceButtonPanel.add(choice2); // Adds choice2 button to choiceButtonPanel
				choiceButtonPanel.add(choice3); // Adds choice3 button to choiceButtonPanel
				choiceButtonPanel.add(choice4); // Adds choice4 button to choiceButtonPanel
				choiceButtonPanel.add(inventoryButton);
				
				inventoryPanel.add(itemButton1);
				inventoryPanel.add(itemButton2);
				inventoryPanel.add(itemButton3);
				inventoryPanel.add(itemButton4);
				inventoryPanel.add(itemButton5);
				inventoryPanel.add(itemButton6);
				inventoryPanel.add(itemButton7);
				inventoryPanel.add(itemButton8);
				inventoryPanel.add(itemButton9);
				inventoryPanel.add(itemButton10);
				inventoryPanel.add(itemButton11);
				inventoryPanel.add(itemButton12);

				
				endNamePanel.add(endNameLabel); //Adds titleNameLabel to titleNamePanel
				restartButtonPanel.add(restartButton); // Adds startButton to the startButtonPanel
				
				winNamePanel.add(winNameLabel); //Adds titleNameLabel to titleNamePanel
				restartButtonPanel.add(restartButton); // Adds startButton to the startButtonPanel
				

			
		/* -- ADD PANELS TO WINDOW -- */
			
			window.add(mainTextPanel); // Adds mainTextPanel to the JFrame named window
			window.add(choiceButtonPanel); // Adds choiceButtonPanel to the window
			window.add(playerPanel); // Adds playerPanel to window
			window.add(titleNamePanel); // Adds title panel to the JFrame named window
			window.add(startButtonPanel); // Adds start button panel to window
			window.add(endNamePanel); // Adds title panel to the JFrame named window
			window.add(winNamePanel); // Adds title panel to the JFrame named window
			window.add(restartButtonPanel); // Adds start button panel to window
			window.add(inventoryPanel);
			
	/*
	 * ADD ACTION's
	 */
		restartButton.addActionListener(cHandler);
		restartButton.setActionCommand("restart");
		/* -- ACTION LISTNER -- */
					
			choice1.addActionListener(cHandler); // Adds a listener to choice1
			choice2.addActionListener(cHandler); // Adds a listener to choice2
			choice3.addActionListener(cHandler); // Adds a listener to choice3
			choice4.addActionListener(cHandler); // Adds a listener to choice4
					
		/*	-- ACTION COMMAND -- */
			choice1.setActionCommand("c1"); // Sets the action command for the choice1 button
			choice2.setActionCommand("c2"); // Sets the action command for the choice2 button
			choice3.setActionCommand("c3"); // Sets the action command for the choice3 button
			choice4.setActionCommand("c4"); // Sets the action command for the choice4 button
			
			
			
			
/*
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
							
	/*
	 * SHOW WINDOW
	 */
										
		/* -- SET WINDOW TO VISIBLE -- */
										
			window.setVisible(true);// Allows person to see window
		
	}
	public class InventoryHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String yourChoice = event.getActionCommand();
			
			switch(yourChoice) {
			case "inventoryButton":

				if(inventoryStatus.equalsIgnoreCase("close")) {
					mainTextArea.setVisible(false);
					inventoryPanel.setVisible(true);
					choice1.setVisible(false);
					choice2.setVisible(false);
					choice3.setVisible(false);
					choice4.setVisible(false);
					inventoryStatus = "open";
				}else if(inventoryStatus.equalsIgnoreCase("open")) {
					mainTextArea.setVisible(true);
					inventoryPanel.setVisible(false);
					inventoryStatus = "close";
					choice1.setVisible(true);
					choice2.setVisible(true);
					choice3.setVisible(true);
					choice4.setVisible(true);
				}
				break;
			}
		}
	}
}
