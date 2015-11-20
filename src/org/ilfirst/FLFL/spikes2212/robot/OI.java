package org.ilfirst.FLFL.spikes2212.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /* GEVALD */ {
	public static JoystickButton charge = new JoystickButton(JoystickMap.navigatorStick, 3);
	public static JoystickButton forwardOrTurn = new JoystickButton(JoystickMap.driverright, 1);
	public static JoystickButton twoSides = new JoystickButton(JoystickMap.driverleft, 1);
	public static JoystickButton shootTrigger = new JoystickButton(JoystickMap.navigatorStick, 1);
	public static JoystickButton closeArms = new JoystickButton(JoystickMap.navigatorStick, 5);
	public static JoystickButton openArms = new JoystickButton(JoystickMap.navigatorStick, 6);

	public OI() {
		charge.whileHeld(Commands.charge);
		forwardOrTurn.whileHeld(Commands.joystickStraightOrTurn);
		twoSides.whileHeld(Commands.doubleJoystickDriving);// whileheld or //
															// whenpressed?
		shootTrigger.whenPressed(Commands.joystickShoot);
		closeArms.whenPressed(Commands.closeArms);
		openArms.whenPressed(Commands.openArms);
	}
}