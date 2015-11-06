package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Timing extends Subsystem {
    private TalonSRX t1,t2;
    public Timing(TalonSRX t1,TalonSRX t2){
    	this.t1=t1;
    	this.t2=t2;
    }
    public void charge(double speed){
    	t1.set(speed);
    	t2.set(speed);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

