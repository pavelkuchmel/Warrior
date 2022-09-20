public class Warrior {
    protected String name;  //по-умолчанию Warrior
    protected double hp;   //по-умолчанию 100.0
    protected double damage;   //по-умочанию 10.0
    protected double arm;  //по-умолчанию 1.0
    protected int agility; //по-умолчанию 100 = 1%
    protected String actionInfoUp = "-                                           -";
    protected String actionInfoDown = "-                                           -";
    public Warrior(){
        this.name = "Warrior";
        this.damage = 10.0;
        this.hp = 100.0;
        this.arm = 1.0;
        this.agility = 100;
    }
    public Warrior(String name){
        this.name = name;
        this.damage = 10.0;
        this.hp = 100.0;
        this.arm = 1.0;
        this.agility = 100;
    }
    /*public Warrior (String name, double hp, double damage, double arm, int agility){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.arm = arm;
        this.agility = agility;
    }*/

    public String getActionInfoUp() {
        return actionInfoUp;
    }

    public void setActionInfoUp(String actionInfoUp) {
        this.actionInfoUp = actionInfoUp;
    }
    public void cleanActionInfoUp(){
        this.actionInfoUp = "-                                           -";
    }
    public String getActionInfoDown() {
        return actionInfoDown;
    }

    public void setActionInfoDown(String actionInfoDown) {
        this.actionInfoDown = actionInfoDown;
    }
    public void cleanActionInfoDown(){
        this.actionInfoDown = "-                                           -";
    }

    public void setAgility(int agility) { this.agility = agility; }
    public boolean getAgility() { return false; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public double getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }
    public double getArm () { return arm; }
    public double getHp() { return hp; }
    public void setHp(double hp) { this.hp = hp; }
    public boolean isAlive(){ return hp <= 0; }
    public void takeHit(Warrior objectName){
        setActionInfoDown("-           "+objectName.getName()+" attacks "+this.getName()+"          -");
        if (this.getAgility()) objectName.actionInfoUp = "-                Dodge a hit!                ";
      //if (this.getAgility()) actionInfoUp = "---------------------------------------------";
        else {
            this.setHp(Math.round(this.getHp() - objectName.getDamage() / this.getArm())*100.0/100.0);
        }
    }
}
