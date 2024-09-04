package Task1.Heroes;

import Task1.Enemies.Enemy;

public abstract class Hero {
    private String name;
    private int damage;
    private int health;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);
}
