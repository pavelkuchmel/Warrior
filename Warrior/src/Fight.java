import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Fight {

    public static void main(String[] args) {
        Paladin p = new Paladin("Paladin");
        Knight k = new Knight("Knight", 100, 10, 1, 10000);
        for (;;){
            System.out.println("\n\n\n\n");
            System.out.println("---------------------------------------------");
            System.out.println(k.getActionInfoUp());
            k.cleanActionInfoUp();
            show(k, p);
            k.takeHit(p);
            System.out.println(k.getActionInfoDown());
            k.cleanActionInfoDown();
            System.out.println("---------------------------------------------");
            timer("---------------------------------------------");
            if (k.isAlive()) break;
            System.out.println("\n\n\n\n");
            System.out.println("---------------------------------------------");
            System.out.println(p.getActionInfoUp());
            p.cleanActionInfoUp();
            show(k, p);
            p.takeHit(k);
            System.out.println(p.getActionInfoDown());
            p.cleanActionInfoDown();
            System.out.println("---------------------------------------------");
            timer("---------------------------------------------");
            if (p.isAlive()) break;
        }
    }
    static void show(Warrior objectKnight, Warrior objectPaladin){
        if(objectKnight.getHp() == 100.0 && objectPaladin.getHp() == 100.0)System.out.println(objectKnight.getName()+" HP: "+objectKnight.getHp()+"     ---    "+objectPaladin.getName()+" HP: "+objectPaladin.getHp());
        else if(objectKnight.getHp() < 100.0 && objectPaladin.getHp() < 100.0)System.out.println(objectKnight.getName()+" HP: "+objectKnight.getHp()+"      ---     "+objectPaladin.getName()+" HP: "+objectPaladin.getHp());
        else if(objectKnight.getHp() < 100.0 || objectPaladin.getHp() < 100.0)System.out.println(objectKnight.getName()+" HP: "+objectKnight.getHp()+"     ---     "+objectPaladin.getName()+" HP: "+objectPaladin.getHp());
    }

    static void timer(String text){
        ArrayList<Character> moveString = new ArrayList<>();
        int i = 0;
        for (;;i++){
            try {
                moveString.add(text.charAt(i));
            }catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        for (int j = 0;j<i;j++){
            System.out.print(moveString.get(j));
            try {TimeUnit.MILLISECONDS.sleep(220);}catch (InterruptedException e){}
        }
        /*for (int l = 0;l<3;l++){
            System.out.print(".");
            try {TimeUnit.MILLISECONDS.sleep(1000);}catch (InterruptedException e){}
        }*/
        System.out.println();
    }
}