package org.ilfirst.FLFL.spikes2212.robot.commands.advanced;

import org.ilfirst.FLFL.spikes2212.robot.Constants;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveAndShoot extends CommandGroup {

	public DriveAndShoot() {
		addParallel(new DriveBySpeedAndTime(Constants.AUTONOMUS_DRIVING_SPEED, Constants.AUTONOMUS_DRIVING_TIME));
		addSequential(new ShootFourToHighTarget());
	}
}
