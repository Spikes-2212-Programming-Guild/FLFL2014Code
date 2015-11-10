package org.ilfirst.FLFL.spikes2212.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final double SHOOT_SPEED = 1;
	public static final int RIGHTDRIVERPORT = 1;
	public static final int LEFTDRIVERPORT = 1;
	public static final int NAVIGATORPORT = 1;
	public static final int GEARBOXLEFTFRONTPORT=1;
	public static final int GEARBOXLEFTREARPORT=1;
	public static final int GEARBOXRIGHTFRONTPORT=1;
	public static final int GEARBOXRIGHTREARPORT=1;
	public static final int GUNRIGHTPORT=1;
	public static final int GUNLEFTPORT=1;
	public static final int TIMINGRIGHTPORT=1;
	public static final int TIMINGLEFTPORT=1;
	public static final int SENSORFRONTPORT=1;
	
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
