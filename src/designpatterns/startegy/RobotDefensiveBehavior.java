package designpatterns.startegy;

public class RobotDefensiveBehavior implements RobotBehavior {

    @Override
    public void move() {
        System.out.println("moving in a defensive manner ...");
    }

}
