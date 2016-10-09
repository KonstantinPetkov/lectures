public class Monster {
    int healthPoints;
    int bounty;
    int power;
    
    Monster(int bounty, int power){
        this.healthPoints = 30;
        this.bounty = bounty;
        this.power = power;
    }
    
    boolean attack(Hero hero){
        
        while(true){
            
            if(this.power >= hero.healthPoints){
                return true;
            } else{
                hero.healthPoints -= this.power;
            }
            
            if(hero.power >= this.healthPoints){
                hero.increaseGold(this.bounty);
                return false;
            } else{
                this.healthPoints -= hero.power;
            }
        }
        
    }
    
}
