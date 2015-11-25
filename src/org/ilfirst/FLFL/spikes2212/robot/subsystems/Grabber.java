package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */

// FIXME This should be split into two separate subsystems
public class Grabber extends Subsystem {
    private Victor rearLeft, rearRight,frontLeft,frontRight;
    public Grabber(Victor rearLeft , Victor rearRight, Victor frontLeft, Victor frontRight){
    	this.frontLeft=frontLeft;
    	this.frontLeft=frontRight;
    	this.rearLeft=rearLeft;
    	this.rearRight=rearRight;
    }
    public void grab(double speed){
    	rearLeft.set(speed);
    	rearRight.set(speed);
    	
    }
    public void spin(double speed){
    	frontLeft.set(speed);
    	frontLeft.set(speed);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

