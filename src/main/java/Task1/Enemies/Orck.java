package Task1.Enemies;

import Task1.Heroes.Hero;

public class Orck extends Enemy {
    private int damage;

    public Orck(int health) {
        super(health);
        damage = 12;
    }
    public void killHero (Hero hero) {
        while (hero.getHealth() > 0) {
            attackHero(hero);
        }
        System.out.println(hero.getName() + " убит.");
    }

}
