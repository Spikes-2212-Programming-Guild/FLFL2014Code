package org.ilfirst.FLFL.spikes2212.robot.commands.advanced;

import org.ilfirst.FLFL.spikes2212.robot.commands.arms.CloseArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.grabber.Grab;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CloseAndGrab extends CommandGroup {
	public CloseAndGrab() {
		addParallel(new Grab());
		addParallel(new CloseArms());
	}
}
