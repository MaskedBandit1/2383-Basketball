package org.usfirst.frc.team2383.robot.subsystems;

import org.usfirst.frc.team2383.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *	Drivetrain Subsystem
 */
public class Drivetrain extends Subsystem {
    
    VictorSP leftFront, leftBack, rightFront, rightBack;
    RobotDrive drive;
    
    public Drivetrain(){
    	this.leftFront = new VictorSP(RobotMap.leftFrontMotor);
    	this.leftBack = new VictorSP(RobotMap.leftBackMotor);
    	this.rightFront = new VictorSP(RobotMap.rightFrontMotor);
    	this.rightBack = new VictorSP(RobotMap.rightBackMotor);
    	
    	this.drive = new RobotDrive(leftFront, leftBack, rightFront, rightBack);
    	this.drive.setMaxOutput(0.7);
    	
    }
    
    public void tankDrive(double left, double right){
    	drive.tankDrive(left, right);
    }
    
    public void cheesyDrive(double leftY,double rightX){
    	drive.arcadeDrive(leftY, rightX, false);
    }
    public void initDefaultCommand() {
        drive.tankDrive(0, 0);
    }
}

