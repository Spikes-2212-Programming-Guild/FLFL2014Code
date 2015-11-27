package org.ilfirst.FLFL.spikes2212.robot.commands;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

/**
 *
 */
public class StopArms extends SingleActionCommand {

	public StopArms() {
		requires(Robot.arms);
	}

	@Override
	protected void doAction() {
		Robot.arms.stop();
	}
}
