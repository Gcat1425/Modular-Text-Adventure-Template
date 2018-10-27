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

public class Stats {
	private boolean dead;
	//Initiate variables as class variables. 
	private double Health, MaxHealth, luck, social, sleep;

	public Stats() {
		//Player Stats constructor- default Player stats go here. You can change these variables and values to suit your needs. 
		Health = 100;
		MaxHealth = 100;
		luck = 2;
		social = 5;
		sleep = 5;
		dead = false;
	}

	public boolean isDead() {
		return dead;
	}

	public void setisDead(boolean alive) {
		this.dead = alive;
	}

	public double getMaxHealth() {
		return MaxHealth;
	}

	public void setMaxHealth(double maxHealth) {
		MaxHealth = maxHealth;
	}


	public double getLuck() {
		return luck;
	}

	public void setLuck(double luck) {
		this.luck = luck;
	}

	public double getSocial() {
		return social;
	}

	public void setSocial(double social) {
		this.social = social;
	}

	public double getSleep() {
		return sleep;
	}

	public void setSleep(double sleep) {
		this.sleep = sleep;
	}

	@Override
	public String toString() {
		
		return "Health = " + Health + "\nMax Health = " + MaxHealth + " \nLuck = " + luck + " \nSocial = " + social + " \nSleep = " + sleep;

	}

}
