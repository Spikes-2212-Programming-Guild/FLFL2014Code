package org.ilfirst.FLFL.spikes2212.robot.commands.advanced;

import org.ilfirst.FLFL.spikes2212.robot.commands.charger.StopCharger;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class StopChargerAndGun extends CommandGroup {

	public StopChargerAndGun() {
		addParallel(new StopGun());
		addParallel(new StopCharger());
	}

}
