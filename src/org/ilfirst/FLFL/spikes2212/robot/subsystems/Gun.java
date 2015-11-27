package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Commands;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
*
*/
public class Gun extends Subsystem {
	private TalonSRX t1, t2;

	public Gun(TalonSRX t1, TalonSRX t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	public Gun() {
	}

	public Gun(int t1port, int t2port) {
		this(new TalonSRX(t1port), new TalonSRX(t2port));
	}

	public void shoot(double speed) {
		t1.set(speed);
		t2.set(-speed);
	}

	public void stop() {
		t1.set(0);
		t2.set(0);
	}

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	@Override
	public void initDefaultCommand() { // Set the default command for a
		setDefaultCommand(Commands.ShootingCommands.stopGun);// subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
