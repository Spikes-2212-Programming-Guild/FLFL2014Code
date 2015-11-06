package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.subsystems.Drivetrain;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Gearbox;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Reloadingwithpiston;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Shootingwith1talon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static Drivetrain drivetrain;
	public static Reloadingwithpiston loadingwithpiston;
	public static Shootingwith1talon shootingwith1talon;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		Gearbox right = new Gearbox(RobotMap.RIGHTFRONTPORT,
				RobotMap.RIGHTREARPORT);
		Gearbox left = new Gearbox(RobotMap.LEFTFRONTPORT,
				RobotMap.LEFTREARPORT);
		drivetrain = new Drivetrain(left, right);
		shootingwith1talon = new Shootingwith1talon(RobotMap.SHOOTINGTALONPORT);
		loadingwithpiston = new Reloadingwithpiston(
				RobotMap.DOUBLESOLENOIDPORT1, RobotMap.DOUBLESOLENOIDPORT2);
		oi = new OI();
		// instantiate the command used for the autonomous period
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
