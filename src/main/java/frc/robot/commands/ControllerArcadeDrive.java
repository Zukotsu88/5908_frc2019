/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Joystick;

import frc.robot.subsystems;
import frc.robot.OI;

import java.lang.*;

public class ControllerArcadeDrive extends Command {

  private Joystick xbox = OI.xbox0;

  public ControllerArcadeDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(subsystems.DriveTrainSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    subsystems.DriveTrainSubsystem.driveLeftMotorOne.set(IO.xbox0);
    subsystems.DriveTrainSubsystem.diffDrive.arcadeDrive(getY(), getX());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }

  private double getX(){
    return Math.cos(xbox.getPOV());
  }

  private double getY(){
    return Math.sin(xbox.getPOV());
  }


}
