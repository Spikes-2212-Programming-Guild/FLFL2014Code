package org.ilfirst.FLFL.spikes2212.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /* GEVALD */{
	public static JoystickButton reload = new JoystickButton(
			JoystickMap.navigatorStick, 3);
	public static JoystickButton loaded = new JoystickButton(
			JoystickMap.navigatorStick, 4);
	public static JoystickButton forwardorturn = new JoystickButton(
			JoystickMap.driverright, 1);
	public static JoystickButton twosides = new JoystickButton(
			JoystickMap.driverleft, 1);
	public static JoystickButton shoottrigger = new JoystickButton(
			JoystickMap.navigatorStick, 1);

	public OI() {
		reload.whileHeld(Commands.reload);
		forwardorturn.whileHeld(Commands.joystickstraightorturn);
		twosides.whileHeld(Commands.doublejoystickdriving);// whileheld or
															// whenpressed?
		shoottrigger.whenPressed(Commands.shoot);
	}
}