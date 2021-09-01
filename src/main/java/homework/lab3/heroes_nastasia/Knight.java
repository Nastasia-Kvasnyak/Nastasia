package homework.lab3.heroes_nastasia;

import homework.lab3.utils.RandomUtil;

public class Knight implements Hero, Create, Battle{
    private final String name;
    private int hp;
    private int power;

    public Knight() {
        this.name = RandomUtil.randomName();
        int n = RandomUtil.between(2,12);
        setHp(n);
        int m = RandomUtil.between(2,12);
        setPower(m);
    }

    @Override
    public Hero create() {
        System.out.printf("A new KNIGHT %s was created\n",getName());
        System.out.printf("He's power is %d and hp is %d\n",getPower(),getHp());
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void die() {
        System.out.println("It was a nice life of "+this.getClass().getSimpleName()+
                " "+getName());
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    @Override
    public void kick(Hero enemy) {
        Weapon(enemy);
    }

    public static void Weapon(Hero enemy) {
        int n = RandomUtil.between(0,enemy.getPower());
        enemy.setHp(enemy.getHp()-n);
        System.out.printf(enemy.getClass().getSimpleName()+" "+enemy.getName()+
                " lost %d of his hp, now it's %d\n",n,enemy.getHp());
        if (enemy.getHp() == 0){
            enemy.die();
        }
    }
}
