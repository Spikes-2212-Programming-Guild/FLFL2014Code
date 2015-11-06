package org.ilfirst.FLFL.spikes2212.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final double SHOOTINGSPEED = 1;
	public static final int RIGHTFRONTPORT = 1;
	public static final int LEFTFRONTPORT = 1;
	public static final int RIGHTREARPORT = 1;
	public static final int LEFTREARPORT = 1;
	public static final int DOUBLESOLENOIDPORT1 = 1;
	public static final int DOUBLESOLENOIDPORT2 = 1;
	public static final int SHOOTINGTALONPORT = 1;
	public static final int RIGHTDRIVERPORT = 2;
	public static final int LEFTDRIVERPORT = 2;
	public static final int NAVIGATORPORT = 2;

	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
