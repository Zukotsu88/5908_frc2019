/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Solenoid;
/*import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.interfaces.Gyro;*/

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;


  public static final class DriveMap {
    public static final TalonSRX rightMotor1 = new TalonSRX(15);
    public static final TalonSRX rightMotor2 = new TalonSRX(14);
    public static final TalonSRX rightMotor3 = new TalonSRX(13);

    public static final TalonSRX leftMotor1 = new TalonSRX(0);
    public static final TalonSRX leftMotor2 = new TalonSRX(1);
    public static final TalonSRX leftMotor3 = new TalonSRX(2);

    public static final Solenoid random4 = new Solenoid(0);
    public static final Solenoid shiftPTO = new Solenoid(5);

    public static final Solenoid tester1 = new Solenoid(0);
    public static final Solenoid tester2 = new Solenoid(5);   

  }









}


