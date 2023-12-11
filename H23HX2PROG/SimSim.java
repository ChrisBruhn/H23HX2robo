package H23HX2PROG;
import robocode.*;
//boolean wall1 = false;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html
//SimSim - a robot by (Simon)

public class SimSim extends JuniorRobot
{
	/**
	 * run: SimSim's default behavior
	 */
	public void run() {
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(black, red, orange, yellow, red);
		while(true) {
			ahead(60);
			turnRight(6);
			// Robotten skal gemme sig i et hjørne og skyde alt hvad den ser. 
			// Den bevæger sig når den bliver ramt så den forhåbelig kun bliver
			// ramt en gang.
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {
		fire();
		// Den skal lave to målinger for at finde ud af hvilke koordinater
		// robotten hat. Det kræver dog også at jeg finder hastigheden af kuglen
		// og afstaden til robotten.
	}

	public void onHitByBullet() {
		back(10);
		turnLeft(hitByBulletAngle);
		// Den skal kigge rundt om det område for at se om den kan finde robotten
		// der ramte den. Den kører også hen af en af murne og bliver der
		// et stykke tid
	}
	
	public void onHitWall() {
		back(20);
		turnLeft(120);
		// Den rammer den ene mur en gang drejer og rammer dan anden mur. 
		// Udover det behøver jeg ikke at vide hvornår den rammer muren
	}	
}
