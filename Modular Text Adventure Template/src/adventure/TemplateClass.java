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
//ALL classes will extend the abstract class Scenario.
public abstract class TemplateClass extends Scenario {

	// public SubScenario1A(Student student, boolean subIsSubScenario) {
	// super(student, subIsSubScenario);
	// }

	public TemplateClass(Player player) {
		super(player);
	}

	@Override
	protected void intro() {
		/*
		 * All text / printouts go here.
		 * 
		 * IE. 
		 * System.out.println("Blah Blah Blah");
		 * System.out.println("Blah Blah Blah"); 
		 * System.out.println("Blah Blah Blah");
		 * System.out.println("Blah Blah Blah");
		 * System.out.println("What do you do now?");
		 * 
		 * also allows for Main.sleep(int); between lines to allow slower
		 * text printing, to allow the user to read the text rather than having it all
		 * print at once.
		 */
	}

	@Override
	public void respond()  {
		/*
		 * The Four lines below initialize the respond method in three steps.
		 * Initialize the scanner kbd Get a string and cast to "response" Ready the
		 * tostring String for Statistics for the user if called.
		 */

		Scanner kbd = UI.getScannerInstance();
		String response = "";

		response = kbd.nextLine();
		Stats statistics = getPlayer().getStatistics();
		
		// The first three lines should always be present by default- Make sure each class has these.
		// These responses print out information held elsewhere that the user has a use for.


		if (response.equalsIgnoreCase("help")) {
			options();
			Main.sleep(3);
			respond();
		} else if (response.equalsIgnoreCase("info")) {
			Help.info();
			Main.sleep(3);
			respond();
		} else if (response.equalsIgnoreCase("Stats")) {
			System.out.println(statistics);
			Main.sleep(3);
			respond();
		} else if (response.equalsIgnoreCase("quit")) {
			statistics.setisDead(true);
			//Sets the index to a default of zero. The game will end after this. 
			setIndex(0);
		}

		/*
		 * In the block below is a sample of what the rest of this method should look like.
		 * It can get a bit long and messy depending on how many responses and subclasses you want to be possible.
		 * 
		 * else if (argument here (Typically using .equalsIgnoreCase, startsWith, endsWith, etc) {
		 * System.out.println("Blah Blah Blah");
		 * System.out.println("Blah Blah Blah");
		 * System.out.println("Blah Blah Blah");
		 * Any Student operators go here I.E.:
		 * statistics.setSocial(statistics.getSocial()-1); to decrease the social stat by one. 
		 * 
		 * Then, if your class has subscenarios, 
		 *		 * 
		 * 
		 * Then call either setIndex(int); to set the location you want this to refer to in the array of subScenarios
		 * or respond(); to set the Scenario to take a second input, ignoring the first.
		 * 
		 * You can repeat this as many times as is neccesary
		 */
		
		
		// be sure to end this segment with the following.
		//the printed text isn't of particular importance, but it should say something to this effect. 
		 else {
				System.out.println("I don't think that's quite it.... ");
				System.out.println("Try again.");
				respond();
	}
	}

	@Override
	public boolean hasNextSubscenario() {
		populateScenarioArray(player, 2);	
		//-> If you intend to have subScenarios, Initialize the next array of classes that can be called from here.
		//If you have SubScenarios you must include the first line. 
		//If not, Return false. 
		return true;
		//If your class has subclasses, return true. If not, Return false. 
	}

	@Override
	public Scenario getNextSubscenario() {
		return subscenarios[index];
		//Called by the arbitrator- takes the Index Specified in respond(); and selects the subScenario it corresponds to in the array
	}

	@Override
	public void options() {
		System.out.println("Options:");
		System.out.println("action1");
		System.out.println("action2");
		System.out.println("action3");
		//These are contained within the class so that they can be created individually and contained within that class. 
		//Not Necessary, but nice to have. List options the User can use if they get stuck. (You don't need to list them all, or list any.)
	}

	@Override
	public String toString() {
		return "TemplateClass";
		//Return class name to easily identify classes when troubleshooting. 
	}
	
	public void populateSubScenarioArray(Player player, int subScenarioCount) {
		subscenarios = new Scenario[subScenarioCount]; //Creates the array of SubScenarios
		this.player = player; //Sets the student resulting from the end of the current Scenario as the student to be implemented in the next.
		
		//subscenarios[0] = new $ClassNameHere1(student);	
		//subscenarios[1] = new $ClassNameHere2(student);
		
		//Repeat this format for as many classes as is neccesary- allows independent naming of subclasses.
		//Note, it IS possible to call whatever class you want - you can return to a specific class if you want. 
		
		
	}
}
