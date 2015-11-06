package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.subsystems.Drivetrain;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Gearbox;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Reloadingwithpiston;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Shootingwith1talon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static OI oi;
	public static Drivetrain driveTrain;
	public static Reloadingwithpiston loadingWithPiston;
	public static Shootingwith1talon shootingWith1Talon;

	@Override
	public void robotInit() {
		Gearbox right = new Gearbox(RobotMap.RIGHTFRONTPORT,
				RobotMap.RIGHTREARPORT);
		Gearbox left = new Gearbox(RobotMap.LEFTFRONTPORT,
				RobotMap.LEFTREARPORT);
		driveTrain = new Drivetrain(left, right);
		shootingWith1Talon = new Shootingwith1talon(RobotMap.SHOOTINGTALONPORT);
		loadingWithPiston = new Reloadingwithpiston(
				RobotMap.DOUBLESOLENOIDPORT1, RobotMap.DOUBLESOLENOIDPORT2);
		oi = new OI();
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard
				.putNumber("Right Side Speed", driveTrain.getrightspeed());
		SmartDashboard.putNumber("Left Side Speed", driveTrain.getleftspeed());
		SmartDashboard.putBoolean("Is Piston Out", loadingWithPiston.isOpen);
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}