package org.usfirst.frc7913.Main.subsystems;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class Intake extends Subsystem {
    private PWMVictorSPX motor;
    private PWMVictorSPX attachmentMotor;

    public Intake() {
        motor = new PWMVictorSPX(4);
        attachmentMotor = new PWMVictorSPX(8);
    }

    public void disableMotor() {
        setSpeed(0);
    }

    public void setSpeed(double speed) {
        motor.set(speed);
        attachmentMotor.set(speed);
    }

    public Command start(){
        setSpeed(-0.70);
        return null;
    }

    public Command stop(){
        setSpeed(0);
        return null;
    }

    @Override
    protected void initDefaultCommand() {
    }
}
