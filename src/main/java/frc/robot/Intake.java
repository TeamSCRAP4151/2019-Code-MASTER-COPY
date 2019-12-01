package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;

public class Intake {

    //Roller Controller
    Spark roller = new Spark(RobotMap.Roller);
    
    //Mechanism Controller
    DoubleSolenoid solenoid = new DoubleSolenoid(RobotMap.Solenoid_Left, RobotMap.Solenoid_Right); 

    public void roll(boolean rollOut, double speed) {
        
        if(rollOut==true) {
            roller.set(-speed - 0.25);
        } else {
            roller.set(speed +0.5);
        }
    }

    public void stop() {
        
        roller.set(0);
    }

    public void open() {

        solenoid.set(DoubleSolenoid.Value.kReverse);      
    }

    public void close()
    {
        solenoid.set(DoubleSolenoid.Value.kForward);
    }
}