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
		Gearbox right = new Gearbox(RobotMap.PWM.RIGHT_FRONT_PORT,
				RobotMap.PWM.RIGHT_REAR_PORT);
		Gearbox left = new Gearbox(RobotMap.PWM.LEFT_FRONT_PORT,
				RobotMap.PWM.LEFT_REAR_PORT);
		driveTrain = new Drivetrain(left, right);
		gun = new Gun(RobotMap.PWM.SHOOTING_PORT_1,
				RobotMap.PWM.SHOOTING_PORT_2);
		charger = new Charger(RobotMap.PWM.CHARGING_PORT_1,
				RobotMap.PWM.CHARGING_PORT_2);
		oi = new OI();
		arms = new Arms(RobotMap.PWM.LEFT_ARM_HAND_PORT,
				RobotMap.PWM.LEFT_ARM_JOINT_PORT,
				RobotMap.PWM.RIGHT_ARM_HAND_PORT,
				RobotMap.PWM.RIGHT_ARM_JOINT_PORT,
				RobotMap.ARMS_CLOSE_DIGITALINPUT_PORT,
				RobotMap.ARMS_OPEN_DIGITALINPUT_PORT);
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