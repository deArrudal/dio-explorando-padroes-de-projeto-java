package designpatterns.startegy;

public class RobotAttackBehavior implements RobotBehavior {

    @Override
    public void move() {
        System.out.println("moving in an offensive manner ...");
        
    }
    
}
