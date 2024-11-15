package jp.ac.uryukyu.ie.e245719;

/**
 * ヒーロークラス。
 * ヒーローの名前、HP（ヒットポイント）、攻撃力、死んでるか、敵への攻撃や
 * 被ダメージ時の処理を行います。
 * String name; //敵の名前
 * int hitPoint; //敵のHP
 * int attack; //敵の攻撃力
 * boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
/**
 * ヒーロークラス。
 */
public class Hero {
    private String name;     // ヒーローの名前
    private int hitPoint;    // ヒーローのHP
    private int attack;      // ヒーローの攻撃力
    private boolean dead;    // ヒーローの生死状態。true=死亡。

    /**
     * コンストラクタ。ヒーローの名前、最大HP、攻撃力を指定し、初期状態を設定します。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHPの初期値
     * @param attack ヒーローの攻撃力の初期値
     */
    public Hero(String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    //GetterとSetter===============================

    /**
     * ヒーローの名前を取得します。
     * @return ヒーローの名前
     */
    public String getName() {
        return name;
    }

    /**
     * ヒーローの名前を設定します。
     * @param name 設定するヒーローの名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ヒーローのHPを取得します。
     * @return 現在のヒーローのHP
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * ヒーローのHPを設定します。
     * @param hitPoint 設定するヒーローのHP
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * ヒーローの攻撃力を取得します。
     * @return 現在のヒーローの攻撃力
     */
    public int getAttack() {
        return attack;
    }

    /**
     * ヒーローの攻撃力を設定します。
     * @param attack 設定するヒーローの攻撃力
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * ヒーローの生死状態を取得します。
     * @return trueの場合はヒーローが死亡、falseの場合は生存
     */
    public boolean isDead() {
        return dead;
    }


    

    //==============================================

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if(hitPoint < 0) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
