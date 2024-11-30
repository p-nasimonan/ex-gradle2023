package jp.ac.uryukyu.ie.e245719;

public class Enemy extends LivingThing {
    public Enemy(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        super.wounded(damage);
        if (this.isDead()) {
            System.out.printf("モンスター%sは倒れた。\n", this.getName());
        }
    }
}
