package org.usfirst.frc.team4637.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class Position {
	Spark positionSpark = new Spark(7);
	{
	Potentiometer pot;
	pot = new AnalogPotentiometer (0, 360, 0);
	AnalogInput ai = new AnalogInput(1);
	pot = new AnalogPotentiometer (ai, 360, 0);
	
	}
}
