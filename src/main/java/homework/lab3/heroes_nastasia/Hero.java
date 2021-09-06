package homework.lab3.heroes_nastasia;

public interface Hero extends Battle {
    String getName();
    int getHp();
    int getPower();
    void setHp(int hp);
    void setPower(int power);
    void die();

}
