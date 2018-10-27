//    
//	  CopyRight 2018, Matthew Behrens. 
//
//	  This file is part of a Modular Text Adventure Template.
//
//    Modular Text Adventure Template is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    Modular Text Adventure Template is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with Modular Text Adventure Template.  If not, see <https://www.gnu.org/licenses/>.
package adventure;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @author Matthew C. Behrens
 * 
 *         Reproduction, Distribution and otherwise modifying/using this code
 *         without consent from the author is strictly forbidden.
 * 
 *         College: The Game
 * 
 *         Contact me at mcb5126@lockhaven.edu if you have questions or would
 *         like to use/host this game.
 *
 */
public class Main {
	
	public static String Name;

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) {
	
		
		//Print your lore here!
		
		
		
		
		
		// Demonstration of creating a keyboard instance using the UI feature, allowing us to utilize the same instance as we move through classes. 
		Scanner kbd = UI.getScannerInstance();
		
	
		//Get a Name for the player. 
		
		System.out.println("Now, enter your name!");
		System.out.print("... :");
		Name = kbd.nextLine();

		//This is a simple check to see if the player is calling for the info or the help tab.
		//Help returns a sarcastic response, while info calls the method in help.java to print the game info method. 
		if (Name.equalsIgnoreCase("help")) {
			Help.helpMenu();
			sleep(3);
			System.out.println("Now, enter your name!");
			System.out.print("... :");
			Name = kbd.nextLine();
		} else if (Name.equalsIgnoreCase("info")) {
			Help.info();
			sleep(3);
			System.out.println("Now, enter your name!");
			System.out.print("... :");
		}

		//Take the player's name and create a player object with default stats. 
		Player player = new Player(Name);
		System.out.println("Hello, " + player.getName() + "!");

	

		//Begins the game, starting with Scenario1 as the default scenario. 
		Stats statistics = player.getStatistics();
		Scenario current = new Scenario1(player);
		do {
			// Call all subscenarios
			current.intro();
			current.respond();
			if (!current.hasNextSubscenario())
				break;
			while (current.hasNextSubscenario()) {
				current = current.getNextSubscenario();
			}
			
			
		} while (!statistics.isDead());

		System.out.println("Game Over!");
		sleep(4);
		System.out.println("Here are your stats!: ");
		System.out.println(statistics);
		
		sleep(10);
		System.out.println("Thanks for playing!");
		System.out.println("Hopefully, there will be more to come in the future!");
		System.out.println("");
		System.out.println("The game will automatically exit after 10 seconds....");
		sleep(10);
		System.exit(0);
	}
	
	//Method for the sake of cleaner code. allows for a delay between printing, offers the user a chance to read when printing large blocks of text. 
	public static void sleep(int delay) {
		try {
			TimeUnit.SECONDS.sleep(delay);	
			
		} catch (Exception e) {
			System.out.println("Intrrupted!");
		}
	}

}
