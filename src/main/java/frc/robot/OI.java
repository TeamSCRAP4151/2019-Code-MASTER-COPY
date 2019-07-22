package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class OI {

    //Create Controllers Here
    XboxController Xbox = new XboxController(RobotMap.Xbox_Port);
    Bongo bongo = new Bongo(RobotMap.Bongo_Port);
       
    //Create Subsystems (Drivetrain, Intake etc. Here)
    CameraSystem camera = new CameraSystem();
    Drivetrain driveT = new Drivetrain();
    Elevator elevator = new Elevator();
    Intake intake = new Intake();
    
    boolean frontActive = true; 

    public void readXboxInput() {
        
        if (Xbox.getY(Hand.kLeft)>0.5) { //When the left trigger on the controller is flicked upward, the robot will move forward.
                
            driveT.driveForward(.7);

        } else if (Xbox.getY(Hand.kLeft)<-0.5) { //When the left trigger on the controller is flicked downward, the robot will move backwards.

                driveT.driveBackward(.7);

        } else if (Xbox.getX(Hand.kLeft)>0.5) { //When the left trigger on the controller is flicked to the right, the robot will turn right

                driveT.turnLeft(.6);

        } else if (Xbox.getX(Hand.kLeft)<-0.5) { //When the left trigger on the controller is flicked to the left... take a wild guess.
            
                driveT.turnRight(.6);

        }

        if (Xbox.getTriggerAxis(Hand.kRight) > .5) {
                elevator.move(.8);
        }
        else if (Xbox.getTriggerAxis(Hand.kLeft) > .5) {
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
    }

    public void readBongoInput() {

        if(bongo.getTopLeft()) {
                //Method
        }

        if(bongo.getTopRight()) {
                //Method
        }

        if(bongo.getBottomLeft()) {
                //Method
        }

        if(bongo.getBottomRight()) {
                //Method
        }

        if(bongo.getCenterButton()) {
                //Method
        }

        if(bongo.getClap()) {
                TheOnlyValidAuto auto = new TheOnlyValidAuto();
                auto.PlanZ(driveT);
        }
    }
}
