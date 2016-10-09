
public class Hero {

    static int MAX_HEALTH_POINTS = 100;
    static int MAX_ENERGY = 100;

    String name;
    int healthPoints;
    int energy;
    private int gold;
    int progress;
    int power;

    Hero(String name, int power) {
        this.name = name;
        this.healthPoints = MAX_HEALTH_POINTS;
        this.energy = MAX_ENERGY;
        this.gold = 0;
        this.progress = 0;
        this.power = power;
    }

    void run() {
        if (this.energy >= 5) {
            this.energy -= 5;
            this.progress += 5;
        } else {
            System.out.println("Can't run, not enough energy.");
        }
    }

    void walk() {
        this.progress += 2;
    }

    void sleep(int price) {
        if (this.gold < price) {
            System.out.println("Sorry! No gold.");
        } else {
            this.gold -= price;
            this.energy = MAX_ENERGY;
            this.healthPoints = MAX_HEALTH_POINTS;
        }
    }

    boolean trip() {
        if (this.healthPoints <= 10) {
            return false;
        }

        this.healthPoints -= 10;

        this.progress = Math.max(this.progress - 2, 0);

        return true;
    }

    boolean hasCompletedLevel() {

        return progress >= 100;
    }

    public void increaseGold(int bounty) {
        if(bounty < 0){
            System.out.println("ERROR");
        }
        
        this.gold += bounty;
    }
    
    private void setGold(int gold){
        this.gold = gold;
    }
    
    public int getGold(){
        return gold;
    }

}
