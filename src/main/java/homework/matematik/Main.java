package homework.matematik;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Examenator examenator = GetExamenator.getExamenator();
      //  Examenator examenator = new SumExamenator();
        Exercise exercise = examenator.generate();
        PrintExam.print(exercise);
        System.out.println("List of exercises");
        Examenator examenatorList = GetExamenator.getExamenator();
        List<Exercise> examList = examenatorList.generate(5);
        PrintExam.printList(examList);
        }

    }

