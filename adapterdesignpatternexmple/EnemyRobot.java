package com.adapterdesignpatternexmple;

import java.util.Random;

public class EnemyRobot {
	
	Random generator = new Random();
	
	//doesnt have fireWeapon method but we want to 
	//adapt the fire weapon into smash things because its appropriate
	//adapt methods into what seems best for fit
	public void smashThings() {
		int attackDamage = generator.nextInt(10)+1;
		
		System.out.println("Enemy Robot causes "+ attackDamage + " damage with its hands");
	}
	
	public void walkForward() {
		int movement = generator.nextInt(5)+1;
		
		System.out.println("Enemy robot walked " + movement + " spaces");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy robot tramps "+ driverName);
	}

}
