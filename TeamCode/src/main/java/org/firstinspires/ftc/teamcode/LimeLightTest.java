package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.LLResultTypes;
import com.qualcomm.hardware.limelightvision.LLStatus;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.Pose3D;

import java.util.List;

@TeleOp
public class LimeLightTest extends LinearOpMode {
    double tx;
    double ty;
    private Limelight3A limelight;
    @Override
    public void runOpMode() {

        limelight = hardwareMap.get(Limelight3A.class, "limelight");
        telemetry.setMsTransmissionInterval(11);
        limelight.pipelineSwitch(7);
        waitForStart();

        limelight.start();

        while (opModeIsActive()){

            LLResult result = limelight.getLatestResult();

            if (result.isValid()){
                tx=result.getTx();
                ty=result.getTy();
                telemetry.addData("tx", tx);
                telemetry.addData("ty", ty);
                telemetry.update();
            }
        }
    }
}

