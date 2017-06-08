package org.usfirst.frc.team1389.robot.controls;

import com.team1389.hardware.inputs.controllers.LogitechExtreme3D;
import com.team1389.hardware.inputs.software.DigitalIn;
import com.team1389.hardware.inputs.software.PercentIn;

public class ControlBoard {
	private final LogitechExtreme3D driveController = new LogitechExtreme3D(0);
	public PercentIn driveYAxis() {
		return driveController.yAxis().applyDeadband(.075).invert();
	}

	public PercentIn driveXAxis() {
		return driveController.xAxis().applyDeadband(.075);
	}

	public PercentIn driveYaw() {
		return driveController.yaw().applyDeadband(.075);
	}

	public PercentIn driveTrim() {
		return driveController.throttle();
	}

	public DigitalIn driveModeBtn() {
		return driveController.thumbButton().latched();
	}

	public DigitalIn driveModifierBtn() {
		return driveController.trigger();
	}


}
