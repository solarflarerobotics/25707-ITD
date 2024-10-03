package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.hardware.limelightvision.LLResult;
@Autonomous
public class SampleLocalizationTets extends LinearOpMode {
    LLResult result;
    double tx;
    double ty;
    double optimalTx = 0;
    double optimalTy = 0;
    double txError;
    double tyError;
    Limelight3A limelight;
    double kp = 0.01;
    double txMovement;
    double tyMovement;
    public void runOpMode(){
        limelight = hardwareMap.get(Limelight3A.class, "limelight");
        limelight.pipelineSwitch(7);
        while (opModeIsActive()){
            if (result.isValid()){
                tx = result.getTx();
                ty = result.getTy();
                telemetry.addData("tx",tx);
                telemetry.addData("ty",ty);
                txError = -(optimalTx - tx);
                tyError = -(optimalTy -ty);
                txMovement = txError * kp;
                tyMovement = tyError * kp;
                //drivetrain.strafeTo(drivetrain.currentPosX + txMovement, drivetrain,currentPosY + tyMovement)
                telemetry.update();
            }

        }
    }
}