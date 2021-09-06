package homework.lab3.heroes_nastasia;

import homework.lab3.utils.RandomUtil;

public class Hobbit implements Hero, Create,Battle{
    private final String name;
    private int hp;
    private int power;

    public Hobbit() {
        this.name = RandomUtil.randomName();
        setHp(3);
        setPower(0);
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
    public Hero create() {
        System.out.printf("A new HOBBIT %s was created\n",getName());
        return this;
    }

    @Override
    public String toString() {
        return "Hobbit{" +
                "name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    @Override
    public void kick(Hero enemy) {
        System.out.print("HOBBIT: crying sounds((( ");
        System.out.println(enemy.getClass().getSimpleName()+", you made me cry");
    }

    @Override
    public void die() {
        System.out.println("It was a nice life of "+
                this.getClass().getSimpleName()+" "+getName());
    }
}
