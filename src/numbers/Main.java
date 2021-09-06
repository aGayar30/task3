package numbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1000);
        }
        java.util.Arrays.sort(array);
        for (int element : array)
            System.out.println(element);
    }
}
