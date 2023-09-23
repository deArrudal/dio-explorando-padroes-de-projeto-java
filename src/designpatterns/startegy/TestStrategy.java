package designpatterns.startegy;

public class TestStrategy {
    public static void main(String[] args) {
        RobotBehavior normal = new RobotNormalBehavoir();
        RobotBehavior attack = new RobotAttackBehavior();
        RobotBehavior defensive = new RobotDefensiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.moveRobot();
        robot.setBehavior(attack);
        robot.moveRobot();
        robot.setBehavior(defensive);
        robot.moveRobot();

    }
}
