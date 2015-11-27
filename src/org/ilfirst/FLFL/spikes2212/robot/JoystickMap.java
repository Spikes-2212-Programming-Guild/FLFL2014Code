package org.ilfirst.FLFL.spikes2212.robot;

import edu.wpi.first.wpilibj.Joystick;

public class JoystickMap {
	public static Joystick driverright = new Joystick(
			RobotMap.PWM.RIGHT_DRIVER_PORT);
	public static Joystick driverleft = new Joystick(
			RobotMap.PWM.LEFT_DRIVER_PORT);
	public static Joystick navigatorStick = new Joystick(
			RobotMap.PWM.NAVIGATOR_PORT);
}
