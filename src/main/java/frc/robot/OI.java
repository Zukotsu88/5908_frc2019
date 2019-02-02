/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
/* Default Values */
  private static final double DEFAULT_THUMBSTICK_DEADZONE = 0.1;  // Jiggle room for the thumbsticks
  private static final double DEFAULT_TRIGGER_DEADZONE    = 0.01; // Jiggle room for the triggers
  private static final double DEFAULT_TRIGGER_SENSITIVITY = 0.6;  // If the trigger is beyond this limit, say it has been pressed
  
  /* Button Mappings */
  private static final int    A_BUTTON_ID                 = 1;
  private static final int    B_BUTTON_ID                 = 2;
  private static final int    X_BUTTON_ID                 = 3;
  private static final int    Y_BUTTON_ID                 = 4;
  private static final int    LB_BUTTON_ID                = 5;
  private static final int    RB_BUTTON_ID                = 6;
  private static final int    BACK_BUTTON_ID              = 7;
  private static final int    START_BUTTON_ID             = 8;
  private static final int    LEFT_THUMBSTIKC_BUTTON_ID   = 9;
  private static final int    RIGHT_THUMBSTICK_BUTTON_ID  = 10;
  
  /* Axis Mappings */
  private static final int    LEFT_THUMBSTICK_X_AXIS_ID   = 0;
  private static final int    LEFT_THUMBSTICK_Y_AXIS_ID   = 1;
  private static final int    LEFT_TRIGGER_AXIS_ID        = 2;
  private static final int    RIGHT_TRIGGER_AXIS_ID       = 3;
  private static final int    RIGHT_THUMBSTICK_X_AXIS_ID  = 4;
  private static final int    RIGHT_THUMBSTICK_Y_AXIS_ID  = 5;  


public Joystick xbox0 = new Joystick(0);
public Joystick xbox1 = new Joystick(1);


}

