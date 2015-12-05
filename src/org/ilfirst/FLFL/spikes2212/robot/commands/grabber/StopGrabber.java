package org.ilfirst.FLFL.spikes2212.robot.commands.grabber;

import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.commands.SingleActionCommand;

/**
 *
 */
public class StopGrabber extends SingleActionCommand {

	@Override
	protected void doAction() {
		Robot.grabber.stop();
	}

}
