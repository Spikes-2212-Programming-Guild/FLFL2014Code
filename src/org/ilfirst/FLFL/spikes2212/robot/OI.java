package org.ilfirst.FLFL.spikes2212.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /* GEVALD */{
	public static JoystickButton shoot = new JoystickButton(
			JoystickMap.navigatorStick, 2);
	public static JoystickButton reload = new JoystickButton(
			JoystickMap.navigatorStick, 3);
	public static JoystickButton loaded = new JoystickButton(
			JoystickMap.navigatorStick, 4);
	public static JoystickButton forwardorturn = new JoystickButton(
			JoystickMap.driverright, 1);
	public static JoystickButton twosides = new JoystickButton(
			JoystickMap.driverleft, 1);

	// // CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	// // TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	public OI() {
		shoot.whenPressed(Commands.shoot);
		reload.whileHeld(Commands.reload);
		forwardorturn.whileHeld(Commands.joystickturnandstraight);
		twosides.whileHeld(Commands.doublejoystickdrive);
	}
}