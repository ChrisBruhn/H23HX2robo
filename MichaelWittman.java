package H23HX2PROG;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * MichaelWittman - a robot by (your name here)
 */
public class MichaelWittman extends JuniorRobot
{
	/**
	 * run: MichaelWittman's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(black,orange,green,red,yellow);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(125);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
			turnAheadRight(1,90);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		fire(3);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(20);
		ahead(30);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(10);
	}	
}
