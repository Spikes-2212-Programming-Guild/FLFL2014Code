package org.ilfirst.FLFL.spikes2212.robot.util;

public class Util {

	public static double getShootingSpeed(double distance, double angle,
			double height) {
		double gravity = 9.8;
		double time = Math.sqrt((2 / gravity)
				* (distance * Math.tan(angle) - height));
		return distance / (time * Math.cos(angle));
	}

}
