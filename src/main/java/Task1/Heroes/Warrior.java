package Task1.Heroes;

import Task1.Enemies.Enemy;

public class Warrior extends Hero{

    private int damage;
    private int health;
    public Warrior(String name) {
        super(name);
        damage = 10;
        health = 15;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин атакует врага");
        enemy.takeDamage(getDamage());

    }
}
