package org.ilfirst.FLFL.spikes2212.robot.commands;

import org.ilfirst.FLFL.spikes2212.robot.Robot;

/**
 *
 */
public class StopArms extends SingleActionCommand {

	public StopArms() {
		requires(Robot.arms);
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
	}

	// Called just before this Command runs the first time
	@Override
	protected void DoAction() {
		Robot.arms.stop();
		// TODO Auto-generated method stub

	}
}
