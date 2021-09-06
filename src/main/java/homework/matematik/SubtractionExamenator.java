package homework.matematik;

import java.util.ArrayList;
import java.util.List;

public class SubtractionExamenator implements Examenator {
    private int ans;
    private SubtractionCreator subtractionCreator = new SubtractionCreator();
    private int a;
    private int b;


    public SubtractionExamenator() {
       a = subtractionCreator.getA();
       b = subtractionCreator.getB();
       ans = a-b;
    }

    @Override
    public Exercise generate() {
        return new Exercise(a, b, ans,Operation.SUB);
    }

    @Override
    public List<Exercise> generate(int amount) {
        List<Exercise> list = new ArrayList<>();
        for (int i = 0; i< amount;i++){
            SubtractionExamenator subtractionExamenator = new SubtractionExamenator();
            list.add(subtractionExamenator.generate());
        }
        return list;
    }
}
