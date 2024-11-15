package jp.ac.uryukyu.ie.e245719;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }


    /**
     * 敵の名前を取得します。
     * @return 敵の名前
     */
    public String getName() {
        return this.name;
    }

    /**
     * 敵の名前を設定します。
     * @param name 設定する敵の名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 敵のHPを取得します。
     * @return 現在の敵のHP
     */
    public int getHitPoint() {
        return this.hitPoint;
    }

    /**
     * 敵のHPを設定します。
     * @param hitPoint 設定する敵のHP
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * 敵の攻撃力を取得します。
     * @return 現在の敵の攻撃力
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * 敵の攻撃力を設定します。
     * @param attack 設定する敵の攻撃力
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * 敵の生死状態を取得します。
     * @return trueの場合は敵が死亡、falseの場合は生存
     */
    public boolean isDead() {
        return this.dead;
    }




    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if (!this.dead){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
            hero.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}