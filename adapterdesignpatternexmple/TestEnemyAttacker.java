package com.adapterdesignpatternexmple;

public class TestEnemyAttacker {
	
	public static void main(String[] args) {
		EnemyTank tank = new EnemyTank();
		
		EnemyRobot robot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
		
		//calling robot methods on its own
		
		System.out.println("The robot");
		
		robot.reactToHuman("paul");
		
		robot.walkForward();
		
		robot.smashThings();
		
		//calling tank methods on its own
		
		System.out.println("The Enemy tank");
		
		tank.assignDriver("Frank");
		
		tank.driveForward();
		tank.fireWeapon();
		
		//calling adapter design pattern
		
		//this is the adapter using the same methods from enemy 
		//but the methods called are actually from enemyrobot methods
		System.out.println("The Robot adapter");
		
		robotAdapter.assignDriver("Dan");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
