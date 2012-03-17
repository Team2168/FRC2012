package frc2168.dashboard;

import edu.wpi.first.wpilibj.networktables.NetworkTableKeyNotDefined;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc2168.RobotMap;
import frc2168.commands.CommandBase;

public class CompetitionDashboard extends CommandBase
{
	
	public CompetitionDashboard()
	{
        //Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(hood);
        SmartDashboard.putData(bridgeArm);
        SmartDashboard.putData(elevatorFlap);
        

		
		//show shooter gains
		SmartDashboard.putDouble("P", RobotMap.shooterP);
		SmartDashboard.putDouble("I", RobotMap.shooterI);
		SmartDashboard.putDouble("D", RobotMap.shooterD);
	
		
	}

	
	protected void initialize()
	{
		// TODO Auto-generated method stub

	}

	
	protected void execute()
	{
		// TODO Auto-generated method stub
		//put encoder data on screen
		SmartDashboard.putDouble("shooterEncoder", hood.shooterWheelController.getEncoderRate());
		SmartDashboard.putDouble("Controller Output", hood.shooterWheelController.getCo());
		SmartDashboard.putBoolean("atSpeed", hood.shooterWheelController.atSpeed());
		SmartDashboard.putBoolean("enable", hood.shooterWheelController.isEnabled());
		SmartDashboard.putDouble("executionTime", hood.shooterWheelController.getExecutionTime());
		SmartDashboard.putDouble("shooterSetPoint", hood.shooterWheelController.getSp());
	
	}

	
	protected boolean isFinished()
	{
		// TODO Auto-generated method stub
		return false;
	}

	
	protected void end()
	{
		// TODO Auto-generated method stub

	}

	
	protected void interrupted()
	{
		// TODO Auto-generated method stub

	}

}
