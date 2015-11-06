package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.commands.Straight;
import org.ilfirst.FLFL.spikes2212.robot.commands.Tank;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{
	
	private Gearbox left, right;
	
	public Drivetrain(Gearbox left, Gearbox right) {
		this.left = left;
		this.right = right;
	}
	
	public void straight(double speed) {
		left.set(speed);
		right.set(-speed);
	}
	
	public void turn(double speed) {
		
			left.set(speed);
			right.set(speed);
	}
	
	public void tank(double leftSpeed, double rightSpeed){
			left.set(leftSpeed);
			right.set(-rightSpeed);
		
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new  Tank());
	}
}
