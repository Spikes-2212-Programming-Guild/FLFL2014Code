package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain.JoystickArcade;
import org.ilfirst.FLFL.spikes2212.robot.util.Gearbox;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
	private Gearbox left, right;

	public Drivetrain(Gearbox left, Gearbox right) {
		this.left = left;
		this.right = right;
	}

	public void forward(double speed) {
		left.set(-speed);
		right.set(speed);
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
		left.set(leftSpeed);
		right.set(-rightSpeed);
	}

	public void stop() {
		left.stop();
		right.stop();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new JoystickArcade());
		// TODO Auto-generated method stub}
	}
}