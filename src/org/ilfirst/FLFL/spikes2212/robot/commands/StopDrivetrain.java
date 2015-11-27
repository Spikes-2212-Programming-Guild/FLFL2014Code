package org.ilfirst.FLFL.spikes2212.robot.commands;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

/**
 *
 */
public class StopDrivetrain extends SingleActionCommand {

	public StopDrivetrain() {
		requires(Robot.drivetrain);
	}

	@Override
	public void doAction() {
		Robot.drivetrain.stop();
	}
}