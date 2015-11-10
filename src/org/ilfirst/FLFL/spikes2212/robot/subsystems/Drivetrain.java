package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Commands;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	private Gearbox left, right;

	public Drivetrain(Gearbox left, Gearbox right) {
		this.left = left;
		this.right = right;
	}

	public Drivetrain() {
	}

	public void forward(double speed) {
		left.set(speed);
		right.set(-speed);
	}

	public void turn(double speed) {
		left.set(speed);
		right.set(speed);
	}

	public void arcade(double moveValue, double rotateValue) {
		double leftSpeed, rightSpeed;
		if (moveValue > 0.0) {
			if (rotateValue > 0.0) {
				leftSpeed = moveValue - rotateValue;
				rightSpeed = Math.max(moveValue, rotateValue);
			} else {
				leftSpeed = Math.max(moveValue, -rotateValue);
				rightSpeed = moveValue + rotateValue;
			}
		} else {
			if (rotateValue > 0.0) {
				leftSpeed = -Math.max(-moveValue, rotateValue);
				rightSpeed = moveValue + rotateValue;
			} else {
				leftSpeed = moveValue - rotateValue;
				rightSpeed = -Math.max(-moveValue, -rotateValue);
			}
		}
		setTwoSides(leftSpeed, rightSpeed);
	}

	public void setTwoSides(double leftSpeed, double rightSpeed) {
		left.set(-leftSpeed);
		right.set(rightSpeed);
	}

	public void doublejoystickdriving(double leftspeed, double rightspeed) {
		right.set(rightspeed);
		left.set(leftspeed);
	}

	public void stop() {
		right.stop();
		left.stop();
	}

	public double getrightspeed() {
		return right.getvalue();
	}

	public double getleftspeed() {
		return left.getvalue();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(Commands.joystickarcade);
		// TODO Auto-generated method stub}
	}
}