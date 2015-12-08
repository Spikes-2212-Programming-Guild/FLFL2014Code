package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.commands.advanced.ShootFourToDynamicTarget;
import org.ilfirst.FLFL.spikes2212.robot.commands.advanced.ShootFourToHighTarget;
import org.ilfirst.FLFL.spikes2212.robot.commands.arms.CloseArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.arms.OpenArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.ChargeOneBall;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.Uncharge;
import org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain.StraightLock;
import org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain.TurnLock;
import org.ilfirst.FLFL.spikes2212.robot.commands.grabber.Grab;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /* GEVALD */{
	JoystickButton chargeOne = new JoystickButton(JoystickMap.navigatorStick, 2); // was
																					// 3!!
	JoystickButton shootFourToHighTarget = new JoystickButton(
			JoystickMap.navigatorStick, 4);
	JoystickButton shootFourToDynamicTarget = new JoystickButton(
			JoystickMap.navigatorStick, 5);
	JoystickButton closeArms = new JoystickButton(JoystickMap.navigatorStick, 6);
	JoystickButton openArms = new JoystickButton(JoystickMap.navigatorStick, 7);
	JoystickButton stopChargeAndGun = new JoystickButton(
			JoystickMap.navigatorStick, 10); // was once 9!!
	JoystickButton uncharge = new JoystickButton(JoystickMap.navigatorStick, 11); // was
	JoystickButton grab = new JoystickButton(JoystickMap.navigatorStick, 8);
	JoystickButton turnLock = new JoystickButton(JoystickMap.driver, 11);
	JoystickButton straightLock = new JoystickButton(JoystickMap.driver, 10);

	public OI() {
		chargeOne.whenPressed(new ChargeOneBall());
		shootFourToHighTarget.whenPressed(new ShootFourToHighTarget());
		shootFourToDynamicTarget.whenPressed(new ShootFourToDynamicTarget());
		closeArms.whileHeld(new CloseArms());
		openArms.whileHeld(new OpenArms());
		uncharge.whileHeld(new Uncharge());
		turnLock.whileHeld(new TurnLock());
		straightLock.whileHeld(new StraightLock());
		grab.toggleWhenPressed(new Grab());
	}
}