package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;

public class WiiFitBalance extends GenericHID {

    public WiiFitBalance(int port) {
        super(port);
    }

    @Override
    public double getX(Hand hand) {
        return getRawAxis(0);
    }

    @Override
    public double getY(Hand hand) {
        return getRawAxis(1);
    }
}