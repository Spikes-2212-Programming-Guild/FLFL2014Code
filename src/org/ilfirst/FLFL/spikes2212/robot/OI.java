package org.ilfirst.FLFL.spikes2212.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /* GEVALD */{
	public static JoystickButton charge = new JoystickButton(
			JoystickMap.navigatorStick, 4);
	public static JoystickButton forwardOrTurn = new JoystickButton(
			JoystickMap.driverRight, 1);
	public static JoystickButton twoSides = new JoystickButton(
			JoystickMap.driverLeft, 1);
	public static JoystickButton closeArms = new JoystickButton(
			JoystickMap.navigatorStick, 5);
	public static JoystickButton openArms = new JoystickButton(
			JoystickMap.navigatorStick, 6);
	public static JoystickButton shootWithVision = new JoystickButton(
			JoystickMap.navigatorStick, 2);
	public static JoystickButton shootFromSameSpot = new JoystickButton(
			JoystickMap.navigatorStick, 3);
	public static JoystickButton shootWithJoystick = new JoystickButton(
			JoystickMap.navigatorStick, 1);
	public static JoystickButton stopArms = new JoystickButton(
			JoystickMap.navigatorStick, 8);

	public OI() {
		charge.whileHeld(Commands.ChargingCommands.charge);
		forwardOrTurn
				.whileHeld(Commands.DrivingCommands.joystickStraightOrTurn);
		twoSides.whileHeld(Commands.DrivingCommands.doubleJoystickDriving);
		closeArms.whenPressed(Commands.ArmsCommands.closeAndGrab);
		openArms.whenPressed(Commands.ArmsCommands.openArms);
		shootWithVision.whileHeld(Commands.ShootingCommands.visionShooting);
		shootFromSameSpot.whileHeld(Commands.ShootingCommands.shoot);
		shootWithJoystick.whileHeld(Commands.ShootingCommands.joystickShoot);
		stopArms.whenPressed(Commands.ArmsCommands.stopArms);
	}
}