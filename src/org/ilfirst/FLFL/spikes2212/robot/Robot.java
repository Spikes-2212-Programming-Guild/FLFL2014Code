package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.subsystems.Arms;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Charger;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Drivetrain;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Gun;
import org.ilfirst.FLFL.spikes2212.robot.util.Gearbox;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	public static OI oi;
	public static Drivetrain driveTrain;
	public static Charger charger;
	public static Gun gun;
	public static Arms arms;

	@Override
	public void robotInit() {
		Gearbox right = new Gearbox(RobotMap.RIGHT_FRONT_PORT,
				RobotMap.RIGHT_REAR_PORT);
		Gearbox left = new Gearbox(RobotMap.LEFT_FRONT_PORT,
				RobotMap.LEFT_REAR_PORT);
		driveTrain = new Drivetrain(left, right);
		gun = new Gun(RobotMap.SHOOTING_TALON_PORT_1,
				RobotMap.SHOOTING_TALON_PORT_2);
		charger = new Charger(RobotMap.CHARGING_TALON_PORT_1,
				RobotMap.CHARGING_TALON_PORT_2);
		oi = new OI();
		arms = new Arms(RobotMap.LEFT_ARM_HAND_PORT,
				RobotMap.LEFT_ARM_JOINT_PORT, RobotMap.RIGHT_ARM_HAND_PORT,
				RobotMap.RIGHT_ARM_JOINT_PORT, RobotMap.ARMS_DIGITALINPUT_PORT);
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
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}