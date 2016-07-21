package org.usfirst.frc.team2383.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
	
	//Victor SP
    public static int leftFrontMotor = 9;
    public static int leftBackMotor = 8;
    public static int rightFrontMotor = 1;
    public static int rightBackMotor = 0;
    
    public static int feederMotor = 2;
    
    // Talon SRX
    public static int shooterMotor = 0;
    
}
