package H23HX2PROG;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Debil - a robot by (your name here)
 */
public class Debil extends JuniorRobot
{
	/**
	 * run: Debil's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnGunTo(	hitByBulletAngle);	
            ahead(100);
            turnRight(90);
            ahead(100);
            turnLeft(190);
            ahead(100);
            turnRight(90);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		fire(10);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
			
			back(100);
            turnRight(90);
            back(100);
            turnLeft(190);
            back(100);
            turnRight(90);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		 turnRight(90);
	}	
}
