package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Robot;
import org.ilfirst.FLFL.spikes2212.robot.commands.Straight;
import org.ilfirst.FLFL.spikes2212.robot.commands.Tank;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem{
	
	private Gearbox left, right;
	private DigitalInput sensor1; 
	public Drivetrain(Gearbox left, Gearbox right, DigitalInput sensor1) {
		this.left = left;
		this.right = right;
		this.sensor1=sensor1;
	}
	public void straight(double speed) {
		if(!sensor1.get()){
			left.set(speed);
			right.set(-speed);
		}
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
