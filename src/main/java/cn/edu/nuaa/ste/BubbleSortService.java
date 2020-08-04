package cn.edu.nuaa.ste;

import java.util.Arrays;

public class BubbleSortService {
    public void sort(int array[]) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
            System.out.println("Bubble Sorting：" + Arrays.toString(array));
        }
    }
}
