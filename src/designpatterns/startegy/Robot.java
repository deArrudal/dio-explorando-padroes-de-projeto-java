package designpatterns.startegy;

public class Robot {

    private RobotBehavior behavior;

    public void setBehavior(RobotBehavior behavior) {
        this.behavior = behavior;
    }

    public void moveRobot() {
        behavior.move();
    }

}
