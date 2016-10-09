
import java.util.Random;


public class Game {
    
    public static void main(String[] args) {
        
        //create objects
        Hero superMan = new Hero("Lyubo", 10);
        Monster meca = new Monster(20, 30);
        Monster vulcho = new Monster(10, 5);
        Monster mravka = new Monster(0, 5);
        
        int turns = 0;
        boolean isHeroDead = false;
        
        Random rand = new Random();
        
        while (!(superMan.hasCompletedLevel() || isHeroDead)) {
            superMan.run();
            
            switch (turns) {
                case 3:
                    if (meca.attack(superMan)) {
                        System.out.println("Baba meca killed " + superMan.name);
                        isHeroDead = true;
                    }
                    break;
                case 12:
                    if (vulcho.attack(superMan)) {
                        System.out.println("Kumcho vulcho killed " + superMan.name);
                    }
                    break;
                case 10:
                    superMan.sleep(10);
                    break;
                case 11:
                    if(!superMan.trip()) {
                        System.out.println(superMan.name + " killed himself with his feet.");
                        isHeroDead = true;
                    }
                    break;
            }
            turns++;
        }
        
        if (!isHeroDead) {
            System.out.println("Bam bam bam! Fireworks and champagne! Completed in " + turns + " turns.");
        }
        
    }
    
}
