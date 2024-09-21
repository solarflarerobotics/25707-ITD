package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
@Autonomous
public class LinkageTets extends LinearOpMode{
    @Override
    public void runOpMode() throws InterruptedException {
        Servo linkage1 = hardwareMap.servo.get("linkage1");
        linkage1.setPosition(0.7);
        Thread.sleep(2000);
        linkage1.setPosition(0);

    }
}
