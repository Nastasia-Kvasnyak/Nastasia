package homework.lab1.lab1_2;

public class NastasiaSuperIntegerList implements SuperIntegerList {
    private int[] arr;
    private int len;

    public NastasiaSuperIntegerList(){
        arr = new int[]{1, 2, 3, 4, 5};
        len = arr.length;
    }

    @Override
    public void add(int number) {
        len++;
        int[] arr1 = new int[len];
        arr1[len-1] = number;
        System.arraycopy(arr, 0, arr1, 0, len - 1);
        arr = arr1;
    }

    @Override
    public void removeByIndex(int index) {
        if (index == 0){
            len--;
            int[] arr1 = new int[len];
            System.arraycopy(arr, 1, arr1, 0, len + 1 - 1);
            arr = arr1;
        }
        if (index == len){
            len--;
            int[] arr1 = new int[len];
            if (len - 1 >= 0) System.arraycopy(arr, 0, arr1, 0, len - 1);
            arr = arr1;
        }
        if ((index < len) && (index > 0)) {
            len--;
            int[] arr1 = new int[len];
            int k = 0;
            for (int i = 0; i < len; i++) {
                if (i == index) {
                    k++;
                    arr1[i] = arr[k];
                    k++;
                }
                else {
                    arr1[i] = arr[k];
                    k++;
                }
            }
            arr = arr1;
        }
    }

    @Override
    public void removeByValue(int value) {
        for (int i = 0; i<len; i++){
            if (arr[i] == value){
                len--;
                int[] arr1 = new int[len];
                System.arraycopy(arr, 0, arr1, 0, i);
                arr1[i] = arr[i+1];
                if (len - (i + 1) >= 0) System.arraycopy(arr, i + 1 + 1, arr1, i + 1, len - (i + 1));
                arr = arr1;
                break;
            }
        }

    }

    @Override
    public int get(int index) {
        int r = 0;
        for (int i = 0; i<len; i++){
            if (i == index){
                r = arr[i];
            }
        }
        return r;
    }

    @Override
    public void printAll() {
        String output = "";
        System.out.println("Printing all");
        for (int i = 0; i < len; i++) {
            System.out.println(""+arr[i]);
        }
        }


    public static void main(String[] args) {
        NastasiaSuperIntegerList l = new NastasiaSuperIntegerList();
        l.printAll();
        l.add(6);
       // l.removeByIndex(2);
       // l.removeByValue(3);
        System.out.println("You get "+l.get(2));
        l.printAll();

    }
}
