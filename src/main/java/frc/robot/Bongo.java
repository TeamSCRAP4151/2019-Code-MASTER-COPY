package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Bongo extends Joystick {

    public Bongo(int port) {
        super(port);
    }

    public boolean getTopLeft() {
        if(this.getRawButton(4)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getTopRight() {
        if(this.getRawButton(1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getBottomLeft() {
        if(this.getRawButton(3)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getBottomRight() {
        if(this.getRawButton(2)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getCenterButton() {
        if(this.getRawButton(10)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getClap() {
        if(this.getY() > .2) {
            return true;
        } else {
            return false;
        }
    }
}