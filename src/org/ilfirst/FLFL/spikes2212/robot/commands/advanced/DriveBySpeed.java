package org.ilfirst.FLFL.spikes2212.robot.commands.advanced;

import org.ilfirst.FLFL.spikes2212.robot.Constants;
import org.ilfirst.FLFL.spikes2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveBySpeed extends Command {
	public DriveBySpeed(double timeout) {
		super(timeout);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.drivetrain.setTwoSides(Constants.LEFT_AOTUNUMUS_VELOCITY,
				Constants.RIGHT_AOTUNUMUS_VELOCITY);
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.drivetrain.setTwoSides(0, 0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}
}
