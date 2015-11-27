package org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain;

import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.commands.SingleActionCommand;

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