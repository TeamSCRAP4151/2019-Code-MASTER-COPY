package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain {

    //Create Sparks Needed Here Using RobotMap (You Will Need One For Each Side Unless Otherwise Specified)

    Spark driveLeft = new Spark(RobotMap.Drive_Left);
    Spark driveRight = new Spark(RobotMap.Drive_Right);

    //Create A Differential Drive That Utilizes The Sparks For Each Side

    DifferentialDrive driveT = new DifferentialDrive(driveLeft, driveRight);
    
    //All Of The Drivetrain Methods Are Below, Dictating All Of The Possible Actions Of The Drivetrain

    public void driveForward(double driveSpeed) {
        
        driveT.tankDrive(-driveSpeed, -driveSpeed); // negative is forward...
    }

    public void driveBackward(double driveSpeed) {
        
        driveT.tankDrive(driveSpeed, driveSpeed);
    }

    public void turnLeft(double driveSpeed) {
        
        driveT.tankDrive(driveSpeed, -driveSpeed); 
    }

    public void turnRight(double driveSpeed) {
        
        driveT.tankDrive(-driveSpeed, driveSpeed);
    }

    public void drive(double leftSpeed, double rightSpeed) {

        driveT.tankDrive(-leftSpeed, -rightSpeed);
    }
}