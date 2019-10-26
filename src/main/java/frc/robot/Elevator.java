package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class Elevator 
{
    //Create Sparks Needed Here Using RobotMap (You Will Need One For Each Side Unless Otherwise Specified)
    Spark elevator1 = new Spark(RobotMap.Elevator1);
    Spark elevator2 = new Spark(RobotMap.Elevator2);
    SpeedControllerGroup elevator = new SpeedControllerGroup(elevator1, elevator2);

    public void move(double speed) 
    {
        elevator.set(speed);
    }
}