package Task1.Enemies;

import Task1.Heroes.Hero;

public class Paladin extends Enemy {
    private int damage;

    public Paladin(int health) {
        super(health);
        damage = 10;
    }

    public void magicAttack(Hero hero) {
        attackHero(hero);
        attackHero(hero);

    }
}
