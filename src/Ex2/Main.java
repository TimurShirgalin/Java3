package Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"Привет", "медвед!", "как", "дела?"};
        createArrayList(array);
    }

    public static void createArrayList(String[] arr){
        ArrayList<String> newArrayList = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(newArrayList.toString());
    }
}
