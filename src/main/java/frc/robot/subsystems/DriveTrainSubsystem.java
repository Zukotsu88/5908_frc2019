/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.RobotMap;
import frc.robot.Commands;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static final TalonSRX driveLeftMotorOne = new TalonSRX(RobotMap.driveLeftOne);
  public static final TalonSRX driveLeftMotorTwo = new TalonSRX(RobotMap.driveLeftTwo);
  public static final TalonSRX driveRightMotorOne = new TalonSRX(RobotMap.driveRightOne);
  public static final TalonSRX driveRightMotorTwo = new TalonSRX(RobotMap.driveRightTwo);

  SpeedControllerGroup leftMotor = new SpeedControllerGroup(driveLeftMotorOne, driveLeftMotorTwo);
  SpeedControllerGroup rightMotor = new SpeedControllerGroup(driveRightMotorOne, driveRightMotorTwo);
  DifferentialDrive diffDrive = new DifferentialDrive(leftMotor, rightMotor);

  public DriveTrain() {
    // invert the right motors
    driveRightMotorOne.invert();
    driveRightMotorTwo.invert();

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Commands.ControllerArcaneDrive());
  }

  public void setRightSpeed(double speed) {
		if(speed<-1) speed =-1;
		if(speed>1) speed=1;
		driveRightRearMotor.set(speed);
		driveRightFrontMotor.set(speed);
	}
	
	/**
	 * Set the speed of the two left motors
	 * @param speed between -1 and 1
	 */
	public void setLeftSpeed(double speed) {
		if(speed<-1) speed =-1;
		if(speed>1) speed=1;
		driveLeftRearMotor.set(speed);
		driveLeftFrontMotor.set(speed);
	}

}
