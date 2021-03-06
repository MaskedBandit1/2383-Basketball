package org.usfirst.frc.team2383.robot.auto;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import org.usfirst.frc.team2383.robot.Robot;
import org.usfirst.frc.team2383.robot.commands.ShooterCycleFast;
import org.usfirst.frc.team2383.robot.commands.ShooterForward;

/**
 *
 */
public class AutoCommand extends CommandGroup {
	
    public AutoCommand() {
        
    	addSequential(new ShooterCycleFast());
    	
    	// Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	//addSequential(new Move(4, 0.5));
    }
}
