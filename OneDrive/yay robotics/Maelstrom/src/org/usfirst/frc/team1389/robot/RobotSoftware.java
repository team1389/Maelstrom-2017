package org.usfirst.frc.team1389.robot;

import com.team1389.hardware.value_types.Percent;
import com.team1389.system.drive.DriveOut;
import com.team1389.system.drive.SixDriveOut;

public class RobotSoftware extends RobotHardware {

	public SixDriveOut<Percent> drive;

	public RobotSoftware() {
		//check inversions
		drive = new SixDriveOut<Percent>(frontLeft.getVoltageOutput(), middleLeft.getVoltageOutput(),
				backLeft.getVoltageOutput(), frontRight.getVoltageOutput(), middleRight.getVoltageOutput(),
				backRight.getVoltageOutput());
	}

}
