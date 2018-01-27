/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4637.robot;
import org.usfirst.frc.team4637.robot.Shooter;
import org.usfirst.frc.team4637.robot.IntakeOuttake;
import org.usfirst.frc.team4637.robot.Position;
import org.usfirst.frc.team4637.robot.Climber;
import org.usfirst.frc.team4637.robot.DriveTrain;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */

public class Robot extends IterativeRobot {
	int startingPos;
	String gameData = DriverStation.getInstance().getGameSpecificMessage();
	DifferentialDrive myDrive;
	Joystick left, right;
	PWMTalonSRX backLeftTalonSRX = new PWMTalonSRX(1);
	PWMTalonSRX backRightTalonSRX = new PWMTalonSRX(3);
	VictorSP frontLeftVictorSP = new VictorSP(2);
	VictorSP frontRightVictorSP = new VictorSP(4);
	
	void MotorSpeed(){
		double speed = 0.7;
		backLeftTalonSRX.set(speed);
		backRightTalonSRX.set(speed);
		frontLeftVictorSP.set(speed);
		frontRightVictorSP.set(speed);
	}
	SpeedControllerGroup rightDrive = new SpeedControllerGroup(frontRightVictorSP, frontRightVictorSP);
	SpeedControllerGroup leftDrive = new SpeedControllerGroup (backRightTalonSRX, backLeftTalonSRX);
	
	
	
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {		
		
		SmartDashboard.putNumber("Starting Pos", 1);
			// GETTING THE STARTING POSITION
			// Get the selection from the smart dashboard, if no selection is found, return 1
			startingPos = (int)SmartDashboard.getNumber("Starting Pos", 1);


			// Make sure that the starting position is valid to avoid errors
			// This is not a very good way of doing it, i am just trying to demonstrate how you would get user input
			if(startingPos > 3){
				startingPos = 3;
			}else if(startingPos < 0){
				startingPos = 0;
			}
			//Credit to Garrett Buroughs, Team 555
	}
	
	@Override
	public void autonomousInit() {
		System.out.println("Auto selected: " + startingPos);
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
				
			//DECIDING THE AUTONOMOUS BASED OFF OF GAME DATA AND STARTING POSITION
			if (gameData.charAt(0) == 'L'){
					  switch (startingPos){
					    case 1:
					      //code to drive to switch from this position
					      break;
					    
					    case 2:
					      //code to drive to switch from this position
					      break;
					    
					    case 3:
					      //code to drive to switch from this position
					      break;
					    }
					}
					  else {                                            //If the switch position is not L, the else gives the directions for position R  
					    switch (startingPos) {                          //switch to determine distance needed to drive to the switch
					      case 1:
					        //code to drive to switch from this position
					        break;
					      
					      case 2:
					        //code to drive to switch from this position
					      break;
					      
					      case 3:
					        //code to drive to switch from this position
					      break;
					      }
					  }
		}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
