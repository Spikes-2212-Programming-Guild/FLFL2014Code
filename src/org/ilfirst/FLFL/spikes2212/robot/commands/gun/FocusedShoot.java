package org.ilfirst.FLFL.spikes2212.robot.commands.gun;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class FocusedShoot /* don't talk */ extends Command {

	private double prevLeft, prevRight;
	private double left, right;
	private double voltage;

	public FocusedShoot(double voltage) {
		requires(Robot.gun);
		this.voltage = voltage;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		prevLeft = left;
		prevRight = right;
		left = Robot.gun.getLeftRounds();
		right = Robot.gun.getRightRounds();
		double leftVelocity = left - prevLeft;
		double rightVelocity = right - prevRight;
		if (leftVelocity > rightVelocity) {
			Robot.gun.shoot(rightVelocity / leftVelocity * voltage, voltage);
		}
		if (rightVelocity > leftVelocity) {
			Robot.gun.shoot(voltage, leftVelocity / rightVelocity * voltage);
		}
		if (leftVelocity == rightVelocity) {
			Robot.gun.shoot(voltage, voltage);
		}

	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.gun.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
