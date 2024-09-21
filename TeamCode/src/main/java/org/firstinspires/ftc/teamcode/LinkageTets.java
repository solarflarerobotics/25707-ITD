package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp
public class LinkageTets extends LinearOpMode{
    @Override
    public void runOpMode(){
        Servo linkage1 = hardwareMap.servo.get("linkage1");
        linkage1.setPosition(0.7);
        if(gamepad1.a){
            linkage1.setPosition(0);
        }
    }
}
