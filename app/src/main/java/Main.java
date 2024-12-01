import jp.ac.uryukyu.ie.e245719.Enemy;
import jp.ac.uryukyu.ie.e245719.Hero;
import jp.ac.uryukyu.ie.e245719.Warrior;

public class Main {

    public static void main(String[] args){
        
        Hero hero = new Warrior("戦士", 10, 5);
        System.out.println(hero);

        System.out.println(hero.defaultToString());
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            //hero.attackWithWeponSkill(enemy);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}