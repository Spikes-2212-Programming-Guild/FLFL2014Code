package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.commands.Charge;
import org.ilfirst.FLFL.spikes2212.robot.commands.CloseArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.CloseHands;
import org.ilfirst.FLFL.spikes2212.robot.commands.CloseWheels;
import org.ilfirst.FLFL.spikes2212.robot.commands.DoubleJoystickDriving;
import org.ilfirst.FLFL.spikes2212.robot.commands.JoystickArcade;
import org.ilfirst.FLFL.spikes2212.robot.commands.JoystickShoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.JoystickStraightOrTurn;
import org.ilfirst.FLFL.spikes2212.robot.commands.OpenHands;
import org.ilfirst.FLFL.spikes2212.robot.commands.Shoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopCharger;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopDrivetrain;
import org.ilfirst.FLFL.spikes2212.robot.commands.StopGun;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.VisionShooting;

public class Commands {

	public Commands() {
	}

	public static class DrivingCommands {
		public static JoystickArcade joystickArcade;
		public static JoystickStraightOrTurn joystickStraightOrTurn;
		public static DoubleJoystickDriving doubleJoystickDriving;
		public static StopDrivetrain stopDrivetrain;

		public DrivingCommands() {
			joystickStraightOrTurn = new JoystickStraightOrTurn();
			doubleJoystickDriving = new DoubleJoystickDriving();
			stopDrivetrain = new StopDrivetrain();
			joystickArcade = new JoystickArcade();
		}
	}

	public static class ShootingCommands {
		public static JoystickShoot joystickShoot;
		public static StopGun stopGun;
		public static VisionShooting visionShooting;
		public static Shoot shoot;

		public ShootingCommands() {
			shoot = new Shoot(RobotMap.Constants.SHOOTING_SPEED);
			visionShooting = new VisionShooting();
			joystickShoot = new JoystickShoot();
			stopGun = new StopGun();
		}
	}

	public static class ChargingCommands {
		public static Charge charge;
		public static StopCharger stopCharger;

		public ChargingCommands() {
			stopCharger = new StopCharger();
			charge = new Charge();
		}
	}

	public static class ArmsCommands {
		public static CloseWheels closeWheels;
		public static CloseHands closeHands;
		public static OpenHands openHands;
		public static StopArms stopArms;
		public static CloseArms closeArms;

		public ArmsCommands() {
			closeWheels = new CloseWheels();
			closeHands = new CloseHands();
			openHands = new OpenHands();
			closeArms = new CloseArms();
			stopArms = new StopArms();

		}
	}
}
