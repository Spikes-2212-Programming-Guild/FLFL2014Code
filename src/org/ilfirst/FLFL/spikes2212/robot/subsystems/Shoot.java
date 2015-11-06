package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shoot extends Subsystem {
	private CANTalon shootRight, shootLeft;

	public Shoot(CANTalon shootRight, CANTalon shootLeft) {
		this.shootRight = shootRight;
		this.shootLeft = shootLeft;
	}

	public void shooting(double outputValue) {
		shootRight.set(outputValue);
		shootLeft.set(outputValue);
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());

	}
}
