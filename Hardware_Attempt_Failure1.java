package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by slistudent on 9/20/17.
 */

public class Hardware_Attempt_Failure1
{
    public DcMotor frontRight1 = null;
    public DcMotor frontLeft2  = null;
    public DcMotor backRight3  = null;
    public DcMotor backLeft4   = null;

    //local OpMode members
    HardwareMap hwMap          = null;
    private ElapsedTime period = new ElapsedTime();

    //Constructor
    public HardwarePushbot(){

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        frontRight1  = hwMap.get(DcMotor.class, "m1");
        frontLeft2 = hwMap.get(DcMotor.class, "m2");
        backRight3 = hwMap.get(DcMotor.class, "m3");
        backLeft4 = hwMap.get(DcMotor.class, "m4");

        leftDrive.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rightDrive.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors

        // Set all motors to zero power
        frontRight1.setPower(0);
        frontLeft2.setPower(0);
        backRight3.setPower(0);
        backLeft4.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        frontRight1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontLeft2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRight3.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeft4.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }
}
