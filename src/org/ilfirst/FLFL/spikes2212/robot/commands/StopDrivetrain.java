package org.ilfirst.FLFL.spikes2212.robot.commands;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

/**
 *
 */
public class StopDrivetrain extends SingleActionCommand {

	public StopDrivetrain() {
		requires(Robot.driveTrain);
	}

	@Override
	public void oigevald() {
		Robot.driveTrain.stop();
	}
}