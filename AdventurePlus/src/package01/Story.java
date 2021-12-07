package package01;

import javax.swing.ImageIcon;

import monster.Boss_EarthMound;
import monster.Boss_KingGoblin;
import monster.Monster_MinesGoblin;
import monster.SuperBoss;
import monster.SuperMonster;
import package02.Weapon_AxeOfFelling;
import package02.Weapon_Knife;
import package02.Weapon_LongSword;

public class Story {
	Game game; // Set Game class to game
	UI ui; // Set UI class to ui
	VisibilityManager vm; // Set VisibilityManager class to vm
	Player player = new Player(); // Set Player class to player and create player
	SuperMonster monster;
	SuperBoss boss;
	int funVal = new java.util.Random().nextInt(90);
	
	/*
	 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 */
	
	public Story(Game g, UI userInterface, VisibilityManager vManager) {
		game = g; // Sets g to game
		ui = userInterface; // Sets userInterface to ui
		vm = vManager; // Sets vManager to vm
	}
	
	public void defaultSetup() {
		player.maxHp = 25;
		
		player.hp = 25; // Set player Default HP
		ui.hpNumberLabel.setText("<html><body><b>"+ player.hp + "</b></body></html");
		
		player.currentWeapon = new Weapon_Knife();
		ui.weaponNameLabel.setText("<html><body><b>"+ player.currentWeapon.name + "</b></body></html");
	}
	
	public void selectPosition(String nextPosition) {
		switch(nextPosition) {
		case "townGate":
			townGate();
			break;
		case "talkGuard":
			talkGuard();
			break;
		case "attackGuard":
			attackGuard();
			break;
		case "crossRoad":
			crossRoad();
			break;
		case "north":
			north();
			break;
		case "east":
			east();
			break;
		case "eastForth":
			eastForth();
			break;
		case "eastLeft":
			eastLeft();
			break;
		case "storeRoom":
			storeRoom();
			break;
		case "AxeLog":
			AxeLog();
			break;
		case "AxePickUp":
			AxePickUp();
			break;
		case "LongSwordPickUp":
			LongSwordPickUp();
			break;
		case "west":
			west();
			break;
		case "westMines":
			westMines();
			break;
		case "minesLeft":
			minesLeft();
			break;
			case "fightMinesMonster":
			fightMinesMonster();
			break;
		case "minesPlayerAttack":
			minesPlayerAttack();
			break;
		case "minesMonsterAttack":
			minesMonsterAttack();
			break;
		case "fightMinesBoss1":
			fightMinesBoss();
			break;
		case "fightMinesBoss2":
			fightMinesBoss();
			break;
		case "playerAttackBoss":
			playerAttackBoss();
			break;
		case "bossAttack":
			bossAttack();
			break;
		case "minesRight":
			minesRight();
		case "minesForward":
			minesForward();
			break;
		case "gameWin":
			vm.gameWin();
			break;
		}
	}
	
	/*
	 * =====================================================================================================================================================================================
	 *                                                                        === Create the Story ===
	 * =====================================================================================================================================================================================
	 */
	
		public void townGate() {
			if(player.hp <= 0) {
				vm.characterDied();
			}else {
				ui.image = new ImageIcon(".//res//AtTheGate.jpg");
				//ui.image = new ImageIcon(getClass().getClassLoader().getResource("BlackScreen.jpg"));
				ui.imageLabel.setIcon(ui.image);
			ui.mainTextArea.setText("You are at the gate of a town.\nA guard stands in front of the you.\n\nWhat do you do?"); // Set text for the scene at the town gate
		
			ui.choice1.setText("Talk to the Guard"); // Set text for choice1 button
			ui.choice2.setText("Attack the guard"); // Set text for choice2 button
			ui.choice3.setText("Walk Away"); // Set text for choice3 button
			ui.choice4.setText(""); // Set text for choice4 button
		
			game.nextPosition1 = "talkGuard";
			game.nextPosition2 = "attackGuard";
			game.nextPosition3 = "crossRoad";
			game.nextPosition4 = "";
			}
		}
	
	/*
	 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 */
	
		public void talkGuard() {
			if(player.hp <= 0) {
				vm.characterDied();
			}else {
			ui.mainTextArea.setText("Guard\"Hello sir.\"\nGuard: \"I can not let you into this town\"\nYou were refused enterence to the town"); // Set text for the scene at the town gate
		
			ui.choice1.setText(">"); // Set text for choice1 button
			ui.choice2.setText(""); // Set text for choice2 button
			ui.choice3.setText(""); // Set text for choice3 button
			ui.choice4.setText(""); // Set text for choice4 button
		
			game.nextPosition1 = "townGate";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4  = "";
			}
		}
		
		/*
		 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		
		public void attackGuard() {
			int guardAttack = new java.util.Random().nextInt(7);
			player.hp = player.hp - guardAttack; // Change player HP when hit
			if(player.hp <= 0) {
				vm.characterDied();
			}else {
			ui.mainTextArea.setText("Guard: \"What the HELL!? Did you just attack me?\"\n\nYou attack the guard with your knife but he dodges it\n\nThe Guard hits you with his blade and deals "+guardAttack+" damage"); // Set text for the scene at the town gate
			ui.hpNumberLabel.setText("<html><body><b>"+ player.hp + "</b></body></html");
			
			ui.choice1.setText(">"); // Set text for choice1 button
			ui.choice2.setText(""); // Set text for choice2 button
			ui.choice3.setText(""); // Set text for choice3 button
			ui.choice4.setText(""); // Set text for choice4 button
		
			game.nextPosition1 = "townGate";
			game.nextPosition2 = "";
			game.nextPosition3 = "";
			game.nextPosition4 = "";
			}
		}
		
		/*
		 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		
		public void crossRoad() {	
			if(player.hp <= 0) {
				vm.characterDied();
			}else {
			ui.mainTextArea.setText("You Walk away from the gate and find yourself at a \ncrossroad(If you go South you will end up at the gate) \nWhich derection do you go?"); // Set text for the scene at the town gate
	
			ui.choice1.setText("Go North"); // Set text for choice1 button
			ui.choice2.setText("Go East"); // Set text for choice2 button
			ui.choice3.setText("Go South"); // Set text for choice3 button
			ui.choice4.setText("Go West"); // Set text for choice4 button
	
			game.nextPosition1 = "north";
			game.nextPosition2 = "east";
			game.nextPosition3 = "townGate";
			game.nextPosition4 = "west";
		}
		}
		
		/*
		 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		
			public void north() {
				if(player.hp <= 0) {
					vm.characterDied();
				}
				else {
				int hpGain = new java.util.Random().nextInt(6);
				player.hp = player.hp + hpGain;
				ui.mainTextArea.setText("You head north and see a river\n You drink the water  and rest.\n Your hp is healed up by"+ hpGain +" points"); // Set text for the scene at the town gate
				if(player.hp >= player.maxHp) {
					player.hp = player.maxHp;
				}
				ui.hpNumberLabel.setText("<html><body><b>"+ player.hp + "</b></body></html");
				
				ui.choice1.setText("Go Back"); // Set text for choice1 button
				ui.choice2.setText("Venture Forth"); // Set text for choice2 button
				ui.choice3.setText(""); // Set text for choice3 button
				ui.choice4.setText(""); // Set text for choice4 button
	
				game.nextPosition1 = "crossRoad";
				game.nextPosition2 = "";
				game.nextPosition3 = "";
				game.nextPosition4 = "";
				}
			}
		
		/*
		 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		
			public void east() {	
				if(player.hp <= 0) {
					vm.characterDied();
				}else {
				ui.mainTextArea.setText("You enter a dark forest.\n You see there is a path forward\n What do you do"); // Set text for the scene at the town gate
	
				ui.choice1.setText("Go Back"); // Set text for choice1 button
				ui.choice2.setText("Venture Forth"); // Set text for choice2 button
				ui.choice3.setText(""); // Set text for choice3 button
				ui.choice4.setText(""); // Set text for choice4 button
	
				game.nextPosition1 = "crossRoad";
				game.nextPosition2 = "eastForth";
				game.nextPosition3 = "";
				game.nextPosition4 = "";
				}
			}
			
			/*
			 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			 */
			
				public void eastForth() {
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
					ui.mainTextArea.setText("You walk forward and see that you can go off to the left, forward, or back\n Wich direction do you go?"); // Set text for the scene at the town gate
					
					ui.choice1.setText("Left"); // Set text for choice1 button
					ui.choice2.setText("Forward"); // Set text for choice2 button
					ui.choice3.setText("Back"); // Set text for choice3 button
					ui.choice4.setText(""); // Set text for choice4 button
		
					game.nextPosition1 = "eastLeft";
					game.nextPosition2 = "Forest";
					game.nextPosition3 = "east";
					game.nextPosition4 = "";
				}
				}
				
				/*
				 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				 */
				
					public void eastLeft() {
						if(player.hp <= 0) {
							vm.characterDied();
						}else {
						ui.mainTextArea.setText("You take a left and keep walking\nYou walk into a door\n What do you do?"); // Set text for the scene at the town gate
		
						ui.choice1.setText("Enter the door"); // Set text for choice1 button
						ui.choice2.setText("Leave the door"); // Set text for choice2 button
						ui.choice3.setText("Go Back"); // Set text for choice3 button
						ui.choice4.setText(""); // Set text for choice4 button
		
						game.nextPosition1 = "storeRoom";
						game.nextPosition2 = "AxeLog";
						game.nextPosition3 = "eastForth";
						game.nextPosition4 = "";
						}
					}
			
					/*
					 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					 */
				
						public void storeRoom() {
							if(player.hp <= 0) {
								vm.characterDied();
							}else{
							ui.mainTextArea.setText("You open the door and enter a store room.\n A Long Sword is layed on the ground\n Do you pick it?"); // Set text for the scene at the town gate
					
							ui.choice1.setText("Yes"); // Set text for choice1 button
							ui.choice2.setText("No"); // Set text for choice2 button
							ui.choice3.setText(""); // Set text for choice3 button
							ui.choice4.setText(""); // Set text for choice4 button
			
							game.nextPosition1 = "LongSwordPickUp";
							game.nextPosition2 = "eastLeft";
							game.nextPosition3 = "";
							game.nextPosition4 = "";
							}
						}
				
						/*
						 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
						 */
				
						public void LongSwordPickUp() {
							if(player.hp <= 0) {
								vm.characterDied();
							}else{
							ui.mainTextArea.setText("You pick up the long Sword and throw away your " + player.currentWeapon.name); // Set text for the scene at the town gate
							player.currentWeapon = new Weapon_LongSword();
							ui.weaponNameLabel.setText("<html><body><b>"+ player.currentWeapon.name + "</b></body></html");
							player.maxHp = 30; // Change player HP when hit
							player.hp = player.maxHp;
							ui.hpNumberLabel.setText("<html><body><b>"+ player.hp + "</b></body></html");
			
							ui.choice1.setText("Leave The Store Room"); // Set text for choice1 button
							ui.choice2.setText(""); // Set text for choice2 button
							ui.choice3.setText(""); // Set text for choice3 button
							ui.choice4.setText(""); // Set text for choice4 button
			
							game.nextPosition1 = "eastLeft";
							game.nextPosition2 = "";
							game.nextPosition3 = "";
							game.nextPosition4 = "";
							}
				}
				
			/*
			 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			 */
				
						public void AxeLog() {
							if(player.hp <= 0) {
								vm.characterDied();
							}else{
							ui.mainTextArea.setText("You leave the door not knowing what is in there and see an axe lodged in a tree trunk\n\n Do you pick it up?"); // Set text for the scene at the town gate
			
							ui.choice1.setText("Yes"); // Set text for choice1 button
							ui.choice2.setText("No"); // Set text for choice2 button
							ui.choice3.setText(""); // Set text for choice3 button
							ui.choice4.setText(""); // Set text for choice4 button
			
							game.nextPosition1 = "AxePickUp";
							game.nextPosition2 = "eastLeft";
							game.nextPosition3 = "";
							game.nextPosition4 = "";
							}
				}
				
			/*
			 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			 */
					
				public void AxePickUp() {
					if(player.hp <= 0) {
						vm.characterDied();
					}else{
					ui.mainTextArea.setText("You pick up the Axe and feel power surging through your bones/n Mysterious Voice: \"You have gained the Axe of Felling a axe that can take down forest in few minutes\""); // Set text for the scene at the town gate
					player.currentWeapon = new Weapon_AxeOfFelling();
					ui.weaponNameLabel.setText("<html><body><b>"+ player.currentWeapon.name + "</b></body></html");
					player.maxHp = 35 ; // Change player HP when hit
					player.hp = player.maxHp;
					ui.hpNumberLabel.setText("<html><body><b>"+ player.hp + "</b></body></html");
					
					ui.choice1.setText("Walk Backwards"); // Set text for choice1 button
					ui.choice2.setText(""); // Set text for choice2 button
					ui.choice3.setText(""); // Set text for choice3 button
					ui.choice4.setText(""); // Set text for choice4 button
				
					game.nextPosition1 = "eastLeft";
					game.nextPosition2 = "";
					game.nextPosition3 = "";
					game.nextPosition4 = "";
					}
					}
		
		/*
		 * -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
			
			
		
			public void west() {
				if(player.hp <= 0) {
					vm.characterDied();
				}else {
				ui.mainTextArea.setText("You walk towards the west and see a mine opening\n You also see a Mountain/n Where do you go?"); // Set text for the scene at the town gate
	
				ui.choice1.setText("To the Mines"); // Set text for choice1 button
				ui.choice2.setText("To the Mountain"); // Set text for choice2 button
				ui.choice3.setText("Go Back"); // Set text for choice3 button
				ui.choice4.setText(""); // Set text for choice4 button
	
				game.nextPosition1 = "westMines";
				game.nextPosition2 = "westMountains";
				game.nextPosition3 = "crossRoad";
				game.nextPosition4 = "";
				}
			}
			
			/*
			 * --------------------------------------------------------------------------------------------------------------------------------------------------------
			 */
				public void westMines() {
					monster = new Monster_MinesGoblin();
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
					ui.mainTextArea.setText("  ------------------------------------------------------------\n                            In The Mines of Dekanter\n  ------------------------------------------------------------\n You enter the mines and you come upon a split.\nYou can go Left or right."); // Set text for the scene at the town gate
					
					ui.choice1.setText("Go Left"); // Set text for choice1 button
					ui.choice2.setText("Go Right"); // Set text for choice2 button
					ui.choice3.setText("Go Forward"); // Set text for choice3 button
					ui.choice4.setText("Go Back"); // Set text for choice4 button
		
					game.nextPosition1 = "minesLeft";
					game.nextPosition2 = "minesRight";
					game.nextPosition3 = "minesForward";
					game.nextPosition4 = "west";
					}
				}
				
				public void minesRight(){
					monster = new Monster_MinesGoblin();
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
						int monsDecision = new java.util.Random().nextInt(30);
						if(funVal <= 30) {
							if(monsDecision <= 10) {
								ui.mainTextArea.setText("You turn right and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
								
								ui.choice1.setText("Go Left"); // Set text for choice1 button
								ui.choice2.setText("Go Right"); // Set text for choice2 button
								ui.choice3.setText("Go Forward"); // Set text for choice3 button
								ui.choice4.setText("Go Back"); // Set text for choice4 button
					
								game.nextPosition1 = "minesLeft";
								game.nextPosition2 = "minesRight";
								game.nextPosition3 = "minesForward";
								game.nextPosition4 = "westMines";
							} else if(monsDecision >10 && monsDecision <= 20) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You turn right and a dark shape jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} else if(monsDecision >20 && monsDecision <= 30) {
								ui.mainTextArea.setText("You turn right and a you are now in a tunnel");
								
								ui.choice1.setText("Forward"); // Set text for choice1 button
								ui.choice2.setText("Back"); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "minesForward";
								game.nextPosition2 = "westMines";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							}
						} else 	if(funVal > 30 && funVal <= 60) {
							if(monsDecision <= 10) {
								ui.mainTextArea.setText("You turn right and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
								
								ui.choice1.setText("Go Left"); // Set text for choice1 button
								ui.choice2.setText("Go Right"); // Set text for choice2 button
								ui.choice3.setText("Go Forward"); // Set text for choice3 button
								ui.choice4.setText("Go Back"); // Set text for choice4 button
					
								game.nextPosition1 = "minesLeft";
								game.nextPosition2 = "minesRight";
								game.nextPosition3 = "minesForward";
								game.nextPosition4 = "westMines";
							} else if(monsDecision >10 && monsDecision <= 20) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You turn right and a dark shape jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} else if(monsDecision >20 && monsDecision <= 30) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You turn right and a dark figure jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} 
							}else 	if(funVal > 60 && funVal <= 90) {
								if(monsDecision <= 10) {
									ui.mainTextArea.setText("You turn right and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
									
									ui.choice1.setText("Go Left"); // Set text for choice1 button
									ui.choice2.setText("Go Right"); // Set text for choice2 button
									ui.choice3.setText("Go Forward"); // Set text for choice3 button
									ui.choice4.setText("Go Back"); // Set text for choice4 button
						
									game.nextPosition1 = "minesLeft";
									game.nextPosition2 = "minesRight";
									game.nextPosition3 = "minesForward";
									game.nextPosition4 = "westMines";
								} else if(monsDecision >10 && monsDecision <= 20) {
									monster = new Monster_MinesGoblin();
									ui.mainTextArea.setText("You turn right and a dark shape jumps at you");
									
									ui.choice1.setText(">"); // Set text for choice1 button
									ui.choice2.setText(""); // Set text for choice2 button
									ui.choice3.setText(""); // Set text for choice3 button
									ui.choice4.setText(""); // Set text for choice4 button
						
									game.nextPosition1 = "fightMinesMonster";
									game.nextPosition2 = "";
									game.nextPosition3 = "";
									game.nextPosition4 = "";
								} else if(monsDecision >20 && monsDecision <= 30) {
									boss = new Boss_EarthMound();
									ui.mainTextArea.setText("You turn right and enter an broken arena");
									
									ui.choice1.setText(">"); // Set text for choice1 button
									ui.choice2.setText(""); // Set text for choice2 button
									ui.choice3.setText(""); // Set text for choice3 button
									ui.choice4.setText(""); // Set text for choice4 button
						
									game.nextPosition1 = "fightMinesBoss2";
									game.nextPosition2 = "";
									game.nextPosition3 = "";
									game.nextPosition4 = "";
								}
						}
						}
				}
			
				public void minesLeft(){
					monster = new Monster_MinesGoblin();
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
						int monsDecision = new java.util.Random().nextInt(30);
						if(funVal <= 30) {
							if(monsDecision <= 10) {
								ui.mainTextArea.setText("You turn left and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
								
								ui.choice1.setText("Go Left"); // Set text for choice1 button
								ui.choice2.setText("Go Right"); // Set text for choice2 button
								ui.choice3.setText("Go Forward"); // Set text for choice3 button
								ui.choice4.setText("Go Back"); // Set text for choice4 button
					
								game.nextPosition1 = "minesLeft";
								game.nextPosition2 = "minesRight";
								game.nextPosition3 = "minesForward";
								game.nextPosition4 = "westMines";
							} else if(monsDecision > 10 && monsDecision <=20) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You turn left and a dark shape jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} else if(monsDecision > 20 && monsDecision <=30) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You turn left and a dark shape jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							}
						} else 	if(funVal == 1) {
							if(monsDecision <= 10) {
								ui.mainTextArea.setText("You turn left and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
								
								ui.choice1.setText("Go Left"); // Set text for choice1 button
								ui.choice2.setText("Go Right"); // Set text for choice2 button
								ui.choice3.setText("Go Forward"); // Set text for choice3 button
								ui.choice4.setText("Go Back"); // Set text for choice4 button
					
								game.nextPosition1 = "minesLeft";
								game.nextPosition2 = "minesRight";
								game.nextPosition3 = "minesForward";
								game.nextPosition4 = "westMines";
							} else if(monsDecision > 10 && monsDecision <= 20) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You turn left and a dark shape jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} else if(monsDecision > 20 && monsDecision <= 30) {
								ui.mainTextArea.setText("You turn left and enter an arena");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
								boss = new Boss_KingGoblin();
								game.nextPosition1 = "fightMinesBoss1";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} 
							} else if(funVal > 60 && funVal <= 90) {
								if(monsDecision <= 10) {
									ui.mainTextArea.setText("You turn left and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
									
									ui.choice1.setText("Go Left"); // Set text for choice1 button
									ui.choice2.setText("Go Right"); // Set text for choice2 button
									ui.choice3.setText("Go Forward"); // Set text for choice3 button
									ui.choice4.setText("Go Back"); // Set text for choice4 button
						
									game.nextPosition1 = "minesLeft";
									game.nextPosition2 = "minesRight";
									game.nextPosition3 = "minesForward";
									game.nextPosition4 = "westMines";
								} else if(monsDecision > 10 && monsDecision <= 20) {
									monster = new Monster_MinesGoblin();
									ui.mainTextArea.setText("You turn left and a dark shape jumps at you");
									
									ui.choice1.setText(">"); // Set text for choice1 button
									ui.choice2.setText(""); // Set text for choice2 button
									ui.choice3.setText(""); // Set text for choice3 button
									ui.choice4.setText(""); // Set text for choice4 button
						
									game.nextPosition1 = "fightMinesMonster";
									game.nextPosition2 = "";
									game.nextPosition3 = "";
									game.nextPosition4 = "";
								} else if(monsDecision > 20 && monsDecision <= 30) {
									monster = new Monster_MinesGoblin();
									ui.mainTextArea.setText("You turn left and a dark shape jumps at you");
									
									ui.choice1.setText(">"); // Set text for choice1 button
									ui.choice2.setText(""); // Set text for choice2 button
									ui.choice3.setText(""); // Set text for choice3 button
									ui.choice4.setText(""); // Set text for choice4 button
						
									game.nextPosition1 = "fightMinesMonster";
									game.nextPosition2 = "";
									game.nextPosition3 = "";
									game.nextPosition4 = "";
								}
						}
						}
				}
				
				public void minesForward(){
					monster = new Monster_MinesGoblin();
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
						int monsDecision = new java.util.Random().nextInt(30);
						if(funVal <= 30) {
							if(monsDecision <= 10) {
								ui.mainTextArea.setText("You walk Forward and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
								
								ui.choice1.setText("Go Left"); // Set text for choice1 button
								ui.choice2.setText("Go Right"); // Set text for choice2 button
								ui.choice3.setText("Go Forward"); // Set text for choice3 button
								ui.choice4.setText("Go Back"); // Set text for choice4 button
					
								game.nextPosition1 = "minesLeft";
								game.nextPosition2 = "minesRight";
								game.nextPosition3 = "minesForward";
								game.nextPosition4 = "westMines";
							} else if(monsDecision >10 && monsDecision <= 20) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You walk Forward and a dark shape jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} else if(monsDecision >20 && monsDecision <= 30) {
								ui.mainTextArea.setText("You walk Forward and a you are now in a tunnel");
								
								ui.choice1.setText("Forward"); // Set text for choice1 button
								ui.choice2.setText("Back"); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "minesForward";
								game.nextPosition2 = "westMines";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							}
						} else 	if(funVal > 30 && funVal <= 60) {
							if(monsDecision <= 10) {
								ui.mainTextArea.setText("You walk Forward and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
								
								ui.choice1.setText("Go Left"); // Set text for choice1 button
								ui.choice2.setText("Go Right"); // Set text for choice2 button
								ui.choice3.setText("Go Forward"); // Set text for choice3 button
								ui.choice4.setText("Go Back"); // Set text for choice4 button
					
								game.nextPosition1 = "minesLeft";
								game.nextPosition2 = "minesRight";
								game.nextPosition3 = "minesForward";
								game.nextPosition4 = "westMines";
							} else if(monsDecision >10 && monsDecision <= 20) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You walkForward and a dark shape jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} else if(monsDecision >20 && monsDecision <= 30) {
								monster = new Monster_MinesGoblin();
								ui.mainTextArea.setText("You walk Forward and a dark figure jumps at you");
								
								ui.choice1.setText(">"); // Set text for choice1 button
								ui.choice2.setText(""); // Set text for choice2 button
								ui.choice3.setText(""); // Set text for choice3 button
								ui.choice4.setText(""); // Set text for choice4 button
					
								game.nextPosition1 = "fightMinesMonster";
								game.nextPosition2 = "";
								game.nextPosition3 = "";
								game.nextPosition4 = "";
							} 
							}else 	if(funVal > 60 && funVal <= 90) {
								if(monsDecision <= 10) {
									ui.mainTextArea.setText("You walk Forward and thought your self lucky that there were no monsters."); // Set text for the scene at the town gate
									
									ui.choice1.setText("Go Left"); // Set text for choice1 button
									ui.choice2.setText("Go Right"); // Set text for choice2 button
									ui.choice3.setText("Go Forward"); // Set text for choice3 button
									ui.choice4.setText("Go Back"); // Set text for choice4 button
						
									game.nextPosition1 = "minesLeft";
									game.nextPosition2 = "minesRight";
									game.nextPosition3 = "minesForward";
									game.nextPosition4 = "westMines";
								} else if(monsDecision >10 && monsDecision <= 20) {
									monster = new Monster_MinesGoblin();
									ui.mainTextArea.setText("You walk Forward and a dark shape jumps at you");
									
									ui.choice1.setText(">"); // Set text for choice1 button
									ui.choice2.setText(""); // Set text for choice2 button
									ui.choice3.setText(""); // Set text for choice3 button
									ui.choice4.setText(""); // Set text for choice4 button
						
									game.nextPosition1 = "fightMinesMonster";
									game.nextPosition2 = "";
									game.nextPosition3 = "";
									game.nextPosition4 = "";
								} else if(monsDecision >20 && monsDecision <= 30) {
									ui.mainTextArea.setText("You Go Forward and find yourself back where you were");
									
									ui.choice1.setText(">"); // Set text for choice1 button
									ui.choice2.setText(""); // Set text for choice2 button
									ui.choice3.setText(""); // Set text for choice3 button
									ui.choice4.setText(""); // Set text for choice4 button
						
									game.nextPosition1 = "westMines";
									game.nextPosition2 = "";
									game.nextPosition3 = "";
									game.nextPosition4 = "";
								}
						}
						}
				}
				
				public void fightMinesBoss(){
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
					ui.mainTextArea.setText("You Encounter The " + boss.name + ": " + boss.hp); // Set text for the scene at the town gate
					
					ui.choice1.setText("Attack"); // Set text for choice1 button
					ui.choice2.setText(""); // Set text for choice2 button
					ui.choice3.setText(""); // Set text for choice3 button
					ui.choice4.setText(""); // Set text for choice4 button
		
					game.nextPosition1 = "playerAttackBoss";
					game.nextPosition2 = "";
					game.nextPosition3 = "";
					game.nextPosition4 = "";
					}
				}
				
				public void fightMinesMonster() {
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
					ui.mainTextArea.setText("You Encounter a" + monster.name + ": " + monster.hp); // Set text for the scene at the town gate
					
					ui.choice1.setText("Attack"); // Set text for choice1 button
					ui.choice2.setText("Run"); // Set text for choice2 button
					ui.choice3.setText(""); // Set text for choice3 button
					ui.choice4.setText(""); // Set text for choice4 button
		
					game.nextPosition1 = "minesPlayerAttack";
					game.nextPosition2 = "westMines";
					game.nextPosition3 = "";
					game.nextPosition4 = "";
					}

				}
				
				public void minesPlayerAttack() {
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
					int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage)+1;
					ui.mainTextArea.setText("You attacked the " + monster.name + " and dealt " + playerDamage + " damage.");
					
					monster.hp = monster.hp - playerDamage;
					
					ui.choice1.setText(">");
					ui.choice2.setText("");
					ui.choice3.setText("");
					ui.choice4.setText("");
					
					if(monster.hp>0) {
						game.nextPosition1="minesMonsterAttack";
						game.nextPosition2="";
						game.nextPosition3="";
						game.nextPosition4="";
					} else if(monster.hp<1) {
						game.nextPosition1="westMines";
						game.nextPosition2="";
						game.nextPosition3="";
						game.nextPosition4="";
					}
					}
				}
				public void minesMonsterAttack() {
					if(player.hp <= 0) {
						vm.characterDied();
					}else {
					int monsterDamage = new java.util.Random().nextInt(monster.attack);
					player.hp = player.hp - monsterDamage;
					ui.hpNumberLabel.setText("<html><body><b>"+ player.hp + "</b></body></html");
					ui.mainTextArea.setText("The " + monster.name + " hit you and dealt " + monsterDamage + " damage.");
					ui.choice1.setText(">");
					ui.choice2.setText("");
					ui.choice3.setText("");
					ui.choice4.setText("");
					
					if(monster.hp>0) {
						game.nextPosition1="fightMinesMonster";
						game.nextPosition2="";
						game.nextPosition3="";
						game.nextPosition4="";
					} else if(monster.hp<1) {
						game.nextPosition1="westMines";
						game.nextPosition2="";
						game.nextPosition3="";
						game.nextPosition4="";
					}
					}
				}
				
public void playerAttackBoss() {
	if(player.hp <= 0) {
		vm.characterDied();
	}else {
	int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage)+1;
	ui.mainTextArea.setText("You attacked the " + boss.name + " and dealt " + playerDamage + " damage.");
	
	boss.hp = boss.hp - playerDamage;
	
	ui.choice1.setText(">");
	ui.choice2.setText("");
	ui.choice3.setText("");
	ui.choice4.setText("");
	
	if(monster.hp>0) {
		game.nextPosition1="bossAttack";
		game.nextPosition2="";
		game.nextPosition3="";
		game.nextPosition4="";
	} else if(monster.hp<1) {
		game.nextPosition1="gameWin";
		game.nextPosition2="";
		game.nextPosition3="";
		game.nextPosition4="";
	}
	}
}
public void bossAttack() {
	if(player.hp <= 0) {
		vm.characterDied();
	}else {
	int monsterDamage = new java.util.Random().nextInt(boss.attack);
	player.hp = player.hp - monsterDamage;
	ui.hpNumberLabel.setText("<html><body><b>"+ player.hp + "</b></body></html");
	ui.mainTextArea.setText("The " + boss.name + " hit you and dealt " + monsterDamage + " damage.");
	ui.choice1.setText(">");
	ui.choice2.setText("");
	ui.choice3.setText("");
	ui.choice4.setText("");
	
	if(monster.hp>0) {
		game.nextPosition1="fightMinesBoss";
		game.nextPosition2="";
		game.nextPosition3="";
		game.nextPosition4="";
	} else if(monster.hp<1) {
		game.nextPosition1="gameWin";
		game.nextPosition2="";
		game.nextPosition3="";
		game.nextPosition4="";
	}
	}
}


}