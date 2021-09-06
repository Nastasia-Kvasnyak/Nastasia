package homework.matematik;

import java.util.List;

public interface Examenator {
    Exercise generate();
    List<Exercise> generate(int amount);
}
