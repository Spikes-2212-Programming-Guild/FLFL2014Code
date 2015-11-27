package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Camera extends Subsystem {

	private String name;

	public Camera(String name) {
		this.name = name;
	}

	public static double getValue() {
		return 0;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}

	@Override
	public String getName() {
		return name;
	}
}
