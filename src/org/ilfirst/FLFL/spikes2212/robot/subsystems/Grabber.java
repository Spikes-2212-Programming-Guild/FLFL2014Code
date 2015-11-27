package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;

public class Grabber {
	private Victor left, right;

	public Grabber(int leftChannel, int rightChannel) {
		this.left = new Victor(leftChannel);
		this.right = new Victor(rightChannel);
	}

	public void grab(double speed) {
		left.set(speed);
		right.set(-speed);
	}

}
