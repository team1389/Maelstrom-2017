package org.usfirst.frc.team1389.robot;

import com.team1389.hardware.registry.port_types.PWM;

public class RobotMap {
	
	protected final PWM pwm_RIGHT_FRONT_MOTOR = new PWM(3);
	protected final PWM pwm_RIGHT_MIDDLE_MOTOR = new PWM(4);
	protected final PWM pwm_RIGHT_BACK_MOTOR = new PWM(5);
	
	protected final boolean inv_RIGHT_FRONT_MOTOR = false;
	protected final boolean inv_RIGHT_MIDDLE_MOTOR = false;
	protected final boolean inv_RIGHT_BACK_MOTOR = false;
	

	protected final PWM pwm_LEFT_FRONT_MOTOR = new PWM(0);
	protected final PWM pwm_LEFT_MIDDLE_MOTOR = new PWM(1);
	protected final PWM pwm_LEFT_BACK_MOTOR = new PWM(2);
	
	protected final boolean inv_LEFT_FRONT_MOTOR = true;
	protected final boolean inv_LEFT_MIDDLE_MOTOR = true;
	protected final boolean inv_LEFT_BACK_MOTOR = true;
	
	

}
