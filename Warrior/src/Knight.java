import java.util.Random;
public class Knight extends Warrior {
    public Knight(){

    }
    public Knight(String name){
        super(name);
    }
    public Knight(String name, double hp, double damage, double arm, int agility){
        super(name);
        this.hp = hp;
        this.damage = damage;
        this.arm = arm;
        this.agility = agility;
    }
    @Override
    public double getDamage() {
        Random rdm = new Random();
        int bound = 1000;
        if (super.getHp() < 30.0) bound = 5000;
        int chance = rdm.nextInt(bound);
        if (chance <= 1000) {
            super.setActionInfoUp("-               Critical hit!               -");
            return 2*super.getDamage();
        }
        else return super.getDamage();
    }

    @Override
    public boolean getAgility() {
        Random rdm = new Random();
        int chance = rdm.nextInt(10000);
        if (chance <= super.agility) return true;
        return super.getAgility();
    }
}
