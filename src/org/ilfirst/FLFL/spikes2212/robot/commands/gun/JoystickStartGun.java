package org.ilfirst.FLFL.spikes2212.robot.commands.gun;

import org.ilfirst.FLFL.spikes2212.robot.Constants;
import org.ilfirst.FLFL.spikes2212.robot.JoystickMap;
import org.ilfirst.FLFL.spikes2212.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class JoystickStartGun extends Command {

	public JoystickStartGun() {
		requires(Robot.gun);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		double y = JoystickMap.navigatorStick.getY();
		Robot.gun.shoot(y * Constants.MAX_LEFT_VOLTAGE, y * Constants.MAX_RIGHT_VOLTAGE);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.gun.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		end();
	}
}
