package org.ilfirst.FLFL.spikes2212.robot.commands;
import org.ilfirst.FLFL.spikes2212.robot.OI;
import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Drive extends Command {
	
    public Drive() {
        requires(Robot.DRIVETRAIN);// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.DRIVETRAIN.straight(Robot.oi.joystick.getY());
    	Robot.DRIVETRAIN.turn(Robot.oi.joystick.getX());
    	Robot.DRIVETRAIN.tank(Robot.oi.joystick.getY(), Robot.oi.joystick1.getY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
