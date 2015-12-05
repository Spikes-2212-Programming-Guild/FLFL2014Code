package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Gun extends Subsystem {

	private CANTalon left, right;
	private Counter leftCounter;
	private Counter rightCounter;

	public Gun(CANTalon left, CANTalon right) {
		this.left = left;
		this.right = right;
		this.left.changeControlMode(CANTalon.ControlMode.Voltage);
		this.right.changeControlMode(CANTalon.ControlMode.Voltage);
	}

	public Gun(int leftMotorID, int rightMotorID) {
		this(new CANTalon(leftMotorID), new CANTalon(rightMotorID));
	}

	// Constructors that include the encoder
	public Gun(CANTalon left, CANTalon right, Counter leftCounter, Counter rightCounter) {
		this.left = left;
		this.right = right;
		this.leftCounter = leftCounter;
		this.rightCounter = rightCounter;
	}

	public Gun(int leftMotorID, int rightMotorID, int leftCounterID, int rightCounterID) {
		this(new CANTalon(leftMotorID), new CANTalon(rightMotorID), new Counter(leftCounterID),
				new Counter(rightCounterID));
	}

	public void shoot(double leftVoltage, double rightVoltage) {
		left.set(leftVoltage);
		right.set(-rightVoltage);
	}

	public int getLeftRounds() {
		return leftCounter.get();
	}

	public int getRightRounds() {
		return rightCounter.get();
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
