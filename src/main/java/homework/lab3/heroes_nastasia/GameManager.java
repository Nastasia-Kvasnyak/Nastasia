package homework.lab3.heroes_nastasia;

import homework.lab3.utils.RandomUtil;

import java.util.List;

public class GameManager {
    public static void main(String[] args) {
        // 1. Создать двух рандомных героев
        List<Create> l1 = List.of(new Hobbit(), new Elf(), new Knight(), new King());
        Hero h1 = RandomUtil.getRandomElement(l1).create();
        List<Create> l2 = List.of(new Hobbit(), new Elf(), new Knight(), new King());
        Hero h2 = RandomUtil.getRandomElement(l2).create();
        System.out.println("");
        // 2. Сражение
        if ((h1 instanceof Hobbit)&&(h2 instanceof Hobbit)){
            System.out.println("Вселенский плач");
        }else if ((h1 instanceof Hobbit)||(h2 instanceof Hobbit)) {
            System.out.println("Поплакали и разошлись");
        }else{
            while ((h1.getHp() > 0) && (h2.getHp() > 0)) {
                h1.kick(h2);
                h2.kick(h1);
            }
        }
    }
}
