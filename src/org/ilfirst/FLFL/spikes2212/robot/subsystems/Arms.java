
package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arms extends Subsystem {
	private Victor righthandmotor, rightjointmotor, lefthandmotor, leftjointmotor;
	private DigitalInput iscollected;

	public Arms(Victor lefthandmotor, Victor leftjointmotor, Victor rightjointmotor, Victor righthandmotor,
			DigitalInput iscollected) {
		this.lefthandmotor = lefthandmotor;
		this.leftjointmotor = leftjointmotor;
		this.righthandmotor = righthandmotor;
		this.rightjointmotor = rightjointmotor;
		this.iscollected = iscollected;
	}

	public Arms() {
	}

	public Arms(int lefthandport, int leftjointport, int righthandport, int rightjointport, int digitalinputport) {
		righthandmotor = new Victor(righthandport);
		rightjointmotor = new Victor(rightjointport);
		lefthandmotor = new Victor(lefthandport);
		leftjointmotor = new Victor(leftjointport);
		iscollected = new DigitalInput(digitalinputport);
	}

	public void movehands(double speed) {
		righthandmotor.set(speed);
		lefthandmotor.set(-speed);
	}

	public void movejoints(double speed) {
		rightjointmotor.set(speed);
		leftjointmotor.set(speed);
	}

	public void stop() {
		righthandmotor.set(0);
		rightjointmotor.set(0);
		lefthandmotor.set(0);
		leftjointmotor.set(0);
	}

	public boolean isclosed() {
		return iscollected.get();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(Commands.stopArms);
		// TODO Auto-generated method stub

	}

}
