package org.usfirst.frc.team4637.robot;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.VictorSP;

public class DriveTrain {
	PWMTalonSRX backLeftTalonSRX = new PWMTalonSRX(1);
	PWMTalonSRX backRightTalonSRX = new PWMTalonSRX(3);
	VictorSP frontLeftVictorSP = new VictorSP(2);
	VictorSP frontRightVictorSP = new VictorSP(4);
	
	public void MotorSpeed(){
		double speed = 0.7;
		backLeftTalonSRX.set(speed);
		backRightTalonSRX.set(speed);
		frontLeftVictorSP.set(speed);
		frontRightVictorSP.set(speed);
		
		
		
	}

}
