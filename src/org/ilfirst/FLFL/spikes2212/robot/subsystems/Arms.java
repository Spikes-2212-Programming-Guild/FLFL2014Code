package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.commands.arms.StopArms;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arms extends Subsystem {
	private Victor left, right;
	private DigitalInput open, closed;

	public Arms(Victor leftMotor, Victor rightMotor, DigitalInput open,
			DigitalInput closed) {
		this.left = leftMotor;
		this.right = rightMotor;
		this.open = open;
		this.closed = closed;
	}

	public Arms(int leftMotorChannel, int rightMotorChannel,
			int openSwitchChannel, int closedSwitchChannel) {
		this(new Victor(leftMotorChannel), new Victor(rightMotorChannel),
				new DigitalInput(openSwitchChannel), new DigitalInput(
						closedSwitchChannel));
	}

	public void set(double speed) {
		left.set(speed);
		right.set(-speed);
	}

	public void stop() {
		set(0);
	}

	public boolean isOpen() {
		return open.get();
	}

	public boolean isClosed() {
		return closed.get();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new StopArms());

	}

}
