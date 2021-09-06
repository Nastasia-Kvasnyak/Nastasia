package homework.matematik;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationExamenator implements Examenator {
    private int ans;
    private MultiplicationCreator multiplicationCreator = new MultiplicationCreator();
    private int a;
    private int b;

    public MultiplicationExamenator() {
        a = multiplicationCreator.getA();
        b = multiplicationCreator.getB();
        ans = a*b;
    }

    @Override
    public Exercise generate() {
        return new Exercise(a, b, ans,Operation.MULT);
    }

    @Override
    public List<Exercise> generate(int amount) {
        List<Exercise> list = new ArrayList<>();
        for (int i = 0; i< amount;i++){
            MultiplicationExamenator multiplicationExamenator = new MultiplicationExamenator();
            list.add(multiplicationExamenator.generate());
        }
        return list;
    }
}
