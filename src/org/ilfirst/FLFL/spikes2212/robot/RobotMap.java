package org.ilfirst.FLFL.spikes2212.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static class PWM {
		public static final int LEFT_FRONT = 0;
		public static final int LEFT_REAR = 1;
		public static final int RIGHT_FRONT = 8;
		public static final int RIGHT_REAR = 9;
		public static final int LOADER_LEFT = 2;
		public static final int LOADER_RIGHT = 3;
		public static final int ARM_LEFT = 4;
		public static final int ARM_RIGHT = 5;
		public static final int GRABBER_LEFT = 6;
		public static final int GRABBER_RIGHT = 7;

	}

	public static class CAN {
		public static final int SHOOTER_LEFT = 1;
		public static final int SHOOTER_RIGHT = 2;
	}

	public static class Joysticks {
		public static final int DRIVER_RIGHT = 0;
		public static final int DRIVER_LEFT = 1;
		public static final int NAVIGATOR = 2;
	}

	public static class Constants {
		public static final double CHARGING_SPEED = 2;
		public static final double CLOSE_HANDS_SPEED = 2;
		public static final double OPEN_HANDS_SPEED = 2;
		public static final double CLOSE_WHEELS_SPEED = 2;
		public static final double MAX_SPEED = 2;
		public static final double SHOOTING_SYSTEM_ANGLE = 2;
		public static final double AUTONOMUS_DRIVING_TIME = 2;
		public static final double SHOOTING_SYSTEM_HEIGHT = 2;
		public static final double SHOOTING_TARGET_HEIGHT = 2.2;
		public static final double SHOOTING_SPEED = 2;
	}

	public static class DIO {
		public static final int ARMS_OPEN = 0;
		public static final int ARMS_CLOSED = 1;
		public static final int BALLS_DETECTOR = 2;
	}

}
