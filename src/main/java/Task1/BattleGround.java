package Task1;

import Task1.Enemies.Enemy;
import Task1.Enemies.Orck;
import Task1.Enemies.Paladin;
import Task1.Heroes.Archer;
import Task1.Heroes.Mage;
import Task1.Heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior");
        Archer archer = new Archer("Archer");
        Mage mage = new Mage("Mage");
        Enemy enemy = new Enemy(20);
        Paladin paladin = new Paladin(19);
        Orck orck = new Orck(25);


        mage.attackEnemy(enemy);
        enemy.isAlive();
        mage.attackEnemy(paladin);
        paladin.isAlive();
        mage.attackEnemy(orck);
        orck.isAlive();

        orck.killHero(archer);
        paladin.magicAttack(warrior);
        warrior.getHealth();


    }
}
