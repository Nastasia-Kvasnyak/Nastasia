package homework.lab3.heroes_nastasia;

import homework.lab3.utils.RandomUtil;

public class King implements Hero, Create, Battle{
    private final String name;
    private int hp;
    private int power;

    public King() {
        this.name = RandomUtil.randomName();
        int n = RandomUtil.between(5,15);
        setHp(n);
        int m = RandomUtil.between(5,15);
        setPower(m);
    }

    @Override
    public Hero create() {
        System.out.printf("A new KING %s was created\n",getName());
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
        return "King{" +
                "name='" +getName() + '\'' +
                ", hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    @Override
    public void kick(Hero enemy) {
        Knight.Weapon(enemy);
    }
}
