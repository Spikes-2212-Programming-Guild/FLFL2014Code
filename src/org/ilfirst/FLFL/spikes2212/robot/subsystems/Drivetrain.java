package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.components.Gearbox;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	private static Gearbox right;
	private Gearbox left;

	public Drivetrain(Gearbox right, Gearbox left) {
		this.right = right;
		this.left = left;
	}

	public void forword(double speed) {
		right.set(speed);
		left.set(-speed);
	}

	public void turn(double speed) {
		right.set(speed);
		left.set(speed);
	}

	public void stop() {
		right.set(0);
		left.set(0);
	}
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
