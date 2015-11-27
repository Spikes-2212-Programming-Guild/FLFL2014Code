package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.commands.advanced.CloseAndGrab;
import org.ilfirst.FLFL.spikes2212.robot.commands.arms.CloseArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.arms.OpenArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.arms.StopArms;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.Charge;
import org.ilfirst.FLFL.spikes2212.robot.commands.charger.StopCharger;
import org.ilfirst.FLFL.spikes2212.robot.commands.driving.DoubleJoystickDriving;
import org.ilfirst.FLFL.spikes2212.robot.commands.driving.JoystickArcade;
import org.ilfirst.FLFL.spikes2212.robot.commands.driving.JoystickStraightOrTurn;
import org.ilfirst.FLFL.spikes2212.robot.commands.driving.StopDrivetrain;
import org.ilfirst.FLFL.spikes2212.robot.commands.grabber.Grab;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.JoystickShoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.Shoot;
import org.ilfirst.FLFL.spikes2212.robot.commands.gun.StopGun;
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
			shoot = new Shoot(Constants.SHOOTING_SPEED);
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
		public static Grab grab;
		public static CloseArms closeArms;
		public static OpenArms openArms;
		public static StopArms stopArms;
		public static CloseAndGrab closeAndGrab;

		public ArmsCommands() {
			grab = new Grab();
			closeArms = new CloseArms();
			openArms = new OpenArms();
			closeAndGrab = new CloseAndGrab();
			stopArms = new StopArms();

		}
	}
}
