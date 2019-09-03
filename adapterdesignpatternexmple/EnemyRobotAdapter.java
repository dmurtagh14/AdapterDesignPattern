package com.adapterdesignpatternexmple;

public class EnemyRobotAdapter implements EnemyAttacker{
	
	//use composition to create EnemyRobot object
	
	EnemyRobot theRobot; //create CONSTRUCTOR FOR ROBOT ADAPTER
	//TO INITIALIZE it
	
	//Pass in EnemyRobot 
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		theRobot = newRobot;
	}

	@Override
	public void fireWeapon() {
		theRobot.smashThings();
		
	}

	@Override
	public void driveForward() {
		
		theRobot.walkForward();
		
	}

	@Override
	public void assignDriver(String driverName) {
		
		theRobot.reactToHuman(driverName);
		
	}

}
