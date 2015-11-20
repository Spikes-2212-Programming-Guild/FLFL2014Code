package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.commands.Charge;
import org.ilfirst.FLFL.spikes2212.robot.commands.CloseArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.CloseHands;
import org.ilfirst.FLFL.spikes2212.robot.commands.CloseJoints;
import org.ilfirst.FLFL.spikes2212.robot.commands.DoubleJoystickDriving;
import org.ilfirst.FLFL.spikes2212.robot.commands.JoystickArcade;
import org.ilfirst.FLFL.spikes2212.robot.commands.JoystickStraightOrTurn;
import org.ilfirst.FLFL.spikes2212.robot.commands.OpenArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.OpenHands;
import org.ilfirst.FLFL.spikes2212.robot.commands.OpenJoints;
import org.ilfirst.FLFL.spikes2212.robot.commands.Shoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopCharger;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopDrivetrain;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopGun;

public class Commands {
	public static JoystickArcade joystickArcade;
	public static JoystickStraightOrTurn joystickStraightOrTurn;
	public static DoubleJoystickDriving doubleJoystickDriving;
	public static Charge charge;
	public static Shoot shoot;
	public static StopCharger stopCharger;
	public static StopDrivetrain stopDrivetrain;
	public static StopGun stopGun;
	public static CloseJoints closeJoints;
	public static CloseHands closeHands;
	public static OpenHands openHands;
	public static OpenJoints openJoints;
	public static StopArms stopArms;
	public static CloseArms closeArms;
	public static OpenArms openArms;

	public Commands() {
		joystickArcade = new JoystickArcade();
		joystickStraightOrTurn = new JoystickStraightOrTurn();
		doubleJoystickDriving = new DoubleJoystickDriving();
		charge = new Charge();
		shoot = new Shoot();
		stopCharger = new StopCharger();
		stopDrivetrain = new StopDrivetrain();
		stopGun = new StopGun();
		closeHands = new CloseHands();
		closeJoints = new CloseJoints();
		openHands = new OpenHands();
		openJoints = new OpenJoints();
		stopArms = new StopArms();
		closeArms = new CloseArms();
		openArms = new OpenArms();
	}
}
