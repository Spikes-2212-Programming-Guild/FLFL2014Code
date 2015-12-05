package org.ilfirst.FLFL.spikes2212.robot.commands.advanced;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveBySpeedAndTime extends Command {

	private double speed;
	private double time;
	
	public DriveBySpeedAndTime(double speed, double time) {
		requires(Robot.drivetrain);
		this.speed = speed;
		this.time = time;
	}

	@Override
	protected void initialize() {
		setTimeout(time);
	}

	@Override
	protected void execute() {
		Robot.drivetrain.forward(speed);
	}

	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	@Override
	protected void end() {
		Robot.drivetrain.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
