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

public class SubScenario1A extends Scenario {
//	public SubScenario1A(Student student, boolean subIsSubScenario) {
//	super(student, subIsSubScenario);
//}

	public SubScenario1A(Player player) {
		super(player);
	}

		@Override
	protected void intro()  {
			System.out.println("");
			System.out.println("You're in Scenario 1A!");
			
		}

		@Override
	public void respond()  {
		Scanner kbd = UI.getScannerInstance();
		String response = "";
		
		response = kbd.nextLine();
		Stats statistics = getPlayer().getStatistics();

	
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
	}

}
	

		@Override
	public boolean hasNextSubscenario() {
			return false;
		}

	@Override
	public Scenario getNextSubscenario() {
	return subscenarios[index];
}

	@Override
	public void options() {
		System.out.println("");

		System.out.println("");
}
	@Override
	public String toString() {
		//Who am I? Mostly for debugging purposes. 
		return "SubScenario1A";
	}
	
	public void populateScenarioArray(Player player, int subScenarioCount) {
		//No subScenarios, so this method is empty. 
	}
}

