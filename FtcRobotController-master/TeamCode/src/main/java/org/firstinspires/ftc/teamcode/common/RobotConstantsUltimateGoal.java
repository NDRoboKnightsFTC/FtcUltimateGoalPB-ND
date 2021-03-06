package org.firstinspires.ftc.teamcode.common;

public class RobotConstantsUltimateGoal {

    public enum OpMode {
        RED_INSIDE, RED_OUTSIDE, BLUE_INSIDE, BLUE_OUTSIDE, TEST,
        TELEOP_AUTO_DRIVE // for use in TeleOp only - does not appear on the driver station
    }

    public enum TargetZone {
        TARGET_ZONE_A, TARGET_ZONE_B, TARGET_ZONE_C, TARGET_ZONE_NPOS
    }

    // Vumark identifiers
    public enum SupportedVumark {BLUE_TOWER_GOAL, RED_TOWER_GOAL, RED_ALLIANCE, BLUE_ALLIANCE, FRONT_WALL}

}
