package homework.lab3.heroes_nastasia;

import homework.lab3.utils.RandomUtil;

public class Elf implements Hero, Create, Battle{
    private final String name;
    private int hp;
    private int power;

    public Elf() {
        this.name = RandomUtil.randomName();
        setHp(10);
        setPower(10);
    }

    @Override
    public Hero create() {
        System.out.printf("A new ELF %s was created\n",getName());
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
    public String toString() {
        return "Elf{" +
                "name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }

    @Override
    public void kick(Hero enemy) {
        if (enemy.getPower() <= this.getPower()){
            enemy.setHp(0);
            enemy.die();
        }
        else {
            enemy.setPower(enemy.getPower()-1);
            System.out.println(enemy.getClass().getSimpleName()+
                    enemy.getName()+
                    " lost 1 in power, now it's "+enemy.getPower());
        }
    }

    @Override
    public void die() {
        System.out.println("It was a nice life of "+this.getClass().getSimpleName());
    }
}
