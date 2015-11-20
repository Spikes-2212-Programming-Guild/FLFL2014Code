package org.ilfirst.FLFL.spikes2212.robot.commands;

import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Closehands extends Command {

	public Closehands() {
		requires(Robot.arms);
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
		Robot.arms.movehands(RobotMap.CLOSE_HANDS_SPEED);
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
