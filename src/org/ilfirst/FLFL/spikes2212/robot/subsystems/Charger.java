package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Commands;
import org.ilfirst.FLFL.spikes2212.robot.RobotMap;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Charger extends Subsystem {
	private TalonSRX t1, t2;

	public Charger(TalonSRX t1, TalonSRX t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	public Charger() {
	}

	public Charger(int t1port, int t2port) {
		this(new TalonSRX(t1port), new TalonSRX(t2port));
	}

	public void charge() {
		t1.set(RobotMap.CHARGING_SPEED);
		t2.set(RobotMap.CHARGING_SPEED);
	}

	public void stop() {
		t1.set(0);
		t2.set(0);
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(Commands.stopCharger);
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}