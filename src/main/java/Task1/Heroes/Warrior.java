package Task1;

public class Warrior extends Hero{

    private int damage = 10;
    public Warrior(String name) {
        super(name);
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
