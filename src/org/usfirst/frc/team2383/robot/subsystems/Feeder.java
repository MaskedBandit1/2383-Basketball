package org.usfirst.frc.team2383.robot.subsystems;

import org.usfirst.frc.team2383.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Feeder extends Subsystem {
    
    VictorSP feeder;

    public Feeder(){
    	feeder = new VictorSP(RobotMap.feederMotor);
    }
    
    public void feederForward(){
    	feeder.set(0.7);
    }
    
    public void feederBackward(){
    	feeder.set(-0.7);
    }
    
    public void feederStop(){
    	feeder.set(0.0);
    }
    
    public void initDefaultCommand() {
        feeder.set(0.0);
    }
}

