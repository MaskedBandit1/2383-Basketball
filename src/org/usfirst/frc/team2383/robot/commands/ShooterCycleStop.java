package org.usfirst.frc.team2383.robot.commands;

import org.usfirst.frc.team2383.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterCycleStop extends Command {

    public ShooterCycleStop() {
    	super("ShooterCycleStop");
        requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Shooter is stopping cycle!");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.ShooterStop();
    	Robot.feeder.feederStop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.feeder.feederStop();
    	System.out.println("FEEDER IS STOPPED BROOOOOOOOOOOO");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
