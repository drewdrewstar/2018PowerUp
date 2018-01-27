package org.usfirst.frc.team4637.robot;
import edu.wpi.first.wpilibj.Spark;
public class IntakeOuttake {
	Spark leftSpark = new Spark (5);
	Spark rightSpark = new Spark (6);
	double sparkSpeed = 1.0;
		
	public void Intake() {
		leftSpark.set(sparkSpeed);
		rightSpark.set(-sparkSpeed);
		
	}
	public void Outtake() {
		leftSpark.set(-sparkSpeed);
		rightSpark.set(sparkSpeed);
		
	}
	}
