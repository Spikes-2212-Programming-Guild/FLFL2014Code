package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.commands.grabber.StopGrabber;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Grabber extends Subsystem {
	private Victor left, right;

	public Grabber(int leftChannel, int rightChannel) {
		this.left = new Victor(leftChannel);
		this.right = new Victor(rightChannel);
	}

	public void grab(double speed) {
		left.set(speed);
		right.set(-speed);
	}

	public void stop() {
		left.set(0);
		right.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new StopGrabber());
	}

}
