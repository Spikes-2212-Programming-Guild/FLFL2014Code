package org.ilfirst.FLFL.spikes2212.robot.commands.gun;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class StartGun extends Command {

	private double leftVoltage;
	private double rightVoltage;

	public StartGun(double voltage) {
		this(voltage, voltage);
	}

	public StartGun(double leftVoltage, double rightVoltage) {
		requires(Robot.gun);
		this.leftVoltage = leftVoltage;
		this.rightVoltage = rightVoltage;
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.gun.shoot(SmartDashboard.getNumber("left"),
				SmartDashboard.getNumber("right"));
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.gun.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
