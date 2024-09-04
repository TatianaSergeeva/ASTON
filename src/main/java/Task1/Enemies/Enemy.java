package Task1.Enemies;

import Task1.Heroes.Hero;

public class Enemy implements Mortal {
    private int health;
    private int damage;

    public Enemy(int health) {
        this.health = health;
        damage = 8;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            return true;
        } else
            return false;
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Враг атакует " + hero.getName());
        hero.setHealth(hero.getHealth()-damage);
    }
}
