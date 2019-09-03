package com.adapterdesignpatternexmple;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{

	Random generator = new Random();
	
	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		
		int attackDamage = generator.nextInt(10) + 1; //gives random value between 1-10
		System.out.println("Enemy Tank does "+ attackDamage + " damage");
	}

	@Override
	public void driveForward() {
		// TODO Auto-generated method stub
		
		int movemnet = generator.nextInt(5)+1;
		
		System.out.println("Enenmy Tank moves " + movemnet + " spaces");
		
	}

	@Override
	public void assignDriver(String driverName) {
		// TODO Auto-generated method stub
		
		System.out.println(driverName + " is driving the tank");
	}

}
