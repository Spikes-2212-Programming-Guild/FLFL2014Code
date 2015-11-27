package org.ilfirst.FLFL.spikes2212.robot.commands.arms;

import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.commands.SingleActionCommand;

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
