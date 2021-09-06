package homework.matematik;

import homework.lab3.utils.RandomUtil;

import java.util.List;

public class GetExamenator {
    public static Examenator getExamenator(){
        List<Examenator> examenators = List.of(new SumExamenator(),new SubtractionExamenator(),
                new MultiplicationExamenator(), new DivisionExamenator());
        return RandomUtil.getRandomElement(examenators);
    }
}
