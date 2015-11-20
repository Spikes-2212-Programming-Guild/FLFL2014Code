package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.commands.CloseJoints;
import org.ilfirst.FLFL.spikes2212.robot.commands.Closehands;
import org.ilfirst.FLFL.spikes2212.robot.commands.DoubleJoystickDriving;
import org.ilfirst.FLFL.spikes2212.robot.commands.JoystickArcade;
import org.ilfirst.FLFL.spikes2212.robot.commands.JoystickStraightOrTurn;
import org.ilfirst.FLFL.spikes2212.robot.commands.OpenHands;
import org.ilfirst.FLFL.spikes2212.robot.commands.OpenJoints;
import org.ilfirst.FLFL.spikes2212.robot.commands.Reload;
import org.ilfirst.FLFL.spikes2212.robot.commands.Shoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopCharger;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopDrivetrain;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopGun;

public class Commands {
	public static JoystickArcade joystickarcade;
	public static JoystickStraightOrTurn joystickstraightorturn;
	public static DoubleJoystickDriving doublejoystickdriving;
	public static Reload reload;
	public static Shoot shoot;
	public static StopCharger stopcharger;
	public static StopDrivetrain stopdrivetrain;
	public static StopGun stopgun;
	public static CloseJoints closejoints;
	public static Closehands closehands;
	public static OpenHands openhands;
	public static OpenJoints openjoints;
	public static StopArms stoparms;

	public Commands() {
		joystickarcade = new JoystickArcade();
		joystickstraightorturn = new JoystickStraightOrTurn();
		doublejoystickdriving = new DoubleJoystickDriving();
		reload = new Reload();
		shoot = new Shoot();
		stopcharger = new StopCharger();
		stopdrivetrain = new StopDrivetrain();
		stopgun = new StopGun();
		closehands = new Closehands();
		closejoints = new CloseJoints();
		openhands = new OpenHands();
		openjoints = new OpenJoints();
		stoparms = new StopArms();
	}
}
