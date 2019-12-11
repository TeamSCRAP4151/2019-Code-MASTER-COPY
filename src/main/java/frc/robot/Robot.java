package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;

public class Robot extends TimedRobot {

  CameraSystem camera = new CameraSystem();
  OI oi = new OI();
  PowerDistributionPanel power = new PowerDistributionPanel();
  Compressor compressor = new Compressor(RobotMap.Compress_Port);

  @Override
  public void robotInit() { 
    
    power.clearStickyFaults();
    compressor.setClosedLoopControl(true);
    camera.useFrontCamera();
  }

  @Override
  public void teleopInit() {
    
  }

  @Override
  public void teleopPeriodic() { 
    
    oi.readAndriInput(); 
    //oi.readBuddySystemInput();
    //oi.readTheBestInput();
    //oi.warpDrive();
    //oi.stationaryInput();
    //oi.kiddieInput();
  }

  @Override
  public void disabledInit() {

  }

  @Override
  public void autonomousPeriodic() {
    
    teleopPeriodic();

  }

}