package homework.matematik;

import java.util.ArrayList;
import java.util.List;

public class SumExamenator implements Examenator {
    private int ans;
    private SumCreator sumCreator = new SumCreator();
    private int a;
    private int b;

    public SumExamenator() {
        a = sumCreator.getA();
        b = sumCreator.getB();
        ans = a+b;
    }

    @Override
    public Exercise generate() {
        return new Exercise(a, b,ans,Operation.SUM);
    }

    @Override
    public List<Exercise> generate(int amount) {
        List<Exercise> list = new ArrayList<>();
        for (int i = 0; i< amount;i++){
            SumExamenator sumExamenator = new SumExamenator();
            list.add(sumExamenator.generate());
        }
        return list;
    }
}
