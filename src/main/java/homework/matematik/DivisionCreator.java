package homework.matematik;

import java.util.Random;

public class DivisionCreator implements ExerciseCreator{
    private Random random = new Random();
    private int a;
    @Override
    public int getA() {
        a = random.nextInt(10);
        return a;
    }

    @Override
    public int getB() {
        while (true){
            int b = random.nextInt(10);
            if ((b!=0)&&(a%b==0)){
                return b;
            }
        }
    }
}
