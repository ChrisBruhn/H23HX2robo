package H23HX2PROG;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Sus - a robot by (your name here)
 */
public class Sus extends JuniorRobot
{
	/**
	 * run: Sus's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(purple, blue, white, yellow, black);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnLeft(90);
			ahead(100);
			turnRight(180);
			
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
		turnTo(scannedAngle);
		fire(4);
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		turnBackLeft(100,45);
		
		
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		
		turnBackRight(100,180);
	}	
	/**
	 * hitWallAngle: What angle the tank is relative to the wall
	 */
/*	public int hitWallAngle(){
		
	}*/
}
