package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import org.ilfirst.FLFL.spikes2212.robot.Commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arms extends Subsystem {
	private Victor righthandmotor, rightjointmotor, lefthandmotor,
			leftjointmotor;
	private DigitalInput closed, opened;

	public Arms(Victor lefthandmotor, Victor leftjointmotor,
			Victor rightjointmotor, Victor righthandmotor, DigitalInput closed,
			DigitalInput opened) {
		this.lefthandmotor = lefthandmotor;
		this.leftjointmotor = leftjointmotor;
		this.righthandmotor = righthandmotor;
		this.rightjointmotor = rightjointmotor;
		this.closed = closed;
		this.opened = opened;
	}

	public Arms() {
	}

	public Arms(int lefthandport, int leftjointport, int righthandport,
			int rightjointport, int diclosedport, int diopenedport) {
		righthandmotor = new Victor(righthandport);
		rightjointmotor = new Victor(rightjointport);
		lefthandmotor = new Victor(lefthandport);
		leftjointmotor = new Victor(leftjointport);
		closed = new DigitalInput(diclosedport);
		opened = new DigitalInput(diopenedport);
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

	public boolean isClosed() {
		return closed.get();
	}

	public boolean isOpened() {
		return opened.get();
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(Commands.stopArms);
		// TODO Auto-generated method stub

	}

}
