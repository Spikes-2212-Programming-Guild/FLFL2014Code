package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Constants;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.StopCharger;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Charger extends Subsystem {
	private VictorSP left, right;

	public Charger(VictorSP left, VictorSP right) {
		this.left = left;
		this.right = right;
	}

	public Charger(int leftPort, int rightPort) {
		this(new VictorSP(leftPort), new VictorSP(rightPort));
	}

	public void charge() {
		left.set(Constants.CHARGING_SPEED);
		right.set(-Constants.CHARGING_SPEED);
	}

	public void stop() {
		left.set(0);
		right.set(0);
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