package H23HX2PROG;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html
//SimSim - a robot by (Simon)

public class SimSim extends JuniorRobot
{
    public void run() {
        setColors(black, red, orange, yellow, red);
        while (true) {
			ahead(100);
			turnRight(200);
        }
    }

    public void onHitByBullet() {
        turnTo(hitByBulletAngle);
    }

    public void onScannedRobot() {
        if (scannedDistance < 20) {
            turnTo(scannedAngle);
            fire((scannedDistance-20)*-10);
        }
        if (scannedDistance < 300) {
            turnTo(scannedAngle + 10);
            fire(1);
        } else {
            turnTo(scannedAngle);
            ahead(100);
        }
    }

    public void onHitWall() {
        back(20);
        turnRight(120);
    }
	public void onHitRobot() {
		turnTo(hitRobotAngle);
	}
}
