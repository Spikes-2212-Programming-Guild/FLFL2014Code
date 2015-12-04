package org.ilfirst.FLFL.spikes2212.robot.util;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;

public class Gearbox {
	private Talon front, rear;
	Encoder frontEncoder, rearEncoder;

	public Gearbox(Talon front, Talon rear) {
		this.front = front;
		this.rear = rear;
	}

	public Gearbox(int frontPort, int rearPort, int encoderFrontPortA,
			int EncoderFrontPortB, int encoderRearPortA, int encoderRearPortB) {
		this(new Talon(frontPort), new Talon(rearPort));
		this.frontEncoder = new Encoder(encoderFrontPortA, EncoderFrontPortB,
				false);
		this.rearEncoder = new Encoder(encoderRearPortA, encoderRearPortB,
				false);
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