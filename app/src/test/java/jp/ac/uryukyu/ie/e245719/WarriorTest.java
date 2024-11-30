package jp.ac.uryukyu.ie.e245719;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class WarriorTest {
    @Test
    void main(){
        for (int i= 1; i<4; i++){
            System.out.printf("%d回目の戦闘\n-------------\n", i);
            Warrior warrior = new Warrior("戦士", 10, 5);
            Enemy enemy = new Enemy("スライム", 6, 3);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
            // スライムHP-ダメージ=残りHPで攻撃力5の150%は切り捨てで7なので、6-7=-1になることを期待
            assertEquals(-1, enemy.getHitPoint());
            System.out.println("戦闘終了");
    }
}
}
