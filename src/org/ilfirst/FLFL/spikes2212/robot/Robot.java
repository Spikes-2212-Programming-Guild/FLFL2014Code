package org.ilfirst.FLFL.spikes2212.robot;

import org.ilfirst.FLFL.spikes2212.robot.RobotMap.CAN;
import org.ilfirst.FLFL.spikes2212.robot.RobotMap.DIO;
import org.ilfirst.FLFL.spikes2212.robot.RobotMap.PWM;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Arms;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Camera;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Charger;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Drivetrain;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Gun;
import org.ilfirst.FLFL.spikes2212.robot.util.Gearbox;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Robot extends IterativeRobot {

	public static OI oi;
	public static Drivetrain drivetrain;
	public static Charger charger;
	public static Gun gun;
	public static Arms arms;
	public static Camera camera;
	public static PowerDistributionPanel pdp;

	@Override
	public void robotInit() {
		Gearbox left = new Gearbox(PWM.LEFT_FRONT, PWM.LEFT_REAR);
		Gearbox right = new Gearbox(PWM.RIGHT_FRONT, PWM.RIGHT_REAR);
		drivetrain = new Drivetrain(left, right);
		gun = new Gun(CAN.SHOOTER_LEFT, CAN.SHOOTER_RIGHT);
		charger = new Charger(PWM.LOADER_LEFT, PWM.LOADER_RIGHT);
		arms = new Arms(PWM.ARM_LEFT, PWM.ARM_RIGHT, DIO.ARMS_CLOSED, DIO.ARMS_OPEN);
		oi = new OI();
		pdp = new PowerDistributionPanel();
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}