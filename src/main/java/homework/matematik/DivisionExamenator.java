package homework.matematik;

import java.util.ArrayList;
import java.util.List;

public class DivisionExamenator implements Examenator {
    private int ans;
    private DivisionCreator divisionCreator = new DivisionCreator();
    private int a;
    private int b;

    public DivisionExamenator() {
        a = divisionCreator.getA();
        b = divisionCreator.getB();
        ans = a/b;
    }

    @Override
    public Exercise generate() {
        return new Exercise(a, b, ans,Operation.DIV);
    }

    @Override
    public List<Exercise> generate(int amount) {
        List<Exercise> list = new ArrayList<>();
        for (int i = 0; i< amount;i++){
            DivisionExamenator divisionExamenator = new DivisionExamenator();
            list.add(divisionExamenator.generate());
        }
        return list;
    }
}
