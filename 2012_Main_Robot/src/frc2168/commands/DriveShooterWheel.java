package frc2168.commands;

public class DriveShooterWheel extends CommandBase {

	public DriveShooterWheel(){
		requires(hood);
	}
	
	protected void initialize(){

	}

	protected void execute(){
		hood.spinMotor(oi.getAuxLeftStick());
	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
