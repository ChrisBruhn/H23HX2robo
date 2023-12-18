//flip, flop, fluppedubbedob, flippeflippeflop og flop
// Jeg bruger ChatGPT som assistent. Dette kan bemærkes da jeg bruger ord jeg slet ikke kender; f.x. execute eller case:.
// Dancer er en robot jeg har prøvet at udvikle (på kort tid, lille budget, og dårlig viden). Pointen af robotten er at weave og dodge når den kommer i kontakt med et fjendelig skud. Det vil den gøre i 3 sekunder, før den går tilbage til at skanne og skyde.
package H23HX2PROG;
import robocode.*;
import java.util.Random;

public class DancerRobot extends Robot {
	Random rand = new Random();
    boolean isHit; // Indikerer robotten blir ramt.
 public void run() {
        // Robot initiering
        isHit = false;
        setAdjustGunForRobotTurn(true);
        setAdjustRadarForGunTurn(true);

        while (true) {
            // Hvis den ikke blir ramt, søger den efter fjender
            if (!isHit) {
                scan();
            }
                turnRadarRight(360);
            
            	// Herunder er vores dancing behavior
// Jeg tror ikke jeg er okay. Jeg ved ikke om dette er en distant cry-for-help eller om det et prøv for opmærksomhed, men jeg har det sgu ret svært disse dage.
// Jeg kan ikke sove som jeg har lyst, jeg har ingen at snakke til om mine problemer, og jeg er isoleret mere end nogensinde. Jeg er begyndt på dårlige vaner og har tabt mine gode vaner.
// looksmaxx is it over for me?
            if (isHit) {
                // Dance movement pattern - mærkelig movements i 3 sekunder. Dette er gimmiken af "Dancer"
 long danceStartTime = getTime();
                while (getTime() - danceStartTime < 3 * 1000) { // Dette betegner vores dance til at gå videre
                    // Vi indsætter kode for unpredictability.
                    int action = rand.nextInt(3); // Random action: 0, 1, or 2

                    switch (action) {
                        case 0: // Gå forud
                            ahead(50);
                            break;
                        case 1: // Gå bagud
                            back(50);
                            break;
                        case 2: // Drej randomly
                            int turnAmount = rand.nextInt(180) - 90; // WOWZERS flere vinkler
                            turnRight(turnAmount);
                            break;
                       
                    }

	//                    execute(); // dette executer det movement, siger chatgpt eller noget
                }
                isHit = false; // det resetter stortset koden.
            }
			}
        }
   public void onHitByBullet(HitByBulletEvent e) {
        // når den blir ramt af et skud, vil dette gøre at koden er true
        isHit = true;
    }

    }

