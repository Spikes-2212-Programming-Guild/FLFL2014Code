package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Constants;
import org.ilfirst.FLFL.spikes2212.robot.commands.Shoot;
import org.ilfirst.FLFL.spikes2212.robot.util.Util;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class VisionShooting extends Command {

	public VisionShooting() {
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
		new Shoot(Util.getShootingSpeed(Camera.getValue(), Constants.SHOOTING_SYSTEM_ANGLE,
				Constants.SHOOTING_TARGET_HEIGHT - Constants.SHOOTING_SYSTEM_HEIGHT));
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
}
