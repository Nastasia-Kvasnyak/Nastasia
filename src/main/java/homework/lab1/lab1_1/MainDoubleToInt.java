package homework.lab1.lab1_1;

/*
* переписать массив double в массив int
* */

import java.util.Arrays;

public class MainDoubleToInt {
    public static void main(String[] args) {
        double[] arr;
        arr = new double[10];
        int[] arrInt;
        arrInt = new int[10];
        String ans="";

        for (int i = 0; i < arr.length; i++) {
            double f = Math.random()/Math.nextDown(1.0);
            arr[i] = (1.0-f)+1000*f;
            arrInt[i] = (int) arr[i];
            ans += arr[i]+"\t"+arrInt[i]+"\n";
        }
        System.out.println("Double\t\t\t\tInteger\n");
        System.out.println(ans);
    }
}
