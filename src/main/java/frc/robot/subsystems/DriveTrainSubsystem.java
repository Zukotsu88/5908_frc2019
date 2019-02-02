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
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

import frc.robot.RobotMap;
import frc.robot.commands;

/**
 * Add your docs here.
 */
public class DriveTrainSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static final TalonSRX driveLeftMotorOne = new TalonSRX(RobotMap.driveLeftOne);
  public static final TalonSRX driveLeftMotorTwo = new TalonSRX(RobotMap.driveLeftTwo);
  public static final TalonSRX driveRightMotorOne = new TalonSRX(RobotMap.driveRightOne);
  public static final TalonSRX driveRightMotorTwo = new TalonSRX(RobotMap.driveRightTwo);

  SpeedControllerGroup leftMotor = new SpeedControllerGroup(driveLeftMotorOne, driveLeftMotorTwo);
  SpeedControllerGroup rightMotor = new SpeedControllerGroup(driveRightMotorOne, driveRightMotorTwo);
  DifferentialDrive diffDrive = new DifferentialDrive(leftMotor, rightMotor);

  public DriveTrainSubsystem() {
    // invert the right motors
    driveRightMotorOne.invert();
    driveRightMotorTwo.invert();
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new commands.ControllerArcadeDrive());
  }
  
}
