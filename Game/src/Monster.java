
public class Monster {

    //fields
    int healthPoints;
    int bounty;
    int power;

    //constructor
    public Monster(int bounty, int power) {
        this.bounty = bounty;
        this.power = power;
        this.healthPoints = 30;
    }

    boolean attack(Hero hero) {
        while (true) {
            if (this.power >= hero.healthPoints) {
                return true;
            } else {
                hero.healthPoints -= this.power;
            }        

            if (hero.power >= this.healthPoints) {
                hero.increaseGold(this.bounty);
                return false;
            } else {
                this.healthPoints -= hero.power;
            }
        }
    }
}

