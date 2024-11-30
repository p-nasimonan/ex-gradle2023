package jp.ac.uryukyu.ie.e245719;

public class Hero extends LivingThing {
    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        super.wounded(damage);
        if (this.isDead()) {
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", this.getName());
        }
    }
}
