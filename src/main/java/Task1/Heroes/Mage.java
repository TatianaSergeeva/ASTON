package Task1.Heroes;

import Task1.Enemies.Enemy;

public class Mage extends Hero {
    private int damage;
    private int health;

    public Mage(String name) {
        super(name);
        damage = 8;
        health = 17;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println("Маг атакует врага");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
