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

public abstract class Scenario {
	
	protected int index; 
	protected Player player;

	protected Response userResponse;
	
	protected Scenario[] subscenarios;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	
	public Scenario(Player player) {
		//subscenarios = new Scenario[1];
		this.player = player;
		//subscenarios[0] = new Scenario1(student);
	}
	
//	public Scenario(Player player, boolean isSubScenario) {
//		this.player = player;
//		subscenarios = new Scenario[subScenarioCount];
//		for (int i = 0; i < subscenarios.length; i++) {
//			// populate with sub scenario
//			subscenarios[i] = new Scenario1(player);
//		}
//	}
	
	public Player getPlayer() {
		return player;
	}
	public abstract String toString();
	
	protected abstract void intro();

	public abstract void respond();
	
	public abstract boolean hasNextSubscenario();
	
	public abstract Scenario getNextSubscenario();
	
	public abstract void options();
	
	public abstract void populateScenarioArray(Player player, int subScenarioCount);
}
