package homework.lab1.lab1_2_ArrayList;

import homework.lab1.lab1_2.SuperIntegerList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class NastasiaArrayList implements SuperIntegerList {
    private ArrayList<Integer> l;

    public NastasiaArrayList(){
        l = new ArrayList<Integer>();
        int[] arr = new int[]{1,2,3,4,5};
        for (int j : arr) {
            l.add(j);
        }
    }

    @Override
    public void add(int number) {
        l.add(number);
    }

    @Override
    public void removeByIndex(int index) {
        l.remove(index);
    }

    @Override
    public void removeByValue(int value) {
        int k;
        k = l.indexOf(value);
        l.remove(k);
    }

    @Override
    public int get(int index) {
       return l.get(index);
    }

    @Override
    public void printAll() {
        System.out.println(""+l);
    }

    public static void main(String[] args) {
        NastasiaArrayList n = new NastasiaArrayList();
        n.printAll();
        n.add(6);
        n.printAll();
        n.removeByIndex(0);
        n.printAll();
        n.removeByValue(4);
        n.printAll();
        System.out.println(""+n.get(2));
    }
}
