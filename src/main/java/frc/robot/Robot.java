// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import com.revrobotics.CANSparkMax;

//import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
 
/**
 * This sample program shows how to control a motor using a XboxController. In the operator control part
 * of the program, the XboxController is read and the value is written to the motor.
 *
 * <p>XboxController analog values range from -1 to 1 and motor controller inputs also range from -1 to 1
 * making it easy to work together.
 *
 * <p>In addition, the encoder value of an encoder connected to ports 0 and 1 is consistently sent
 * to the Dashboard.
 */
public class Robot extends TimedRobot {

  private static final int motor1ID = 5;
  private static final int motor2ID = 12;
  private static final int motor3ID = 11;

  private CANSparkMax m_motor1;
  private CANSparkMax m_motor2;
  private CANSparkMax m_motor3;
  private XboxController m_XboxController;
  
  
  /* private static final int kMotorPort0CanID = 2;
  private static final int kMotorPort1CanID= 3;
  private static final int kMotorPort2 = 14;
  private static final int kMotorPort3 = 15;
  private static final int kXboxControllerPort = 0;
  private static final int kEncoderPortA0 = 0;
  private static final int kEncoderPortB0 = 1;
  private static final int kEncoderPortA1 = 2;
  private static final int kEncoderPortB1 = 3;
  private static final int kEncoderPortA2 = 4;
  private static final int kEncoderPortB2 = 5;
 private static final int kEncoderPortA3 = 6;
  private static final int kEncoderPortB3 = 7;  

  private PWMSparkMax m_motorSparkMax0;
  private PWMSparkMax m_motorSparkMax1;
  private PWMSparkMax m_motorSparkMax2;
  private PWMSparkMax m_motorSparkMax3;
  
  private Encoder m_encoder0;
  private Encoder m_encoder1;
  private Encoder m_encoder2;
  private Encoder m_encoder3;

  */

  
  @Override
  public void robotInit() {
    m_motor1 = new CANSparkMax(motor1ID, CANSparkMax.MotorType.kBrushless);
  m_motor2 = new CANSparkMax(motor2ID, CANSparkMax.MotorType.kBrushless);
  m_motor3 = new CANSparkMax(motor3ID, CANSparkMax.MotorType.kBrushless);

  m_motor1.restoreFactoryDefaults();
    m_motor2.restoreFactoryDefaults();
    m_motor3.restoreFactoryDefaults();

  }

  

  /*
   * The RobotPeriodic function is called every control packet no matter the
   * robot mode.
   */
  
  /* @Override
  public void robotPeriodic() {
    SmartDashboard.putNumber("Encoder", m_encoder0.getDistance());
    SmartDashboard.putNumber("Encoder", m_encoder1.getDistance());
    SmartDashboard.putNumber("Encoder", m_encoder2.getDistance());
    SmartDashboard.putNumber("Encoder", m_encoder3.getDistance());
    
  }
   */
  

  @Override
  public void teleopPeriodic() {

    while(m_XboxController.getLeftBumper()){
      m_motor1.set(1);

    }

    while(m_XboxController.getRightBumper()){
      m_motor1.set(-1);

    }
    //hello

    while(m_XboxController.getAButton()){
      m_motor2.set(1);
    }

    while(m_XboxController.getBButton()){
      m_motor2.set(-1);
    }

    m_motor3.set(m_XboxController.getLeftY());
    

    /*Creating if else statement for if two buttons are hit at the same time!
    if((m_XboxController.getLeftBumper()) && (!m_XboxController.getRightBumper())){
        motor1.set(1);
        motor2.set(1);
        motor3.set(1);
    }

    if((m_XboxController.getRightBumper()) && (!m_XboxController.getLeftBumper())){
        motor1.set(-1);
        motor2.set(-1);
        motor3.set(-1);
    }
    */

    //if((m_XboxController.getAButton()) && (!m_XboxController.getBButton())){
      //  motor2.set(1);
   // }

    //if((m_XboxController.getBButton()) && (!m_XboxController.getAButton())){
      //  motor2.set(-1);
    //}
  }

  
}
