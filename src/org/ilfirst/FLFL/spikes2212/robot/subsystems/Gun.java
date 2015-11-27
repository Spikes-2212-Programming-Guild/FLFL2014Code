package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Gun extends Subsystem {
	private CANTalon left, right;

	public Gun(CANTalon left, CANTalon right) {
		this.left = left;
		this.right = right;
		this.left.changeControlMode(CANTalon.ControlMode.Voltage);
		this.right.changeControlMode(CANTalon.ControlMode.Voltage);

	}

	public Gun(int leftMotorID, int rightMotorID) {
		this(new CANTalon(leftMotorID), new CANTalon(rightMotorID));
	}

	public void shoot(double leftVoltage, double rightVoltage) {
		left.set(leftVoltage);
		right.set(-rightVoltage);
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
