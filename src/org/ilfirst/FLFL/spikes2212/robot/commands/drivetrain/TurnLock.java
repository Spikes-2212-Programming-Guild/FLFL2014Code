package org.ilfirst.FLFL.spikes2212.robot.commands.drivetrain;

import org.ilfirst.FLFL.spikes2212.robot.JoystickMap;
import org.ilfirst.FLFL.spikes2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TurnLock extends Command {

	public TurnLock() {
		requires(Robot.drivetrain);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.drivetrain.turn(JoystickMap.driver.getX());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
		end();
	}

}
