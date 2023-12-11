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
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(true) {
			back(10);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(10);
		turnRight(hitWallAngle);
		//out.println("I HIT A WALL");
	}	
	
	public void onPaint(Graphics2D g) {
		System.out.println("HELLO");
		//Rules.getBulletSpeed();
		g.setColor(new Color(0xff, 0xff, 0x00, 0x80));
		g.drawLine(robotX, robotY, 200, 200);
	}	
}
