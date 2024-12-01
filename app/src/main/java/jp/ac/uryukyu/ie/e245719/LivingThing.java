package jp.ac.uryukyu.ie.e245719;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    // 試しにドキュメントに書かれていたtoStringのメソッドを再現してみた。
    public String defaultToString() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }

    public boolean isDead() {
        return this.dead;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public int getAttack(){
        return this.attack;
    }
    public void attack(LivingThing opponent) {
        if (!this.isDead()) {
            int damage = (int) (Math.random() * this.getAttack());
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        this.hitPoint -= damage;
        if (this.hitPoint <= 0) {
            this.dead = true;
        }
    }
}
