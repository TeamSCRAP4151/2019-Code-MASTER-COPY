package frc.robot;

import edu.wpi.first.wpilibj.Spark;

public class Elevator 
{
    //Create Sparks Needed Here Using RobotMap (You Will Need One For Each Side Unless Otherwise Specified)
    Spark elevator = new Spark(RobotMap.Elevator);

    public void move(double speed) 
    {
        elevator.set(speed);
    }
}