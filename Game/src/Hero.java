
public class Hero {
    
    //fields
    static int MAX_HEALTH_POINTS = 100;
    static int MAX_ENERGY = 100;
    
    String name;
    int healthPoints;
    int energy;
    private int gold;
    int progress;
    int power;
    
    //constructor
    public Hero(String name, int power) {
        this.name = name;
        this.healthPoints = MAX_HEALTH_POINTS;
        this.energy = MAX_ENERGY;
        this.gold = 0;
        this.progress = 0;
        this.power = power;        
    }
    
    //methods
    public void run() {
        if (this.energy >= MAX_HEALTH_POINTS) {
            this.energy -= MAX_ENERGY;
            this.progress += 5;
        } else {
            System.out.println("I can't run!");
        }
    }
    
    public void walk() {
        this.progress += 2;
    }
    
    public void sleep(int price) {
        if (this.gold < price) {
            System.out.println("Sorry, no gold!");
        } else {
            this.gold -= price;
            this.energy += MAX_ENERGY;
            this.healthPoints += MAX_HEALTH_POINTS;
        }
    }

    public void increaseGold(int bounty) {
        if(bounty < 0){
            System.out.println("Error!");
        }
        this.gold += bounty;
    }

    boolean hasCompletedLevel() {
        return progress >= 100;
    }

    boolean trip() {
       if (this.healthPoints <= 10) {
            return false;
       }
       this.healthPoints -= 10;
       this.progress = Math.max(this.progress - 2, 0);
       return true;
    }
    
    private void setGold(int gold){
        this.gold = gold;
    }
    
    public int getGold(){
        return gold;
    }
}
