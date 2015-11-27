package org.ilfirst.FLFL.spikes2212.robot.commands;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

/**
 *
 */
public class StopCharger extends SingleActionCommand {

	public StopCharger() {
		requires(Robot.charger);
	}

	@Override
	public void doAction() {
		Robot.charger.stop();
	}
}