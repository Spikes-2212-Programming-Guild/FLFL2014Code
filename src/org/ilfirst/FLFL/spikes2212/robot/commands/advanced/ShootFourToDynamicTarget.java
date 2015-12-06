package org.ilfirst.FLFL.spikes2212.robot.commands.advanced;

import org.ilfirst.FLFL.spikes2212.robot.commands.charger.ChargeALittle;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.ChargeOneBall;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StartGun;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class ShootFourToDynamicTarget extends CommandGroup {

	public static final double START_GUN_TIMEOUT = 2;
	public static final double SHOOTING_SPEED = 0.22;

	public ShootFourToDynamicTarget() {
		addParallel(new ChargeOneBall());
		addParallel(new StartGun(SHOOTING_SPEED));
		addSequential(new WaitCommand(START_GUN_TIMEOUT));
		addSequential(new ChargeALittle());
		for (int i = 0; i < 3; i++) {
			addSequential(new ChargeOneBall());
			addSequential(new ChargeALittle());
		}
		addSequential(new StopGun());
	}
}
