package org.ilfirst.FLFL.spikes2212.robot.commands.advanced;

import org.ilfirst.FLFL.spikes2212.robot.commands.charger.ChargeALittle;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.ChargeOneBall;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StartGun;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ShootOneToHighTarget extends CommandGroup {

	public static final double START_GUN_TIMEOUT = 1.5;

	public ShootOneToHighTarget() {
		addParallel(new ChargeOneBall());
		addSequential(new StartGun(1), START_GUN_TIMEOUT);
		addSequential(new ChargeALittle());
	}
}
