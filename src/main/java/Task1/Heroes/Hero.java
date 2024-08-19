package Task1;

public abstract class Hero {
    private String name;
    private int damage;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void attackEnemy(Enemy enemy);
}
