package org.ilfirst.FLFL.spikes2212.robot;

public class Constants {
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

	// MAX_LEFT and MAX_RIGHT belong to the implementation which includes
	// finding out the motors' real max speed manually.
	public static final double MAX_LEFT_VOLTAGE = 12;
	public static final double MAX_RIGHT_VOLTAGE = 12;
	// MAX_VOLTAGE belongs to the implementation which includes finding the
	// motors' real max speed during runtime.
	public static final double MAX_VOLTAGE = 12;

	public static final double LEFT_VOLTAGE_PER_VELOCITY = 0.3;
	public static final double RIGHT_VOLTAGE_PER_VELOCITY = 0.3;

	public static final double SHOOT_HIGH_VOLTAGE = 12;
	public static final double SHOOT_DYNAMIC_VOLTAGE = 3;
}
