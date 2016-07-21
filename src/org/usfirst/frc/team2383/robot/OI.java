package org.usfirst.frc.team2383.robot;

import org.usfirst.frc.team2383.robot.commands.FeederBackward;
import org.usfirst.frc.team2383.robot.commands.FeederForward;
import org.usfirst.frc.team2383.robot.commands.FeederStop;
import org.usfirst.frc.team2383.robot.commands.ShooterBackward;
import org.usfirst.frc.team2383.robot.commands.ShooterCycleFast;
	
import org.usfirst.frc.team2383.robot.commands.ShooterCycleStop;
import org.usfirst.frc.team2383.robot.commands.ShooterForward;
import org.usfirst.frc.team2383.robot.commands.ShooterStop;
import org.usfirst.frc.team2383.robot.ninjaLib.DPadButton;
import org.usfirst.frc.team2383.robot.ninjaLib.DPadButton.Direction;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //Joystick leftJoystick = new Joystick(0);
    //Joystick rightJoystick = new Joystick(1);
	Joystick driver;
    Joystick operator;
    
    JoystickButton shooterForwardButton, shooterBackwardButton, feederForwardButton, feederBackwardButton, shooterCycleFastButton;
    
    public OI(){
    	this.driver = new Joystick(0);
    	this.operator = new Joystick(2);

        shooterForwardButton = new JoystickButton(operator,5);
        shooterBackwardButton = new JoystickButton(operator,3);
        shooterCycleFastButton = new JoystickButton(operator,1);
        feederForwardButton = new JoystickButton(operator,6);
        feederBackwardButton = new JoystickButton(operator,4);
    	
       
    	shooterForwardButton.whenPressed(new ShooterForward());
    	shooterForwardButton.whenReleased(new ShooterStop());
    	
    	shooterBackwardButton.whenPressed(new ShooterBackward());
    	shooterBackwardButton.whenReleased(new ShooterStop());

    	
    	
    	shooterCycleFastButton.whileHeld(new ShooterCycleFast());
    	shooterCycleFastButton.whenReleased(new ShooterCycleStop());
    	
    	
    	feederForwardButton.whenPressed(new FeederForward());
    	feederForwardButton.whenReleased(new FeederStop());
    	
    	feederBackwardButton.whenPressed(new FeederBackward());
    	feederBackwardButton.whenReleased(new FeederStop());
    	

    	
    }
    
    public double getLeftY(){
    	return  driver.getRawAxis(1);
    }
    
    public double getRightX(){
    	return (-1 * driver.getRawAxis(4));
    }
    
}


