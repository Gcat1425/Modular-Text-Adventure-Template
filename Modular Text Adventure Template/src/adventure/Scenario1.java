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

public class Scenario1 extends Scenario {

	public int index;

	public Scenario1(Player player) {
		super(player);
	}

	// public Scenario1(Student student, boolean subIsSubScenario) {
	// super(student, subIsSubScenario);
	// }

	@Override
	public void intro() {
		//Into goes here
		System.out.println("You're in Scenario 1!");
	}

	@Override
	public void respond() {
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
		} else if (response.equalsIgnoreCase("quit")) {
			statistics.setisDead(true);
			setIndex(0);
		}else if (response.equalsIgnoreCase("switch1")) {
			setIndex(0);
			statistics.setSocial(statistics.getSocial() - 1);
		} else if (response.equalsIgnoreCase("switch2")) {
			setIndex(1);
		} else if (response.equalsIgnoreCase("switch3")) {
			setIndex(2);
		} else {
			//Final catch. Throw user back to the top of the method and try again. 
			System.out.println("");
			System.out.println("I don't think that's quite it.... ");
			System.out.println("Try again.");
			respond();
		}
	}

	@Override
	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public boolean hasNextSubscenario() {
		populateScenarioArray(player, 3);
		return true;
	}

	@Override
	public void options() {
		System.out.println("");
		System.out.println("switch1");
		System.out.println("switch2");
		System.out.println("switch3");
	}

	@Override
	public Scenario getNextSubscenario() {
		return subscenarios[index];
	}

	@Override
	public Player getPlayer() {
		return player;
	}
	@Override
	public String toString() {
		return "Scenario1";
	}
	
	public void populateScenarioArray(Player player, int subScenarioCount) {
		subscenarios = new Scenario[subScenarioCount];
		this.player = player;
		subscenarios[0] = new SubScenario1A(player);
		subscenarios[1] = new SubScenario1B(player);
		subscenarios[2] = new SubScenario1C(player);
	}
}
