package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Constants;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Gun extends Subsystem {
	private CANTalon left, right;
	private AnalogInput encoderLeft, encoderRight;

	public Gun(CANTalon left, CANTalon right, int encoderLeftPort,
			int encoderRightPort) {
		this.left = left;
		this.right = right;
		this.encoderLeft = new AnalogInput(encoderLeftPort);
		this.encoderRight = new AnalogInput(encoderRightPort);
		this.left.changeControlMode(CANTalon.ControlMode.Voltage);
		this.right.changeControlMode(CANTalon.ControlMode.Voltage);

	}

	public Gun(int leftMotorID, int rightMotorID, int encoderLeftPort,
			int encoderRightPort) {
		this(new CANTalon(leftMotorID), new CANTalon(rightMotorID),
				encoderLeftPort, encoderRightPort);
	}

	public void shoot(double leftVoltage, double rightVoltage) {
		left.set(leftVoltage);
		right.set(-rightVoltage);
	}

	public int getLeftRows() {
		int counter = 0;
		if (encoderLeft./*function(i don't no which)*/ == Constants.MAGNETIC_CONSTANS) {
			counter++;
		}
		return counter;
	}

	public int getRightRows() {
		int counter = 0;
		if (encoderRight./*function(i don't no which)*/ == Constants.MAGNETIC_CONSTANS) {
			counter++;
		}
		return counter;
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
