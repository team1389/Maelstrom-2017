package org.usfirst.frc.team1389.operation;


import org.usfirst.frc.team1389.robot.RobotSoftware;
import org.usfirst.frc.team1389.robot.controls.ControlBoard;

import com.team1389.hardware.inputs.software.DigitalIn;
import com.team1389.system.SystemManager;
import com.team1389.system.drive.CurvatureDriveSystem;

public class TeleopMain {
	SystemManager manager;
	DigitalIn timeRunning;
	RobotSoftware robot;
	ControlBoard controls;
	
	public TeleopMain(RobotSoftware robot){
		this.robot = robot;
		manager = new SystemManager(new CurvatureDriveSystem(robot.drive, controls.driveYAxis(), controls.driveXAxis(), controls.driveModeBtn()));
	}
	
	
	public void update() {
		manager.update();
	}


}
