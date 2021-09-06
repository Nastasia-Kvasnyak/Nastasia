package homework.matematik;

import java.util.Random;

public class MultiplicationCreator implements ExerciseCreator{
    private Random random = new Random();
    @Override
    public int getA() {
        return random.nextInt(10);
    }

    @Override
    public int getB() {
        return random.nextInt(10);
    }
}
