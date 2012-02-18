package frc2168.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc2168.nPointAveragor;

public class DriveLiftUntilNoBall extends CommandBase {

	boolean ball;
	
	//Balls being sensed -rough estimates- can range from 1.5" to 3" from sensor:
	//			1.5" -->  ~2.9v
	//			3"   -->  ~1.7v
	//no ball	11"  -->  ~0.42v
	private static double ballPresentVoltage = 1.6;	//the voltage threshold at
													// which a ball is considered present
	private static double liftVoltage = -0.25;
	
	public DriveLiftUntilNoBall(){
		requires(elevatorFlap);
		
		//Before doing anything, figure out if a ball is present
		if(elevatorFlap.getBallDetector() > ballPresentVoltage){
			ball = true;
		} else {
			ball = false;
		}
	}
	
	protected void initialize() {
		//SmartDashboard.putData("scheduler", Scheduler.getInstance());
	}

	protected void execute() {
		if(elevatorFlap.getBallDetector() >= ballPresentVoltage){	//if a ball is present
			elevatorFlap.setBallElevatorSpeed(liftVoltage);			//run the lift to get rid of ball
			ball = true;
		} else{												//if a ball isn't present
			elevatorFlap.setBallElevatorSpeed(0);	//drive up
			ball = false;
		}
	}

	protected boolean isFinished() {
		//we're done when there is no ball present
		return !ball;
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}