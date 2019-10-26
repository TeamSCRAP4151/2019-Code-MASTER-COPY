package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class DDRMat extends Joystick {

    public DDRMat(int port) {
        super(port);
    }

    public boolean getOrangeUpArrow() { //Might be 8
        if(getRawButton(14)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getBlueUpArrow() { //Might be 14
        if(getRawButton(8)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getOrangeDownArrow() { //Might be 3
        if(getRawButton(10)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getBlueDownArrow() { //Might be 10
        if(getRawButton(3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getLeftArrow() { //Might be 13
        if(getRawButton(13)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getRightArrow() { //Might be 4
        if(getRawButton(4)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getOrangeCenterButton() { //Unknown
        if(getRawButton(0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getBlueCenterButton() { //Unknown
        if(getRawButton(0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getPlusButton() { //Might be 1
        if(getRawButton(1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getMinusButton() { //Might be 16
        if(getRawButton(16)) {
            return true;
        } else {
            return false;
        }
    }
}