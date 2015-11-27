package org.ilfirst.FLFL.spikes2212.robot.commands.gun;

import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.commands.SingleActionCommand;

/**
 *
 */
public class StopGun extends SingleActionCommand {

	public StopGun() {
		requires(Robot.gun);
	}

	@Override
	public void doAction() {
		Robot.gun.stop();
	}
}