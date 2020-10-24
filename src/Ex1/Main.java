package Ex1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 10, 15, 20, 25};
        System.out.println(Arrays.toString(array));
        arrayChange(array,1,3);
    }
    public static void arrayChange(int[] array, int a, int b){
        int[] newArray = new int[5];
        for (int i = 0; i < array.length; i++) {
            if (i == a || i == b) {
                newArray[b] = array[a];
                newArray[a] = array[b];
            } else {
                newArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
