package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class autonomusshooting extends Command {

	public autonomusshooting() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}

	private double shootingspeed(double distance, double angle, double height) {
		double gravity = 9.8;
		double time = Math.sqrt((2 / gravity)
				* (distance * Math.tan(angle) - height));
		return distance / (time * Math.cos(angle));
	}
}
