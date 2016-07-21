
package org.usfirst.frc.team2383.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team2383.robot.subsystems.Drivetrain;
import org.usfirst.frc.team2383.robot.subsystems.Feeder;
import org.usfirst.frc.team2383.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	
	
	// Subsystems
	public static final Drivetrain drivetrain = new Drivetrain();
	public static final Shooter shooter = new Shooter();
	public static final Feeder feeder = new Feeder();
	public static OI oi = new OI();
	public static final Robot Robot = new Robot();

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    }
	
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){
    	drivetrain.tankDrive(0.0, 0.0);
    	shooter.ShooterStop();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
	
    public void teleopInit() {
		shooter.ShooterStop();
		feeder.feederStop();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        drivetrain.cheesyDrive(oi.getLeftY(), oi.getRightX());
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
