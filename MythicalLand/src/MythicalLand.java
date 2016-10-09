
import java.util.Random;

public class MythicalLand {

    public static void main(String[] args) {

        Hero superLubo = new Hero("Lyubo", 10);

        Monster meca = new Monster(20, 30);
        Monster vushlio = new Monster(10, 5);
        Monster mravka = new Monster(0, 5);

        int turns = 0;
        boolean isHeroDead = false;

        Random rand = new Random();

        while (!(superLubo.hasCompletedLevel() || isHeroDead)) {
            superLubo.run();

            switch (turns) {
                case 3:
                    if (meca.attack(superLubo)) {
                        System.out.println("Baba meca killed " + superLubo.name);
                        isHeroDead = true;
                    }
                    break;
                case 12:
                    if (vushlio.attack(superLubo)) {
                        System.out.println("Kumcho vushlio killed " + superLubo.name);
                        isHeroDead = true;
                    }
                    break;
                case 10:
                    superLubo.sleep(10);
                    break;

                //case 1:
                //case 4:
                case 11:
                    if (!superLubo.trip()) {
                        System.out.println(superLubo.name + " killed himself with his feet.");
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
