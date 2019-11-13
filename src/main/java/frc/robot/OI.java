package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class OI {

    //Create Controllers Here
    Joystick stick = new Joystick(RobotMap.Xbox_Port);
    XboxController Xbox = new XboxController(RobotMap.Xbox_Port);
    XboxController Xbox2 = new XboxController(RobotMap.Xbox2_Port);
    Bongo bongo = new Bongo(RobotMap.Bongo_Port);
    Bongo bongo2 = new Bongo(RobotMap.Bongo2_Port);
    DDRMat DDR = new DDRMat(RobotMap.MatAndBoard_Port);
    WiiFitBalance board = new WiiFitBalance(RobotMap.MatAndBoard_Port);
       
    //Create Subsystems (Drivetrain, Intake etc. Here)
    CameraSystem camera = new CameraSystem();
    Drivetrain driveT = new Drivetrain();
    Elevator elevator = new Elevator();
    Intake intake = new Intake();
    
    boolean frontActive = true; 
    boolean slowMode = false; 

    int speed = 1;

    public void readAndriInput() {
        
        if (Xbox.getY(Hand.kLeft)>0.25) { 
                
            driveT.driveForward(Xbox.getY(Hand.kLeft) -.1);

        } else if (Xbox.getY(Hand.kLeft)<-0.25) { 

                driveT.driveBackward(-Xbox.getY(Hand.kLeft) + .1);

        } else if (Xbox.getX(Hand.kLeft)<-0.25) { 

                driveT.turnLeft(-Xbox.getX(Hand.kLeft));

        } else if (Xbox.getX(Hand.kLeft)>0.25) { 
            
                driveT.turnRight(Xbox.getX(Hand.kLeft));
        }
        

        if(Xbox.getRawButtonPressed(3) == true) {
                
                driveT.setSlowSpeed();
        }
        if(Xbox.getRawButtonPressed(2) == true) {
                
                driveT.setFullSpeed();
        }
        if(Xbox.getRawButtonPressed(1) == true) {
                
                driveT.setAndriProofSpeed();
        }


        if (Xbox.getTriggerAxis(Hand.kRight) > .2) {
                elevator.move(Xbox.getTriggerAxis(Hand.kRight));
        }
        else if (Xbox.getTriggerAxis(Hand.kLeft) > .2) {
                elevator.move(-.5);
        }
        else {
                elevator.move(0);
        }
      
        
        if (Xbox.getBumper(Hand.kLeft)) { //Xbox.getTriggerAxis(Hand.kLeft)>0.1
        
                intake.open();
        } 

        if(Xbox.getBumper(Hand.kRight)) {

                intake.close();
        } 
        
        if (Xbox.getY(Hand.kRight) > .5) { 

                intake.roll(true, .9);

        } else if (Xbox.getY(Hand.kRight) < -.5) {

                intake.roll(false, .9);

        } else {
                
                intake.stop();
        }

        if (Xbox.getYButton()) { 

                if(frontActive == true) {
                        camera.useBackCamera();
                        frontActive = false;
                } else {
                        camera.useFrontCamera();
                        frontActive = true;
                }
        }

        if(Xbox.getRawButtonPressed(3) == true) {
                
                driveT.setSlowSpeed();
        }
        if(Xbox.getRawButtonPressed(2) == true) {
                
                driveT.setFullSpeed();
        }
        if(Xbox.getRawButtonPressed(1) == true) {
                
                driveT.setAndriProofSpeed();
        }

 
    }






    public void readBuddySystemInput() {
        
        if (Xbox.getY(Hand.kLeft)>0.25) { 
                
            driveT.driveForward(Xbox.getY(Hand.kLeft) -.1);

        } else if (Xbox.getY(Hand.kLeft)<-0.25) { 

                driveT.driveBackward(-Xbox.getY(Hand.kLeft) + .1);

        } else if (Xbox.getX(Hand.kLeft)<-0.25) { 

                driveT.turnLeft(Xbox.getX(Hand.kLeft));

        } else if (Xbox.getX(Hand.kLeft)>0.25) { 
            
                driveT.turnRight(-Xbox.getX(Hand.kLeft));

        }
        

        if(Xbox.getRawButtonPressed(3) == true) {
                
                driveT.setSlowSpeed();
        }
        if(Xbox.getRawButtonPressed(2) == true) {
                
                driveT.setFullSpeed();
        }
        if(Xbox.getRawButtonPressed(1) == true) {
                
                driveT.setAndriProofSpeed();
        }


        if (Xbox2.getY(Hand.kLeft) > .2) {
                elevator.move(.5);
        }
        else if (Xbox2.getY(Hand.kLeft) < -.2) {
                elevator.move(Xbox2.getY(Hand.kLeft));
        }
        else {
                elevator.move(0);
        }
      
        
        if (Xbox2.getAButton()) { //Xbox.getTriggerAxis(Hand.kLeft)>0.1
        
                intake.close();
        } 

        if(Xbox2.getBButton()) {

                intake.open();
        } 
        
        if (Xbox2.getY(Hand.kRight) > .5) { 

                intake.roll(true, .9);

        } else if (Xbox2.getY(Hand.kRight) < -.5) {

                intake.roll(false, .9);

        } else {
                
                intake.stop();
        }

        if (Xbox.getYButton()) { 

                if(frontActive == true) {
                        camera.useBackCamera();
                        frontActive = false;
                } else {
                        camera.useFrontCamera();
                        frontActive = true;
                }
        }
    }






    public void readTheBestInput() {

        if(DDR.getOrangeUpArrow() || DDR.getBlueUpArrow()) {

                driveT.driveForward(.8);

        } else if(DDR.getOrangeDownArrow() || DDR.getBlueDownArrow()) {
                
                driveT.driveBackward(.8);

        } else if(DDR.getLeftArrow()) {

                driveT.turnLeft(.8);

        } else if(DDR.getRightArrow()) {

                driveT.turnRight(.8);
        }

        if(DDR.getPlusButton()) {

                switch(speed) {
                        case 0:
                                driveT.setSlowSpeed();
                                speed++;
                                break;
                        case 1:
                                driveT.setFullSpeed();
                                speed++;
                                break;
                        case 2:
                                break;
                }

        } else if(DDR.getMinusButton()) {

                switch(speed) {
                        case 0:
                                break;
                        case 1:
                                driveT.setAndriProofSpeed();
                                speed--;
                                break;
                        case 2:
                                driveT.setSlowSpeed();
                                speed--;
                                break;
                }
        }

        if(bongo.getTopLeft()) {

                elevator.move(1);

        } else if(bongo.getBottomLeft()) {
                
                elevator.move(-.5);

        } else {

                elevator.move(0);

        }


        if(bongo.getTopRight()) {

                intake.roll(true, .9);

        } else if(bongo.getBottomRight()) {
                
                intake.roll(false, .9);

        } else {

                intake.roll(true,0);

        }

        if(bongo2.getTopLeft() || bongo2.getBottomLeft()) {

                intake.open();

        } else if(bongo2.getTopRight() || bongo2.getBottomRight()) {
                
                intake.close();

        }  

    }

    public void warpDrive() {

        if(Xbox.getTriggerAxis(Hand.kRight)>.15 ) {
                
            driveT.warpDrive(Xbox.getTriggerAxis(Hand.kRight), Xbox.getX(Hand.kLeft), Xbox.getRawButton(10));
                
        } else {
                
            driveT.warpDrive(Xbox.getTriggerAxis(Hand.kRight), 0, Xbox.getRawButton(10));
                
        } 

        if(Xbox.getTriggerAxis(Hand.kLeft)>.15) {
                
                driveT.warpDrive(-Xbox.getTriggerAxis(Hand.kLeft), Xbox.getX(Hand.kLeft), Xbox.getRawButton(10));
                    
            } else {
                    
                driveT.warpDrive(-Xbox.getTriggerAxis(Hand.kLeft), 0, Xbox.getRawButton(10));
                    
            } 
    }






    public void stationaryInput() {
        
        
        

      


        if (Xbox.getTriggerAxis(Hand.kRight) > .2) {
                elevator.move(Xbox.getTriggerAxis(Hand.kRight));
        }
        else if (Xbox.getTriggerAxis(Hand.kLeft) > .2) {
                elevator.move(-.2);

        }
        else {
                elevator.move(0);
        }
      
        
        if (Xbox.getBumper(Hand.kLeft)) { //Xbox.getTriggerAxis(Hand.kLeft)>0.1
        
                intake.open();
        } 

        if(Xbox.getBumper(Hand.kRight)) {

                intake.close();
        } 
        
        if (Xbox.getY(Hand.kRight) > .5) { 

                intake.roll(true, .9);

        } else if (Xbox.getY(Hand.kRight) < -.5) {

                intake.roll(false, .9);

        } else {
                
                intake.stop();
        }

        if (Xbox.getYButton()) { 

                if(frontActive == true) {
                        camera.useBackCamera();
                        frontActive = false;
                } else {
                        camera.useFrontCamera();
                        frontActive = true;
                }
        }

    }

    public void kiddieInput() {


        
        if (Xbox.getY(Hand.kLeft)>0.25) { 
                
                driveT.driveForward(.6);
    
        } else if (Xbox.getY(Hand.kLeft)<-0.25) { 
    
                driveT.driveBackward(.6);
    
        } else if (Xbox.getX(Hand.kLeft)<-0.25) { 
    
                driveT.turnLeft(.7);
    
        } else if (Xbox.getX(Hand.kLeft)>0.25) { 
                
                driveT.turnRight(.7);
        }


    }

}