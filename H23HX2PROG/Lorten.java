package Lorten;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Minførsterobot - a robot by (Niklas)
 */
public class Lorten extends JuniorRobot
{
	/**
	 * run: Minførsterobot's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(brown, brown, brown, brown, brown);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnAheadLeft(50,60);
			turnAheadLeft(50,90);
			turnAheadLeft(50,60);
			turnAheadLeft(50,90);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		fire(2);
		fire(2);
		fire(2);
		fire(2);
		fire(2);
		fire(2);
			
}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		turnAheadLeft(60,80);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
ahead(100);		

		System.out.println();
	}	
}
