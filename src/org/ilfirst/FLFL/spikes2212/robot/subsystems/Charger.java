package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Constants;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.StopCharger;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Charger extends Subsystem {
	private VictorSP v1, v2;

	public Charger(VictorSP v1, VictorSP v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public Charger(int v1port, int v2port) {
		this(new VictorSP(v1port), new VictorSP(v2port));
	}

	public void charge() {
		v1.set(Constants.CHARGING_SPEED);
		v2.set(Constants.CHARGING_SPEED);
	}

	public void stop() {
		v1.set(0);
		v2.set(0);
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new StopCharger());
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}