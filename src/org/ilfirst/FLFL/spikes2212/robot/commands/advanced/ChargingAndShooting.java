package org.ilfirst.FLFL.spikes2212.robot.commands.advanced;

import org.ilfirst.FLFL.spikes2212.robot.commands.charger.Charge;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.JoystickShoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ChargingAndShooting extends CommandGroup {

	public static final double SHOOTING_TIMEOUT = 2;

	public ChargingAndShooting() {
		addParallel(new Charge());
		addSequential(new JoystickShoot(), SHOOTING_TIMEOUT);
		addSequential(new StopGun());
		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}
}
