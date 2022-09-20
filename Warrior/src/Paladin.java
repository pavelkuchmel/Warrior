import java.util.Random;
public class Paladin extends Warrior{
    public Paladin(){

    }
    public Paladin(String name){
        super(name);
    }
    public Paladin(String name, double hp, double damage, double arm, int agility){
        super(name);
        this.hp = hp;
        this.damage = damage;
        this.arm = arm;
        this.agility = agility;
    }
    @Override
    public double getArm() {
        if (super.getHp() <= 10.0) return 1.4*super.getArm();
        if (super.getHp() <= 30.0) return 1.3*super.getArm();
        if (super.getHp() <= 50.0) return 1.2*super.getArm();
        else return super.getArm();
    }

}

