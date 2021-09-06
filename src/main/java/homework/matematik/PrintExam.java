package homework.matematik;

import java.util.List;

public class PrintExam {

    public static void print(Exercise exercise){
        System.out.println(exercise.getA()+""+
                exercise.getOperation().toString()+" "+exercise.getB()+" ="+"    ("+exercise.getAns()+")");
    }
    public static void printList(List<Exercise> list){
        for (Exercise exercise : list) {
            System.out.println(exercise.getA()+""+exercise.getOperation().toString()+" "+exercise.getB()+" ="+"    ("+exercise.getAns()+")");
        }
    }
}
