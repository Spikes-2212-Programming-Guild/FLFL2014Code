
package org.ilfirst.FLFL.spikes2212.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Timing;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Drivetrain;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Gun;
import org.ilfirst.FLFL.spikes2212.robot.subsystems.Gearbox;

public class Robot extends IterativeRobot {
	public static final Gearbox left_gearbox=new Gearbox(RobotMap.GEARBOXLEFTFRONTPORT,RobotMap.GEARBOXLEFTREARPORT);
	public static final Gearbox right_gearbox=new Gearbox(RobotMap.GEARBOXRIGHTFRONTPORT,RobotMap.GEARBOXRIGHTREARPORT);
	public static final Drivetrain drivetrain = new Drivetrain(left_gearbox,  right_gearbox,new DigitalInput(RobotMap.SENSORFRONTPORT));
	public static final Gun Gun=new Gun(new CANTalon(RobotMap.GUNLEFTPORT) , new CANTalon(RobotMap.GUNRIGHTPORT));
	public static final Timing Timing=new Timing(new TalonSRX(RobotMap.TIMINGRIGHTPORT),new TalonSRX(RobotMap.TIMINGLEFTPORT));
	public static OI oi;
	 

    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
        autonomousCommand = null;
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
    	
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
