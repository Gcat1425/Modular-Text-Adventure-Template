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

public class UI {
	// Singleton
	private static Scanner instance;
	
	private UI() {};
	
	public static Scanner getScannerInstance() {
		if (instance == null)
			instance = new Scanner(System.in);
		return instance;
	}
	
	public static void closeUI() {
		if (instance != null) {
			instance.close();
			instance = null;
		}
	}
}
