package org.usfirst.frc.team1389.robot;

import com.team1389.hardware.value_types.Percent;
import com.team1389.system.drive.DriveOut;
import com.team1389.system.drive.FourDriveOut;

public class RobotSoftware extends RobotHardware {

	public DriveOut<Percent> drive;

	public RobotSoftware() {
		drive = new DriveOut<>(frontRight.getVoltageOutput(),/* backRight.getVoltageOutput(),*/
				frontLeft.getVoltageOutput()/*, backLeft.getVoltageOutput()*/);
	}

}
