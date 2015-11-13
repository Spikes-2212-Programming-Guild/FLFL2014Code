package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;

public class Gearbox {
	private Talon front, rear;

	public Gearbox(Talon front, Talon rear) {
		this.front = front;
		this.rear = rear;
	}

	public Gearbox(int frontPort, int rearPort) {
		this(new Talon(frontPort), new Talon(rearPort));
	}

	public void set(double speed) {
		front.set(speed);
		rear.set(speed);
	}

	public double getvalue() {
		return front.get();
	}

	public void stop() {
		front.set(0);
		rear.set(0);
	}
}