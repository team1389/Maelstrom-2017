package org.usfirst.frc.team1389.robot;

import com.team1389.hardware.outputs.hardware.SparkHardware;
import com.team1389.hardware.outputs.hardware.VictorHardware;
import com.team1389.hardware.registry.Registry;

public class RobotHardware extends RobotLayout{
	protected RobotHardware(){
	registry = new Registry();
	initDriveTrain();
	}

	
	private void initDriveTrain() {
		frontRight = new VictorHardware(inv_RIGHT_FRONT_MOTOR, pwm_RIGHT_FRONT_MOTOR, registry);
		middleRight = new VictorHardware(inv_RIGHT_MIDDLE_MOTOR, pwm_RIGHT_MIDDLE_MOTOR, registry);
		backRight = new VictorHardware(inv_RIGHT_BACK_MOTOR, pwm_RIGHT_BACK_MOTOR, registry);
		

		frontLeft = new SparkHardware(inv_LEFT_FRONT_MOTOR, pwm_LEFT_FRONT_MOTOR, registry);
		middleLeft = new SparkHardware(inv_LEFT_MIDDLE_MOTOR, pwm_LEFT_MIDDLE_MOTOR, registry);
		backLeft = new SparkHardware(inv_LEFT_BACK_MOTOR, pwm_LEFT_BACK_MOTOR, registry);
	}

}
