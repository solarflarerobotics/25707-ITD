package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class MetaTagLocalizationTets extends LinearOpMode {
    public void runOpMode(){
        Limelight3A limelight = hardwareMap.get(Limelight3A.class, "limelight");
        limelight.pipelineSwitch(6);
        while(opModeIsActive()){
            LLResult result = limelight.getLatestResult();
            if (result.isValid()){
                telemetry.addData("position", result.getBotpose());
                telemetry.update();
            }
            else{
                telemetry.addLine("no result very sad ur bad at coding");
                telemetry.update();
            }
        }
    }
}

