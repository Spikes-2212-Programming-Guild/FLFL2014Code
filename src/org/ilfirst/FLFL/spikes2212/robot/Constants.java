package org.ilfirst.FLFL.spikes2212.robot;

public class Constants {

	/*
	 * Physical
	 */
	public static final double SHOOTING_SYSTEM_ANGLE = Math.toRadians(60); // FIXME
	public static final double SHOOTING_SYSTEM_HEIGHT = 1.2; // meter
	public static final double SHOOTING_TARGET_HEIGHT = 2.25; // meter

	/*
	 * Charger
	 */
	public static final double CHARGING_SPEED = 0.1; // FIXME

	/*
	 * Arms
	 */
	public static final double CLOSE_ARMS_SPEED = 0.1; // FIXME
	public static final double OPEN_ARMS_SPEED = 0.1; // FIXME

	/*
	 * Grabber
	 */
	public static final double GRAB_SPEED = 0.1; // FIXME

	public static final double AUTONOMUS_DRIVING_TIME = 2; // FIXME
	public static final double AUTONOMUS_DRIVING_SPEED = 0.5;

	// MAX_LEFT and MAX_RIGHT belong to the implementation which includes
	// finding out the motors' real max speed manually.
	public static final double MAX_LEFT_VOLTAGE = 12; // FIXME
	public static final double MAX_RIGHT_VOLTAGE = 12; // FIXME
	public static final double SHOOT_HIGH_VOLTAGE = 12; // FIXME
	public static final double SHOOT_DYNAMIC_VOLTAGE = 2; // FIXME
	// MAX_VOLTAGE belongs to the implementation which includes finding the
	// motors' real max speed during runtime.
	public static final double MAX_VOLTAGE = 12; // FIXME

	public static final double LEFT_VOLTAGE_PER_VELOCITY = 0.3; // FIXME
	public static final double RIGHT_VOLTAGE_PER_VELOCITY = 0.3; // FIXME

	public static final double TRIGGER_LOWER_VOLTAGE = 0.2; // FIXME
	public static final double TRIGGER_HIGHER_VOLTAGE = 0.8; // FIXME
}
