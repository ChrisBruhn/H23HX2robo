package H23HX2PROG;
import robocode.*;

public class Raphtalia4Ever extends JuniorRobot
{
	public void run() {
		setColors(green, purple, brown, yellow, black);
		while(true) {
			ahead(100);
			turnRight(90);
		}
	}

	public void onScannedRobot() {
		turnTo(scannedAngle);
		fire(10);
		ahead(20);
	}
	
	public void onHitByBullet() {
		back(10);
	}
	
	public void onHitWall() {
		back(20);
		turnRight(90);
	}	
}
//adada