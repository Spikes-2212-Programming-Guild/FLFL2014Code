package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Gun extends Subsystem {
	private TalonSRX left, right;

	public Gun(TalonSRX t1, TalonSRX t2) {
		this.left = t1;
		this.right = t2;
	}

	public Gun(int leftMotorID, int rightMotorID) {
		this(new TalonSRX(leftMotorID), new TalonSRX(rightMotorID));
	}

	public void shoot(double speed) {
		left.set(speed);
		right.set(-speed);
	}

	public void stop() {
		left.set(0);
		right.set(0);
	}

	@Override
	public void initDefaultCommand() {
		setDefaultCommand(new StopGun());
	}
}
