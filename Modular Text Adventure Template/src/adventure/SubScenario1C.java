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

public class SubScenario1C extends Scenario {
/*
		public SubScenario1C(Student student, boolean subIsSubScenario) {
			super(student, subIsSubScenario);
		}
*/
		public SubScenario1C(Player player) {
			super(player);
		}

		@Override
		protected void intro()  {
			System.out.println("");
			System.out.println("THIS CLASS IS A TEST DUMMY. IF THIS SHOWS, SWITCHING WORKED.");
			System.out.println("Game will exit in 10 seconds...");
			Main.sleep(10);
			System.exit(0);
		}

		@Override
		public void respond()  {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean hasNextSubscenario() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Scenario getNextSubscenario() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void options() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void populateScenarioArray(Player player, int subScenarioCount) {
			// TODO Auto-generated method stub
			
		}

}
