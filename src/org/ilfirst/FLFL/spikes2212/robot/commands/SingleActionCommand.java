package org.ilfirst.FLFL.spikes2212.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public abstract class SingleActionCommand extends Command {

	@Override
	protected void initialize() {
		oigevald();
	}

	protected abstract void oigevald();

	@Override
	protected void execute() {

	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {

	}

	@Override
	protected void interrupted() {

	}

}
