package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Commands;
import org.ilfirst.FLFL.spikes2212.robot.RobotMap;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Charger extends Subsystem {
	private Victor v1, v2;

	public Charger(Victor v1, Victor v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	public Charger() {
	}

	public Charger(int v1port, int v2port) {
		this(new Victor(v1port), new Victor(v2port));
	}

	public void charge() {
		v1.set(RobotMap.Constants.CHARGING_SPEED);
		v2.set(RobotMap.Constants.CHARGING_SPEED);
	}

	public void stop() {
		v1.set(0);
		v2.set(0);
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	@Override
	public void initDefaultCommand() {
		setDefaultCommand(Commands.ChargingCommands.stopCharger);
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}