package H23HX2PROG;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html
//SimSim - a robot by (Simon)

public class SimSim extends JuniorRobot
{
//Nakker lige noget kode fra "Tracker"
	int count = 0; 
	int gunTurn; 
	int damboost = 0;

    public void run() {
        setColors(black, red, orange, yellow, red);
		gunTurn = 10;
		
        while (true) {
			turnRight(gunTurn);
			count = count + 1;		
			if (count > 0) {
				gunTurn = -10;
			}
			if (count > 36) {
				gunTurn = 10;
			}
			if (count > 72) {
				count = 0;
			}
		}
	}

    public void onHitByBullet() {
        turnTo(hitByBulletAngle);
    }

    public void onScannedRobot() {
		count = 0;
		 if (scannedVelocity == 0) {
			 damboost = 7;
		 }
		 else {
			 damboost = 0;
		 }
        if (scannedDistance < 20) {
            turnTo(scannedAngle);
            fire(6 + damboost);
        }
        if (scannedDistance < 200) {
            turnTo(scannedAngle);
            fire(1 + damboost);
        } 
		 else {
            turnTo(scannedAngle);
            ahead(200);
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


