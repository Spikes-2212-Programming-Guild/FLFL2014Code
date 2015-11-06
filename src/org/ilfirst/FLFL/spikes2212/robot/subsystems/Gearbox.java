package org.ilfirst.FLFL.spikes2212.robot.subsystems;

import edu.wpi.first.wpilibj.TalonSRX;

public class Gearbox {
	
	private TalonSRX front, rear;
	
	public Gearbox(TalonSRX front, TalonSRX rear){
		this.front=front;
		this.rear=rear;
	}
	public Gearbox(int frontPort, int rearPort) {
		this(new TalonSRX(frontPort), new TalonSRX(rearPort));
	}
	public void set(double speed) {
		front.set(speed);
		rear.set(speed);
	}

}
