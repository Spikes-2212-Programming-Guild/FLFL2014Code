package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Constants;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

import edu.wpi.first.wpilibj.AnalogTrigger;
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
		this.left.changeControlMode(CANTalon.ControlMode.Voltage);
		this.right.changeControlMode(CANTalon.ControlMode.Voltage);
		this.leftCounter = leftCounter;
		this.rightCounter = rightCounter;
	}

	public Gun(int leftMotorID, int rightMotorID, int leftCounterPort, int rightCounterPort) {
		this.left = new CANTalon(leftMotorID);
		this.right = new CANTalon(rightMotorID);
		this.left.changeControlMode(CANTalon.ControlMode.Voltage);
		this.right.changeControlMode(CANTalon.ControlMode.Voltage);
		AnalogTrigger leftTrigger = new AnalogTrigger(leftCounterPort);
		leftTrigger.setLimitsVoltage(Constants.TRIGGER_LOWER_VOLTAGE, Constants.TRIGGER_LOWER_VOLTAGE);
		AnalogTrigger rightTrigger = new AnalogTrigger(rightCounterPort);
		this.leftCounter = new Counter(leftTrigger);
		this.rightCounter = new Counter(rightTrigger);
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
