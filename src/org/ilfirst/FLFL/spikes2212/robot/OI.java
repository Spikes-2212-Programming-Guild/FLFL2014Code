package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.commands.JoystickTurnOrStraight;
import org.ilfirst.FLFL.spikes2212.robot.commands.Reload;
import org.ilfirst.FLFL.spikes2212.robot.commands.Shoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.Straight;
import org.ilfirst.FLFL.spikes2212.robot.commands.Tank;
import org.ilfirst.FLFL.spikes2212.robot.commands.Turn;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	JoystickButton trigger = new JoystickButton(Joysticks.rightdriver, 1);
	JoystickButton shoot = new JoystickButton(Joysticks.navigatorstick, 0);
	JoystickButton reload = new JoystickButton(Joysticks.navigatorstick, 1);
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
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

	public OI(){
		shoot.whenPressed(new Shoot());
		trigger.whileHeld(new JoystickTurnOrStraight());
		new Tank();
		reload.whenPressed(new Reload());
	}
}
