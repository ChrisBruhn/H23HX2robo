package H23HX2Prog;
import robocode.*;

import java.awt.Color;
import java.awt.Graphics2D;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Thomas - a robot by (your name here)
 */
public class Thomas extends JuniorRobot
{
	/**
	 * run: Thomas's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(0xFF00FF, 0xFF00FF, 0xFF00FF, yellow, black);

		// Robot main loop
		while(true) {
			ahead(100);
			turnRight(90);
		}
	}

	public void onScannedRobot() {
		turnTo(scannedAngle);
		fire(3);
	}

	public void onHitByBullet() {
		turnTo(hitByBulletAngle);
	}
	
	public void onHitWall() {
		back(10);
		turnRight(hitWallAngle);
	}	
	
	public void onPaint(Graphics2D g) {
		//Virker ikke?
		g.setColor(Color.RED);
		g.drawLine(robotX, robotY, 200, 200);
	}	
}
