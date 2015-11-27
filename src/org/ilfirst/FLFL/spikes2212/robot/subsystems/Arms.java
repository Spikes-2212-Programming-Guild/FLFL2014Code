package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arms extends Subsystem {
	private Victor rightHandMotor, rightGrabMotor, leftHandMotor,
			leftGrabMotor;
	private DigitalInput closed, opened;

	public Arms(Victor leftHandMotor, Victor leftGrabMotor,
			Victor rightHandMotor, Victor rightGrabMotor, DigitalInput closed,
			DigitalInput opened) {
		this.leftHandMotor = leftHandMotor;
		this.leftGrabMotor = leftGrabMotor;
		this.rightHandMotor = rightHandMotor;
		this.rightGrabMotor = rightGrabMotor;
		this.closed = closed;
		this.opened = opened;
	}

	public Arms() {
	}

	public Arms(int leftHandPort, int leftGrabport, int righthandport,
			int rightGrabport, int diclosedport, int diopenedport) {
		rightHandMotor = new Victor(righthandport);
		rightGrabMotor = new Victor(rightGrabport);
		leftHandMotor = new Victor(leftHandPort);
		leftGrabMotor = new Victor(leftGrabport);
		closed = new DigitalInput(diclosedport);
		opened = new DigitalInput(diopenedport);
	}

	public void movehands(double speed) {
		rightHandMotor.set(speed);
		leftHandMotor.set(speed);
	}

	public void moveWheels(double speed) {
		rightGrabMotor.set(speed);
		leftGrabMotor.set(speed);
	}

	public void stop() {
		rightHandMotor.set(0);
		rightGrabMotor.set(0);
		leftHandMotor.set(0);
		leftGrabMotor.set(0);
	}

	public boolean isClosed() {
		return closed.get();
	}

	public boolean isOpened() {
		return opened.get();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(Commands.ArmsCommands.stopArms);
		// TODO Auto-generated method stub

	}

}
