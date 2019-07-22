package frc.robot;

import edu.wpi.first.wpilibj.Timer;

public class TheOnlyValidAuto { 

    public void PlanZ(Drivetrain myRobot) { 

		Timer time = new Timer();  //CURSES! Krabs is being interviewed by Perch Perkins,

        while(time.get() < 2.862) //and I've never had one CUSTOMER!... customer..... customer.........
	    {
		    myRobot.drive(-0.7, 0); //Don't get worked up again PLankton, I just mopped the floors.
        }
	    while(time.get() < 3.111) //Oh Karen, my computer wife, if only I had stolen the secret to Krabs's success,
	    {
		    myRobot.drive(-0.8, -1.0); //The formula for the Krabby Patty... oooooohhhh
	    }
	    while(time.get() < 3.609) //Then people would line up to eat at my restaurant!
	    {
		    myRobot.drive(-.8, 1.0); //Lord knows I've tried...
	    } 
	    while(time.get() < 4.107) //I've exhausted every evil plan in my filing cabinet
	    {
		    myRobot.drive(-0.8, -1.0); //From A to Y.
	    }
	    while(time.get() < 4.46) //A to Y?
	    {
		    myRobot.drive(-.8, 1.0); //Yeah, A to Y, y'know the alphabet.
        }
    
        myRobot.drive(0.0, 0.0); //What about Z?

	    while(time.get() < 4.709) //Z?????
	    {
		    myRobot.drive(-0.8, -1.0); //Z, the letter after Y.
	    }
	    while(time.get() < 5.198) //W, X, Y, Z
	    {
		    myRobot.drive(-.8, 1.0); //Plan Z here it is, just like you said!
	    }
	    while(time.get() < 5.696) //Ah boy...
	    {
		    myRobot.drive(-0.8, -1.0); //Ohh, ohhhhhh, oohhhhhhh
	    }
	    while(time.get() < 6.03) //It's evil! 
	    {
		    myRobot.drive(-.8, 1.0); //It's diabolical!
        }
    
        myRobot.drive(0.0, 0.0); //*sniff* It's lemon scented!
    
	    while(time.get() < 7.461) //THIS PLAN Z CAN'T POSSIBLY FAIL!
	    {
		    myRobot.drive(0.7, 0.0); //So enjoy today Mr. Krabs,
	    }
	    while(time.get() < 7.71) //Because by tomorrow I will have the formula.
	    {
	        myRobot.drive(-0.8, -1.0); //And everyone will eat at The Chum Bucket!
	    }
	    while(time.get()< 8.41) //And I WILL RULE THE WORLD!
	    {
		    myRobot.drive(-0.7, 0.0); //All hail Plankton! 
        }

    	myRobot.drive(0.0,0.0); //ALL HAIL PLANK-AHHHHH
    }
} 




