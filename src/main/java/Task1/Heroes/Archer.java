package Task1.Heroes;

import Task1.Enemies.Enemy;

public class Archer extends Hero {
    private int damage;
    private int health;

    public Archer(String name) {
        super(name);
        damage = 12;
        health = 19;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Лучник атакует врага");
        enemy.takeDamage(getDamage());

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
