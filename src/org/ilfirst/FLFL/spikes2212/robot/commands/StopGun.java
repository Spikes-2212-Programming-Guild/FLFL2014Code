package org.ilfirst.FLFL.spikes2212.robot.commands;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

/**
 *
 */
public class StopGun extends SingleActionCommand {

	public StopGun() {
		requires(Robot.gun);
	}

	@Override
	public void DoAction() {
		Robot.gun.stop();
	}
}