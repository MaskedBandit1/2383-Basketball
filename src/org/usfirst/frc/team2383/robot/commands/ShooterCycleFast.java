package org.usfirst.frc.team2383.robot.commands;

import org.usfirst.frc.team2383.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterCycleFast extends Command {

    public ShooterCycleFast() {
    	super("ShooterCycleFast");
        requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Shooter is cycling fast!");
    	
    	Robot.shooter.ShooterForward();
    	Timer.delay(3);
    	Robot.feeder.feederForward();
    	Timer.delay(0.6);
    	Robot.feeder.feederStop();
    	Robot.shooter.ShooterStop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.ShooterForward();
    	Timer.delay(2);
    	Robot.feeder.feederForward();
    	Timer.delay(0.4);
    	Robot.feeder.feederStop();
    	Robot.shooter.ShooterStop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.ShooterStop();
    	Robot.feeder.feederStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
