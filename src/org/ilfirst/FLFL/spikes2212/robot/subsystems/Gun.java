package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon.ControlMode;

import org.ilfirst.FLFL.spikes2212.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
//CR: use CANTalon and not TalonSRX
public class Gun extends Subsystem {
    private CANTalon t1,t2;
    
    public Gun(CANTalon t1, CANTalon t2){
    	this.t1=t1;
    	this.t2=t2;
    	t1.changeControlMode(ControlMode.Voltage);
    	t2.changeControlMode(ControlMode.Voltage);
    }
    public void shoot(double speed){
    	t1.set(RobotMap.SHOOT_SPEED);
    	t2.set(-RobotMap.SHOOT_SPEED);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

