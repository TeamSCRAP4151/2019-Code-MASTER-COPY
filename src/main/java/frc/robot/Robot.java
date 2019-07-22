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

  //Add Auto Init & Periodic For Sandstorm Period As Otherwise Commands Will Not Trigger

  @Override
  public void teleopInit() {
    
  }

  @Override
  public void teleopPeriodic() { //Comment Out Any Overlapping Controls! Otherwise A Non Active Controller Can Cause Errors
    
    oi.readXboxInput(); 
    //oi.readBongoInput();
  }

  @Override
  public void disabledInit() {

  }
}