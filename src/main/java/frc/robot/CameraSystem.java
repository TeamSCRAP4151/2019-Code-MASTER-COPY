package frc.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSink;
import edu.wpi.first.cameraserver.CameraServer;

public class CameraSystem {
	
    UsbCamera frontCamera = CameraServer.getInstance().startAutomaticCapture(0);
    UsbCamera backCamera = CameraServer.getInstance().startAutomaticCapture(1);
    VideoSink server = CameraServer.getInstance().getServer();

    public void useFrontCamera() {

        server.setSource(frontCamera);
    }

    public void useBackCamera() {

        server.setSource(backCamera);
    }
} 